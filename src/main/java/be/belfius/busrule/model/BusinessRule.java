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
public class BusinessRule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length=50)
	private String bRuleId;
	@Column(nullable = true)
	private String field;
	@Column(nullable = true)
	 private String fldAction;
	
	
	public BusinessRule(String bRuleId, String field, String fldAction) {
		super();
		this.bRuleId = bRuleId;
		this.field = field;
		this.fldAction = fldAction;
	}


	public BusinessRule() {
		super();
	}

	
}
