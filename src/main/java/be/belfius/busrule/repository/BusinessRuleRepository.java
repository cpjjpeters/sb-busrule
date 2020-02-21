package be.belfius.busrule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import be.belfius.busrule.model.BusinessRule;

@Repository
public interface BusinessRuleRepository extends JpaRepository<BusinessRule, Long> {
	
	 @Query("SELECT brul FROM BusinessRule brul  WHERE brul.bRuleId=(:bRuleId)")
	    List<BusinessRule> findAllfor(@Param("bRuleId") String bRuleId);

}
