package jspiders.todayproject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Entity
@Data
public class JspidersBtr {
	@Id
	private String headName;
	private String location;
	@OneToMany
	private List<TrainersBtr> Trainers;
	
}
