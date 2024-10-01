package jspiders.todayproject;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class StudentsHebbal {
	@Id
	private int StudentId;
	private String StudentName;
}
