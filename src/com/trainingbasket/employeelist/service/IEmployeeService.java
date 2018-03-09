package com.trainingbasket.employeelist.service;

import java.util.List;

import com.trainingbasket.employeelist.bean.Employee;
import com.trainingbasket.employeelist.service.exception.EmployeeServiceException;
/**
 * IEmployeeService is an interface which defines various abstract functions
 * for the service layer.
 */
public interface IEmployeeService
{
	public void addNewEmployee(Employee employee);
	public void removeEmployeeByName(List<Employee> employeelist);
	public List<Employee> showAllEmployeeInformation() throws EmployeeServiceException;
	
}
