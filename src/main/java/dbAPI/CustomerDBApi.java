package dbAPI;

import java.util.UUID;

import model.Customer;

public interface CustomerDBApi {

	
	  public void saveCustomer (Customer customer);
	  public void deleteCustomer (Customer customer);
	  public void readCustomer (UUID customerID);
	  public void updateCustomer (UUID customerID);
	  public void readAllCustomers ();
	  public void deleteAllCustomers ();
	  
}
