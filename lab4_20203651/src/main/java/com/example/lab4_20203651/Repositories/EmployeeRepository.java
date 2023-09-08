package com.example.lab4_20203651.Repositories;

import com.example.lab4_20203651.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employees,Integer> {

    @Query(value="Select employee_id, first_name, last_name, job_title as \"Puesto\", department_name as \"Departamento\", city as \"Ciudad\", phone_number, salary\n" +
            "from employees e\n" +
            "left join jobs j on e.job_id = j.job_id\n" +
            "left join departments d on e.department_id = d.department_id\n" +
            "left join locations l on d.location_id = l.location_id", nativeQuery=true)
    List<Employees> listarEmployee();


}
