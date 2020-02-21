package be.belfius.busrule.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.belfius.busrule.exception.ResourceNotFoundException;
import be.belfius.busrule.model.BusinessRule;
import be.belfius.busrule.repository.BusinessRuleRepository;

@RestController
@RequestMapping("/busrule")
public class BusinessRuleController {
//	 private Long id;
//	 private String bRuleId; 
//	 private String key;
//	 private String value;
	
	@Autowired
	private BusinessRuleRepository busruleRepository;
	
	//all
	@GetMapping("/all")
	public List<BusinessRule> getAllBusRules(){
		return busruleRepository.findAll();
	}
	//all
		@GetMapping("/allfor/{bRuleId}")
		public List<BusinessRule> getAllForBRuleId(@PathVariable String bRuleId){
			return busruleRepository.findAllfor(bRuleId);
		}
	//create
	@PostMapping("/save")
	public BusinessRule  createProbeer(@Valid @RequestBody BusinessRule entity){
			return busruleRepository.save(entity);
		}
		
		//update
	@PutMapping("/update/{id}")
	public ResponseEntity<BusinessRule> updateBusRule(@PathVariable(value="id") long id
				,@RequestBody BusinessRule busRuleDetails ) throws ResourceNotFoundException{
			BusinessRule busRule = busruleRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Businessrule not found for ::" +id));
			
			busRule.setBRuleId("blank");
//			busRule.setMedium(busRuleDetails.getMedium());
//			busRule.setBoCode(busRuleDetails.getBoCode());
//			
			busruleRepository.save(busRule);
			
			return ResponseEntity.ok().body(busRule);
		}


}
