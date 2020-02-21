package be.belfius.busrule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.belfius.busrule.model.BrSetting;

public interface BrSettingRepository extends JpaRepository<BrSetting, Long>{

}
