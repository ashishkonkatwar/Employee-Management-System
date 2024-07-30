package com.project.emp_mngnt_sys.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.project.emp_mngnt_sys.model.EmployeeModel;
import com.project.emp_mngnt_sys.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@CrossOrigin("http://localhost:7777")
public class EmployeeController {

	@Autowired
	EmployeeService employeeServices;

	@PostMapping("/AddEmployees")
	public String addEmployees(@RequestBody EmployeeModel model) {
		employeeServices.addEmployees(model);
		return "Hii " + model.getFirstName() + " your registration is done successfully";
	}

	@GetMapping("/FetchAllEmployees")
	public List<EmployeeModel> getAllEMployees() {
		return employeeServices.getAllEmployee();
	}

	@GetMapping("/FetchByIdEmployee/{id}")
	public Optional<EmployeeModel> getByIdEmployee(@PathVariable Integer id) {
		return employeeServices.getByIdEmployees(id);
	}

	@PutMapping("updateByIdEmployee/{upid}")
	public String updateByIdEmployee(@RequestBody EmployeeModel model, @PathVariable Integer upid) {
		 employeeServices.updateEmployee(model, upid);
		 return "employee data has been updated";
	}

	@DeleteMapping("/removeAllEmployees")
	public String removeAllEmployees() {
		employeeServices.removeAllEmployee();
		return "All the Employees has been deleted successfully,";
	}

	@DeleteMapping("/removeByIdEmployee/{delId}")
	public List<EmployeeModel> removeAllEmployee(@PathVariable Integer delId) {
		return employeeServices.removeByIdEmployee(delId);
	}

}
