package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name = "customer")
public class Customer {

	@Id
	@GeneratedValue()
	@Column	(name="\"customerID\"")
	private UUID customerID; 
	@Column	(name="\"name\"")
	private String name;
	@Column	(name="\"addressStreet\"")
	private String addressStreet;
	@Column	(name="\"addressCity\"")
	private String addressCity;
	@Column	(name="\"email\"")
	private String email;
	@Column	(name="\"phoneNumber\"")
	private String phoneNumber;
	@Column	(name="\"dateOfBirth\"")
	private LocalDate dateOfBirth;
	@Column	(name="\"isActive\"")
	private boolean isActive;
	@Column	(name="\"password\"")
	private long password;
	
	
	public Customer(UUID customerID, String name, String addressStreet, String addressCity, String email,
			String phoneNumber, LocalDate dateOfBirth, boolean isActive, long password) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.addressStreet = addressStreet;
		this.addressCity = addressCity;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
		this.password = password;
	}
	public UUID getCustomerID() {
		return customerID;
	}
	public void setCustomerID(UUID customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	//@Override
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressCity == null) ? 0 : addressCity.hashCode());
		result = prime * result + ((addressStreet == null) ? 0 : addressStreet.hashCode());
		result = prime * result + (int) (customerID ^ (customerID >>> 32));
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (password ^ (password >>> 32));
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		Customer other = (Customer) obj;
		if (addressCity == null) {
			if (other.addressCity != null)
				return false;
		} else if (!addressCity.equals(other.addressCity))
			return false;
		if (addressStreet == null) {
			if (other.addressStreet != null)
				return false;
		} else if (!addressStreet.equals(other.addressStreet))
			return false;
		if (customerID != other.customerID)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (isActive != other.isActive)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password != other.password)
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", addressStreet=" + addressStreet
				+ ", addressCity=" + addressCity + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", dateOfBirth=" + dateOfBirth + ", isActive=" + isActive + ", password=" + password + "]";
	} */
	
	
	
}
