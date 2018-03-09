package com.trainingbasket.employeelist.uiservice;

import java.util.Comparator;

import com.trainingbasket.employeelist.bean.Employee;
/**
 * This class implements the comparator<> and its abstract function compare
 * which works on the first name of the employee.
 */
public class FirstNameCompare implements Comparator<Employee>
{
	/**
	 * Default constructor of the class.
	 */
	public FirstNameCompare()
	{

	}
	/**
	 * This function compare the first name of two employees.
	 * @param employee1 and employee2. Objects of Employee bean.
	 * @return the value 0 if the employee1 is equal to employee2,
	 * a value less than 0 if employee1 is less than employee2,
	 * and a value greater than 0 if empoyee1 is greater than employee2.
	 */
	public int compare(Employee employee1, Employee employee2)
	{
		return(employee1.getFirstName().compareTo(employee2.getFirstName()));
	}
}
