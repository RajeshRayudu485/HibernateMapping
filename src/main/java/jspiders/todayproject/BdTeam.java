package jspiders.todayproject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Entity
@Data
public class BdTeam {
	@Id
	private String companyName;
	private int companyId;
	@OneToOne
	private TestYantra test;
	@OneToOne
	private JspidersBtm jbtm;
	@OneToOne
	private JspidersBtr jbtr;
	@OneToOne
	private JspidersHebbal jhb;
	@OneToOne
	private JspidersMarthalli jmah;
	@OneToOne
	private JspidersRajajinagar jraj;
}
