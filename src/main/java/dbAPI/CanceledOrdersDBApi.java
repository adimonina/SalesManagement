package dbAPI;

import java.util.UUID;

import model.CanceledOrders;

public interface CanceledOrdersDBApi {
	
	 public void saveCanceledOrders (CanceledOrders canceledOrders);
	 public void readCanceledOrders (UUID canceledOrdersID );
	 public void readAllCanceledOrdersByCustomer (int customerID);
	 public void readAllCanceledOrders();
	 public void updateCanceledOrders(CanceledOrders canceledOrders);
}
