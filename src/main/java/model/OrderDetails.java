package model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name = "\"orderDetails\"")
public class OrderDetails {
	
	@Id
	@GeneratedValue()
	@Column	(name="\"orderDetailsID\"")
	private UUID orderDetailsID;
	@Column	(name="\"orderID\"")
	private UUID orderID;
	@Column	(name="\"amount\"")
	private int amount;
	@Column	(name="\"pricePerUnit\"")
	private double pricePerUnit;
	@Column	(name="\"productID\"")
	private int productID;
	
	
	public OrderDetails(UUID orderDetailsID, UUID orderID, int productID, int amount, double pricePerUnit) {
		super();
		this.orderDetailsID = orderDetailsID;
		this.orderID = orderID;
		this.productID = productID;
		this.amount = amount;
		this.pricePerUnit = pricePerUnit;
	}
	public OrderDetails() {
		super();
	}
	public UUID getOrderDetailsID() {
		return orderDetailsID;
	}
	public void setOrderDetailsID(UUID orderDetailsID) {
		this.orderDetailsID = orderDetailsID;
	}
	public UUID getOrderID() {
		return orderID;
	}
	public void setOrderID(UUID orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	@Override
	public String toString() {
		return "OrderDetails [orderDetailsID=" + orderDetailsID + ", orderID=" + orderID + ", productID=" + productID
				+ ", amount=" + amount + ", pricePerUnit=" + pricePerUnit + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + ((orderDetailsID == null) ? 0 : orderDetailsID.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pricePerUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetails other = (OrderDetails) obj;
		if (amount != other.amount)
			return false;
		if (orderDetailsID == null) {
			if (other.orderDetailsID != null)
				return false;
		} else if (!orderDetailsID.equals(other.orderDetailsID))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (Double.doubleToLongBits(pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit))
			return false;
		if (productID != other.productID)
			return false;
		return true;
	}



}
