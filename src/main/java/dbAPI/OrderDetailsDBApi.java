package dbAPI;

import java.util.UUID;

import model.OrderDetails;

public interface OrderDetailsDBApi {
	
	public void saveOrderDetails (OrderDetails orderDetails);
	public double calculateTotalPrice (UUID orderID);
	public void updateTotalPrice (UUID orderID);
	public void QuantityOfUnitsPurchased (UUID productID);
	public void SizeToColorRatio (String size,String color);

}
