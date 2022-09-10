package training.repository;

import java.util.List;

import training.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}