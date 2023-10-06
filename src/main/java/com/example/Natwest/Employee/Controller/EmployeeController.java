package com.example.Natwest.Employee.Controller;

import com.example.Natwest.Employee.Model.EmployeeInfo;
import com.example.Natwest.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    @GetMapping("/hi")
    public String hi(){
        return "Hi Everyone! Welcome to Natwest";
    }
    @PostMapping("/addemp")
    public EmployeeInfo addEmployee(@RequestBody EmployeeInfo employee){

     return employeeService.addEmployee(employee);
    }

    @GetMapping("/getemp")
    public List<EmployeeInfo> getEmployess(){
        return  employeeService.getEmployees();
    }

    @GetMapping("/getemp/{id}")
    public Optional<EmployeeInfo> getEmployess(@PathVariable int id){
        return  employeeService.getEmployeeById(id);
    }


    @PutMapping("/updateemp/")
    public EmployeeInfo updateEmployee(@RequestBody EmployeeInfo employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteemp/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}