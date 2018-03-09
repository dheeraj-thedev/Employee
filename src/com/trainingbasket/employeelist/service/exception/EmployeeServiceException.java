package com.trainingbasket.employeelist.service.exception;

/**
 * This is the EmployeeServiceException class which extends the Exception class.
 * This exception is thrown when user want to see the employee detail but 
 * the list is empty.
 */
@SuppressWarnings("serial")
public class EmployeeServiceException extends Exception 
{
	public static final String NO_EMPLOYEE_FOUND="no employee found in list";
	
	public EmployeeServiceException(String msg)
	{
		super(msg);
	}
}
