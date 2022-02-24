package uz.star.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.star.studentcrud.model.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
