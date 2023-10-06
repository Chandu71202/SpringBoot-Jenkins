package com.example.Natwest.Employee.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    private String department;
    private String designation;
    private String  email;
    private String phone;
    private String dob;
}
