package com.example.Natwest.Employee.Service;

import com.example.Natwest.Employee.Model.EmployeeInfo;
import com.example.Natwest.Employee.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public EmployeeInfo addEmployee(EmployeeInfo employee) {
        return employeeRepo.save(employee);
    }

    public List<EmployeeInfo> getEmployees(){
        return employeeRepo.findAll();
    }

    public  Optional<EmployeeInfo> getEmployeeById(int id){
        return employeeRepo.findById(id);
    }
    public EmployeeInfo updateEmployee(EmployeeInfo employee) {
        EmployeeInfo empinfo = null;
        Optional<EmployeeInfo> empInfo1 = employeeRepo.findById(employee.getId());
        if(empInfo1.isPresent()){
            empinfo=empInfo1.get();
            empinfo.setName(employee.getName());
            empinfo.setEmail(employee.getEmail());
            empinfo.setAddress(employee.getAddress());
            empinfo.setPhone(employee.getPhone());
            empinfo.setDepartment(employee.getDepartment());
            empinfo.setDesignation(employee.getDesignation());
            empinfo.setDob(employee.getDob());
            return employeeRepo.save(empinfo);
        }
        else {
            return new EmployeeInfo();
        }
    }

    public String deleteEmployee(int id) {
        employeeRepo.deleteById(id);
        return "EmployeeInfo deleted successfully";
    }
}

//    private int id;
//    private String name;
//    private String address;
//    private String department;
//    private String designation;
//    private String email;
//    private String phone;
//    private String dob;