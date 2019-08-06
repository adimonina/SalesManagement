package model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table  (name = "\"order\"")
public class Order {
	
	@Id
	@GeneratedValue()
	@Column	(name="\"orderID\"")
	private UUID orderID;
	@Column	(name="\"customerID\"")
	private UUID customerID;
	@Column	(name="\"totalPrice\"")
	private double totalPrice;
	@Column	(name="\"orderDate\"")
	private LocalDate orderDate;
	@Column	(name="\"isCanceled\"")
	private boolean isCanceled;
	
	public Order(UUID orderID, UUID customerID, double totalPrice, LocalDate orderDate, boolean isCanceled) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.isCanceled = isCanceled;
	}
	public Order() {
		super();
	}
	public UUID getOrderID() {
		return orderID;
	}
	public void setOrderID(UUID orderID) {
		this.orderID = orderID;
	}
	public UUID getcustomerID() {
		return customerID;
	}
	public void setproductID(UUID customerID) {
		this.customerID = customerID;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public boolean isCanceled() {
		return isCanceled;
	}
	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", customerID=" + customerID + ", totalPrice=" + totalPrice
				+ ", orderDate=" + orderDate + ", isCanceled=" + isCanceled + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + (isCanceled ? 1231 : 1237);
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Order other = (Order) obj;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		if (isCanceled != other.isCanceled)
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double.doubleToLongBits(other.totalPrice))
			return false;
		return true;
	}
	
	
	
	
}
