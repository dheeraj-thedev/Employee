package com.trainingbasket.employeelist.runner;

import java.util.ArrayList;
import java.util.List;

import com.trainingbasket.employeelist.bean.Employee;
import com.trainingbasket.employeelist.uiservice.EmployeeUIServiceImpl;
import com.trainingbasket.employeelist.uiservice.IEmployeeUIService;
import com.trainingbasket.employeelist.util.ReadUtil;

/**
 *This is the Runner class
 */
public class Runner
{
	private ReadUtil m_readUtil;
	private IEmployeeUIService m_EmployeeUIService;

	/**
	 *This is a default constructor of the class
	 */
	public Runner()
	{
		m_readUtil=new ReadUtil();
		m_EmployeeUIService=new EmployeeUIServiceImpl();
		checkUserOptions();
	}

	/**
	 *This function takes the user choice as the menu is displayed and
	 *call the functions accordingly.
	 *
	 */
	private void checkUserOptions()
	{
		int choice=0;
		List<Employee> employeelist=new ArrayList<Employee>();
		do
		{
			displayMainMenu();
			choice=m_readUtil.readInt("Input Your choice","Input valid Choice");
			switch(choice)
			{
				case 1 : m_EmployeeUIService.AddNewEmployee();
						break;

				case 2 : m_EmployeeUIService.removeEmployee();
						break;

				case 3 : m_EmployeeUIService.showAllEmployee();
						break;

				case 4 :String name=m_readUtil.readString("Input Employee Name(or any part of name)","String cannot be empty");
						try{
							employeelist=m_EmployeeUIService.searchEmployeeByName(name);
							System.out.println();
						}catch(NullPointerException e){
							System.out.println("Emloyee not found");
						}						
						break;

				case 5 : m_EmployeeUIService.sortEmployee();
						break;

				case 6 : System.out.println(" Thanks For using this system ");
		          		break;
				default : System.out.println("wrong choice");
		           		break;
			}
		}while(choice!=6);
	}
	/**
	 *This fuction displays the main menu of the system.
	 *
	 */
	private void displayMainMenu()
	{
		System.out.println("     Main Menu     ");
		System.out.println("-------------------");
		System.out.println("1. Add New Employee ");
		System.out.println("2. Remove An Employee ");
		System.out.println("3. Show All Employees Information ");
		System.out.println("4. Search An Employee ");
		System.out.println("5. Sort By First Name ");
		System.out.println("6. Exit ");
	}

	/**
	 * This is the main fuction which runs the default constructor of the class.
	 */
	public static void main(String[] args) {
		new Runner();
	}

}
