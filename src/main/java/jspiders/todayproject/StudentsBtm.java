package jspiders.todayproject;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentsBtm {
	private int StudentId;
	@Id
	private String StudentName;
}
