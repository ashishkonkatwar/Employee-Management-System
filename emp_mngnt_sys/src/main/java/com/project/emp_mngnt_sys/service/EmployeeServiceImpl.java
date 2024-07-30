package com.project.emp_mngnt_sys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.emp_mngnt_sys.model.EmployeeModel;
import com.project.emp_mngnt_sys.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;

	@Override
	public EmployeeModel addEmployees(EmployeeModel addemp) {
		return repository.save(addemp);
	}

	@Override
	public List<EmployeeModel> getAllEmployee() {
		return repository.findAll();
	}

	@Override
	public Optional<EmployeeModel> getByIdEmployees(Integer id) {
		return repository.findById(id);
	}

	@Override
	public EmployeeModel updateEmployee(EmployeeModel updateemp, Integer upid) {
		EmployeeModel model = repository.findById(upid).get();
		model.setFirstName(updateemp.getFirstName());
		model.setLastName(updateemp.getLastName());
		model.setEmail(updateemp.getEmail());
		model.setJobRole(updateemp.getJobRole());
		repository.save(model);
		return model;
	}

	@Override
	public String removeAllEmployee() {
		repository.deleteAll();
		return "All the Employee has been deleted successfully.";
	}

	@Override
	public List<EmployeeModel> removeByIdEmployee(Integer delId) {
		repository.deleteById(delId);
		return repository.findAll();
	}

	


	
}
