package training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import training.repository.EmployeeRepository;
import training.repository.HibernateEmployeeRepositoryImpl;
import training.service.EmployeeService;
import training.service.EmployeeServiceImp;

@Configuration
public class ApplicationConfigaration {
	
@Bean(name="employeeService")
@Scope("singleton")
public EmployeeService getEmployeeService() {
	
	EmployeeServiceImp employeeService=new EmployeeServiceImp();
	employeeService.setEmployeeRepository(getEmployeeRepository());
	return new EmployeeServiceImp();
	 }

@Bean(name="employeeRepository")
public EmployeeRepository getEmployeeRepository() {
	return new HibernateEmployeeRepositoryImpl();
	 }

}
