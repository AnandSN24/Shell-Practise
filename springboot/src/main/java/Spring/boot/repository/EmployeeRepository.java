package Spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring.boot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
