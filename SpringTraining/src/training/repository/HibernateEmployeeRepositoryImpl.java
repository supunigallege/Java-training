package training.repository;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import training.model.Employee;

@Repository("employeeRepository")

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getAllEmployees(){
		List<Employee>employees =new ArrayList<>();
		
		Employee employee=new Employee();
		employee.setEmployeeName("Supuni");
		employee.setEmployeeLocation("Kandy");
		employees.add(employee);
		return employees;
		
	}
}
