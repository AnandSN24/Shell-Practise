package Spring.boot.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Spring.boot.entity.Employee;
import Spring.boot.seervice.EmployeeService;

@RestController
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId )
    {
		return employeeService.getEmployeeById(employeeId);
    }
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployeeById(@PathVariable int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		
		return "1 row deleted";
	}
	
	@PostMapping("/employees")
	public void saveEmployee(@RequestBody Employee emp)
	{
		employeeService.saveEmployee(emp);
	}
	
	@PutMapping("/employees/{employeeId}")
	public void updateEmployee(@PathVariable int employeeId, @RequestBody Employee employee)
	{
		Employee emp = employeeService.getEmployeeById(employeeId);
		
		emp.setName(employee.getName());
		emp.setSalary(employee.getSalary());
		
		 employeeService.saveEmployee(emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
