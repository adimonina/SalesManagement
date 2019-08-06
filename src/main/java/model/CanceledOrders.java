package model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table  (name = "\"canceledOrders\"")
public class CanceledOrders {
	
	
	@Id
	@GeneratedValue()
	@Column	(name="\"orderID\"")
	private UUID orderID;
	@Column	(name="\"cancelationDate\"")
	private LocalDate cancelationDate;;
	@Column	(name="\"reason\"")
	private String reason;
	
	
	public CanceledOrders(UUID orderID, LocalDate cancelationDate, String reason) {
		super();
		this.orderID = orderID;
		this.cancelationDate = cancelationDate;
		this.reason = reason;
	}
	public CanceledOrders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UUID getOrderID() {
		return orderID;
	}
	public void setOrderID(UUID orderID) {
		this.orderID = orderID;
	}
	public LocalDate getCancelationDate() {
		return cancelationDate;
	}
	public void setCancelationDate(LocalDate cancelationDate) {
		this.cancelationDate = cancelationDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "CanceledOrders [orderID=" + orderID + ", cancelationDate=" + cancelationDate + ", reason=" + reason
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cancelationDate == null) ? 0 : cancelationDate.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
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
		CanceledOrders other = (CanceledOrders) obj;
		if (cancelationDate == null) {
			if (other.cancelationDate != null)
				return false;
		} else if (!cancelationDate.equals(other.cancelationDate))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!orderID.equals(other.orderID))
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		return true;
	}
	
	
	

}
