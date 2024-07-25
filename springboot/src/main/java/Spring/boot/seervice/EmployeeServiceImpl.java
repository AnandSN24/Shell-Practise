package Spring.boot.seervice;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Spring.boot.entity.Employee;
import Spring.boot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(int empId)
	{
		Optional<Employee> emp = employeeRepository.findById(empId);
		
		return emp.get();
	}
	
	public void saveEmployee(Employee emp)
	{
		employeeRepository.save(emp);
	}
	
	public void deleteEmployee(int empId)
	{
		
		employeeRepository.deleteById(empId);
	}
	
	

}
