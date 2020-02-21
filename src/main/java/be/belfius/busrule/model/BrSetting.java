package be.belfius.busrule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class BrSetting {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String bRuleId; 
	@Column(nullable = true)
	private int nbrOfInputFact;
	@Column(nullable = true)
	private int nbrOfOutputFact;
//	private String key;
//	private String value;
	
	
	public BrSetting(String bRuleId, int nbrOfInputFact, int nbrOfOutputFact) {
		super();
		this.bRuleId = bRuleId;
		this.nbrOfInputFact = nbrOfInputFact;
		this.nbrOfOutputFact = nbrOfOutputFact;
	}


	public BrSetting() {
		super();
	}
	
}
