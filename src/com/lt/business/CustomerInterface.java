package com.lt.business;

import java.io.IOException;

public interface CustomerInterface {

	public void createCustomer() ;
	public void deleteCustomer(int id);
	public void updateCustomer(int customerid) ;
	public void listCustomer();
}
