package com.eh.springbootsecurity.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eh.springbootsecurity.boot.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}