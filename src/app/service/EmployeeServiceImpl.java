package app.service;

import java.util.List;

import app.dao.EmployeeDao;
import app.dao.EmployeeDaoImpl;
import app.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao daoObj;
	
	public EmployeeServiceImpl() {
		daoObj = new EmployeeDaoImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return daoObj.addEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(int employeeId) {
		return daoObj.searchEmployeeById(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		
		return daoObj.deleteEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return daoObj.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		 return daoObj.getAllEmployee();
	}
}