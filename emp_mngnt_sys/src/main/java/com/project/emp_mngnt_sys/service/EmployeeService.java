package com.project.emp_mngnt_sys.service;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.openssl.openssl_h;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.emp_mngnt_sys.model.EmployeeModel;

@Service
public interface EmployeeService {

	public EmployeeModel addEmployees(EmployeeModel addemp);
	
	public List<EmployeeModel> getAllEmployee();
	
	public Optional<EmployeeModel> getByIdEmployees(Integer id);
	
	public EmployeeModel updateEmployee(EmployeeModel updateemp, Integer upid);
	
	public String removeAllEmployee();
	
	public List<EmployeeModel> removeByIdEmployee(Integer deliId);


	
	
	
}
