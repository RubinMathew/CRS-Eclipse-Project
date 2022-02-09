/**
 * 
 */
package com.lt.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.lt.business.CustomerBusiness;

/**
 * @author user214
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		CustomerBusiness cb=new CustomerBusiness();
		//cb.createCustomer(101, "Rubin", "Kerala");
		//cb.createCustomer(102, "Rubin Mathew", "Kerala");	
		cb.listCustomer();
	
		cb.listCustomer();
		//cb.deleteCustomer();
		int op=-1;
		do{
			System.out.println("Customer Form");
			System.out.println("1 -> create a new customer");
			System.out.println("2 -> update existing customer details");
			System.out.println("3 -> delete an exisiting customer information");
			System.out.println("4 -> list all customers");
			System.out.println("0 -> exit \n");
			String option=br.readLine();
			op=Integer.parseInt(option);
			switch(op)
			{
			case 1:
				// call method for create customer
				cb.createCustomer();
				br.readLine();
				
			break;
			
			case 2:
				// call method for update customer	
				System.out.println("Enter the ID of the customer whose information need to be changed \n");
				int id=Integer.parseInt(br.readLine());
				cb.updateCustomer(id);
				br.readLine();
				
				
			break;
			
			case 3:
				// call method for delete customer
				System.out.println("Enter the ID of the customer whose information need to be deleted \n");
				int id1=Integer.parseInt(br.readLine());
				cb.deleteCustomer(id1);
				br.readLine();
			break;
			case 4:
				// call method for listing all customer
				cb.listCustomer();
				br.readLine();
			break;
			case 0:
			break;
			default:
			System.out.println("you have entered wrong option \n");
			br.readLine();
			break;
			}
			
			
		}while(op!=0);

	}

}
