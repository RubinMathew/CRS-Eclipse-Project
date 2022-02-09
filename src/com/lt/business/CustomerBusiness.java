/**
 * 
 */
package com.lt.business;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.lt.bean.Customer;



/**
 * @author user214
 *
 */
public class CustomerBusiness {
	/* define business methods inside the class */
	
	
	
	Customer[] customers=new Customer[5];
	int counter=-1;
	int maxsize=0;
	
	
	public void createCustomer() throws IOException {
		counter++;
		maxsize=counter+1;
		int id=1000+counter;
		String cusName;
		String cusAddress;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter Customer name \n");
		cusName=br.readLine();
		System.out.println("Enter Address of customer \n");
		cusAddress=br.readLine();
		Customer cus=new Customer();
		cus.setCustomerID(id);
		cus.setCustomerName(cusName);
		cus.setCustomerAddress(cusAddress);	
		customers[counter]=cus;
		System.out.println("Customer is Created");
	}
	public void deleteCustomer(int id) {
		int token=-1;
		
		for(int i=0;i<counter+1;i++)
		if(id==customers[i].getCustomerID())
		{
			token=i;
			break;
		}
		if(token==-1)
			System.out.println("No customer found with id"+id);
		else{
			//customers[token].setCustomerName("Deleted Record name  \n");
			//customers[token].setCustomerAddress("Deleted Record address \n");
			System.out.println("Customer is Deleted");
			for(int i=token;i<counter-1;i++){
				customers[i]=customers[i+1];
			}
			counter--;
			maxsize--;
		}
		
		
	}
	public void updateCustomer(int customerid) throws IOException {
		String customerName , customerAddress;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int token=-1;
		for(int i=0;i<5;i++){
			if(customerid==customers[i].getCustomerID()){
				token=i;
				break;
			}
				
		}
		if(token==-1)
			System.out.println("No customer found with id"+customerid);
		else
		{
			System.out.println("Enter the name \n");
			customerName=br.readLine();
			System.out.println("Enter the address \n");
			customerAddress=br.readLine();
			customers[token].setCustomerName(customerName);
			customers[token].setCustomerAddress(customerAddress);
			System.out.println("Customer is Updated");
		
		}
	}
	public void listCustomer() {
		System.out.println("CustomerList is Displayed \n");
		for(int i=0;i<maxsize;i++)
		{
			System.out.println("\t"+customers[i].getCustomerID()+"\t"+customers[i].getCustomerName()+"\t"+customers[i].getCustomerAddress());
		}
	}
}
