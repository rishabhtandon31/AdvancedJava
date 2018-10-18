package com.cg.project.client;

import com.cg.project.beans.Associate;
import com.cg.project.beans.BankDetails;
import com.cg.project.beans.Salary;
import com.cg.project.daoservices.AssociateDAO;
import com.cg.project.daoservices.AssociateDAOImpl;

public class MainClass {
	public static void main(String[] args) {
		/*EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-P");
		EntityManager entityManager = factory.createEntityManager();*/
		/*AssociateDAO dao= new AssociateDAOImpl();
		Associate associate= new Associate("Rahul", "Tandon", "Senior Analyst", "rtandon900@gmail.com");
		associate= dao.save(associate);
		int associateId=associate.getAssociateId();
		System.out.println("AssociateId = "+associate.getAssociateId());
		System.out.println(dao.findOne(associateId));
		//System.out.println(dao.findAll());
		associate.setFirstName("Rahul");
		System.out.println(dao.update(associate));
	}*/
		AssociateDAO dao= new AssociateDAOImpl();
		Associate associate= new Associate("Sahil", "Dhir", "ADM", "Analyst", "AUPL1223", "jgbjh@gmail.com", 1230, new BankDetails(1122, "HDFC", "AKN767"),new Salary(20000, 1500, 2000));
		associate=dao.save(associate);
		System.out.println(associate);
		
		
	}
}
