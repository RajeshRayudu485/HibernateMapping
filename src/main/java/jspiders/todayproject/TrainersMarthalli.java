package jspiders.todayproject;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Entity
@Data
public class TrainersMarthalli {

	@GeneratedValue
	private int TrainerId;
	@Id
	private String TrainerName;
	@ManyToMany
	private List<StudentsMarthalli> Students;
}
