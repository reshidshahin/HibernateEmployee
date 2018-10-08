package com.shahin.assembler;

import com.shahin.dto.EmployeeDTO;
import com.shahin.entity.Employee;

public class EmployeeAssembler {

	public Employee toEntity(EmployeeDTO employeeDTO) {
		Employee employee = new Employee();
		employee.setName(employeeDTO.getName());
		employee.setGender(employeeDTO.getGender());
		employee.setSalary(employeeDTO.getSalary());

		return employee;

	}

}
