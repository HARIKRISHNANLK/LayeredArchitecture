package app.dao;

import java.util.List;

import app.model.Employee;

public interface EmployeeDao
{
    public Employee addEmployee(Employee employee);
	
	public Employee searchEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
}