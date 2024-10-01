package jspiders.todayproject;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JSplitPane;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("rajesh");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		StudentsBtm std1= new StudentsBtm();
		 std1.setStudentId(101);
		 std1.setStudentName("sudarsan");
		 
		 StudentsBtm std2= new StudentsBtm();
		 std2.setStudentId(102);
		 std2.setStudentName("rajesh");
		 
		 StudentsBtm std3= new StudentsBtm();
		 std3.setStudentId(103);
		 std3.setStudentName("vijay");
		 
		 StudentsBtr std4=new StudentsBtr();
		 std4.setStudentId(111);
		 std4.setStudentName("Rayudu");
		 
		 StudentsBtr std5=new StudentsBtr();
		 std5.setStudentId(112);
		 std5.setStudentName("suddapusa");
		 
		 StudentsBtr std6=new StudentsBtr();
		 std6.setStudentId(113);
		 std6.setStudentName("ramesh");
		 
		 StudentsHebbal std7= new StudentsHebbal();
		 std7.setStudentId(121);
		 std7.setStudentName("nazeer");
		 
		 
		 StudentsHebbal std8= new StudentsHebbal();
		 std8.setStudentId(122);
		 std8.setStudentName("basavraj");
		 
		 StudentsHebbal std9= new StudentsHebbal();
		 std9.setStudentId(123);
		 std9.setStudentName("manik");
		 
		 
		 
		 StudentsMarthalli std10= new StudentsMarthalli();
		 std10.setStudentId(131);
		 std10.setStudentName("akshat");
		 
		 StudentsMarthalli std11= new StudentsMarthalli();
		 std11.setStudentId(132);
		 std11.setStudentName("prasad");
		 
		 StudentsMarthalli std12= new StudentsMarthalli();
		 std12.setStudentId(133);
		 std12.setStudentName("kumar");
		 
         StudentsRajajinagar std13= new StudentsRajajinagar();
         std13.setStudentId(141);
         std13.setStudentName("ramu");
         
         
         StudentsRajajinagar std14= new StudentsRajajinagar();
         std14.setStudentId(142);
         std14.setStudentName("venkat");
         
         StudentsRajajinagar std15= new StudentsRajajinagar();
         std15.setStudentId(143);
         std15.setStudentName("sai");
         
         TrainersBtm t1=new TrainersBtm();
         t1.setTrainerName("rahul");
         t1.setStudents(Arrays.asList(std1,std2,std3));
         
         TrainersBtm t2=new TrainersBtm();
         t2.setTrainerName("darshan");
         t2.setStudents(Arrays.asList(std1,std2,std3));
         
         TrainersBtr t3=new TrainersBtr();
         t3.setTrainerName("pretham");
         t3.setStudents(Arrays.asList(std4,std5,std6));
         
         TrainersBtr t4= new TrainersBtr();
         t4.setTrainerName("shankar");
         t4.setStudents(Arrays.asList(std4,std5,std6));
         
         TrainersHebbal t5=new TrainersHebbal();
         t5.setTrainerName("keshav");
         t5.setStudents(Arrays.asList(std7,std8,std9));
         
         TrainersHebbal t6= new TrainersHebbal();
         t6.setTrainerName("ashok");
         t6.setStudents(Arrays.asList(std7,std8,std9));
         
         TrainersMarthalli t7=new TrainersMarthalli();
         t7.setTrainerName("sridhar");
         t7.setStudents(Arrays.asList(std10,std11,std12));
         
         TrainersMarthalli t8=new TrainersMarthalli();
         t8.setTrainerName("shansak");
         t8.setStudents(Arrays.asList(std10,std11,std12));
         
         TrainersRajajinagara t9=new TrainersRajajinagara();
         t9.setTrainerName("saish");
         t9.setStudents(Arrays.asList(std13,std14,std15));
         
         TrainersRajajinagara t10=new TrainersRajajinagara();
         t10.setTrainerName("kiran");
         t10.setStudents(Arrays.asList(std13,std14,std15));
         
         
         JspidersBtm j1=new JspidersBtm();
         j1.setHeadName("keshav");
         j1.setLocation("BTM");
         j1.setTrainers(Arrays.asList(t1,t2));
         
         JspidersBtr j2= new JspidersBtr();
         j2.setHeadName("Girish");
         j2.setLocation("BTR");
         j2.setTrainers(Arrays.asList(t3,t4));
         
         JspidersHebbal j3= new JspidersHebbal();
         j3.setHeadName("darshan");
         j3.setLocation("HEBBAL");
         j3.setTrainers(Arrays.asList(t5,t6));
         
         JspidersMarthalli j4=new JspidersMarthalli();
         j4.setHeadName("Kiran");
         j4.setLocation("MARTHALLI");
         j4.setTrainers(Arrays.asList(t7,t8));
         
         JspidersRajajinagar j5= new JspidersRajajinagar();
         j5.setHeadName("Shankar");
         j5.setLocation("RAJAJINAGARA");
         j5.setTrainers(Arrays.asList(t9,t10));
         
         TestYantra ty=new TestYantra();
         ty.setCeoName("GIRISH");
         ty.setSalary(67834683);
         ty.setJbtm(j1);
         ty.setJbtr(j2);
         ty.setJhb(j3);
         ty.setJmah(j4);
         ty.setJraj(j5);
         
         BdTeam bd=new BdTeam();
         bd.setCompanyId(1221);
         bd.setCompanyName("testyantra");
         bd.setTest(ty);
         bd.setJbtm(j1);
         bd.setJbtr(j2);
         bd.setJhb(j3);
         bd.setJmah(j4);
         bd.setJraj(j5);
         
         t.begin();
         m.persist(bd);
         m.persist(ty);
         m.persist(j1);
         m.persist(j2);
         m.persist(j3);
         m.persist(j4);
         m.persist(j5);
         m.persist(t1);
         m.persist(t2);
         m.persist(t3);
         m.persist(t4);
         m.persist(t5);
         m.persist(t6);
         m.persist(t7);
         m.persist(t8);
         m.persist(t9);
         m.persist(t10);
         m.persist(std1);
         m.persist(std2);
         m.persist(std3);
         m.persist(std4);
         m.persist(std5);
         m.persist(std6); 
         m.persist(std7);
         m.persist(std8);
         m.persist(std9);
         m.persist(std10);
         m.persist(std11);
         m.persist(std12); 
         m.persist(std13);
         m.persist(std14);
         m.persist(std15);
         t.commit();
	}

}
