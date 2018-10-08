package com.shahin.dao;

import org.hibernate.Session;

import com.shahin.assembler.EmployeeAssembler;
import com.shahin.dto.EmployeeDTO;
import com.shahin.sessionHelper.SessionHelper;

public class EmployeeDAO {

	public String createEmployee(EmployeeDTO employeeDTO) {

		EmployeeAssembler employeeAssembler = new EmployeeAssembler();

		SessionHelper sessionHelper = new SessionHelper();
		Session session = sessionHelper.getSession();

		session.beginTransaction();
		session.persist(employeeAssembler.toEntity(employeeDTO));
		session.getTransaction().commit();
		session.close();

		return "Employee create Successfully";
	}

}
