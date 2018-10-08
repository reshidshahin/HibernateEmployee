package com.shahin.test;

import com.shahin.dao.EmployeeDAO;
import com.shahin.dto.EmployeeDTO;

public class EmployeeTest {
	public static void main(String[] args) {

		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setName("John");
		employeeDTO.setGender("Male");
		employeeDTO.setSalary(1000);

		EmployeeDAO employeeDAO = new EmployeeDAO();
		String result = employeeDAO.createEmployee(employeeDTO);

		System.out.println("Result: " + result);
	}

}
