package training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.model.Employee;
import training.repository.EmployeeRepository;
import training.repository.HibernateEmployeeRepositoryImpl;

@Service("employeeService")

public class EmployeeServiceImp implements EmployeeService {
	 
	@Autowired
	EmployeeRepository employeeRepository ; 
	
	public EmployeeServiceImp() {
		System.out.println("default constuctor");
	}
	@Autowired
	 public void EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		
		System.out.println("overloaded constructor");
		 
		 this.employeeRepository=employeeRepository;
	 }
	 
	 public EmployeeRepository getEmployeeRepository() {
		 return employeeRepository;
	 }
	 
	 public void setEmployeeRepository(EmployeeRepository employeeRepository) { 
	 this.employeeRepository = employeeRepository;
	 }
	@Override
	public List<Employee> getAllEmployees() {
		
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees();
	}

}
