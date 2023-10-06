package com.example.Natwest.Employee.Repository;

import com.example.Natwest.Employee.Model.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeInfo,Integer> {

}
