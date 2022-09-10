import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.config.ApplicationConfigaration;
import training.model.Employee;
import training.service.EmployeeService;
import training.service.EmployeeServiceImp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ApplicationContext1=new AnnotationConfigApplicationContext(ApplicationConfigaration.class);
		
		EmployeeService employeeService = ApplicationContext1.getBean("employeeService",EmployeeService.class);
		
		List<Employee> employees=employeeService.getAllEmployees();
		
		for(Employee employee:employees) {
			System.out.println(employee.getEmployeeName()+" "+"at"+" "+employee.getEmployeeLocation());
		}

	}

}
