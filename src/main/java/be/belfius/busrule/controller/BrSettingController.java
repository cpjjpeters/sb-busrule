package be.belfius.busrule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.belfius.busrule.model.BrSetting;
import be.belfius.busrule.repository.BrSettingRepository;

@RestController
@RequestMapping("/brsetting")
public class BrSettingController {
	
	@Autowired
	private BrSettingRepository brSRep;
	
	@GetMapping("/all")
	public List<BrSetting> getAllBrSetting(){
		return brSRep.findAll();
	}

}
