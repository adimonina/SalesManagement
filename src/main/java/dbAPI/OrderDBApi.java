package dbAPI;

import java.util.UUID;

import model.Order;

public interface OrderDBApi {


	  public void saveOrder (Order order);
	  public void deleteOrder (Order order);
	  public void deleteAllOrder ();
	  public void readOrder (UUID orderID);
	  public void readAllOrder ();
	  public void readOrderByCustomer (UUID customerID);
	  public void sortOrderByTotalPrice ( );
	  public void readOrderByMonth (int month);
	  public void updateOrder (UUID orderID);
	  public void readOrderBySeason (String season);
	  public void cityBoughtTheMost ();
}
