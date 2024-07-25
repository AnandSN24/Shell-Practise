package Spring.boot.seervice;

import java.util.List;
import java.util.Optional;

import Spring.boot.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(int empId);
	
	public void saveEmployee(Employee emp);
	
	void deleteEmployee(int empId);

}
