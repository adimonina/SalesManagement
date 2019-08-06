package model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table  (name = "\"administrator\"")
public class Administrator {
	
	
	@Id
	@GeneratedValue()
	@Column	(name="\"adminID\"")
	private UUID adminID;
	@Column	(name="\"password\"")
	private long password;
	
	public Administrator(UUID adminID, long password) {
		super();
		this.adminID = adminID;
		this.password = password;
	}
	public Administrator() {
		super();
	}
	public UUID getAdminID() {
		return adminID;
	}
	public void setAdminID(UUID adminID) {
		this.adminID = adminID;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administrator [adminID=" + adminID + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminID == null) ? 0 : adminID.hashCode());
		result = prime * result + (int) (password ^ (password >>> 32));
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
		Administrator other = (Administrator) obj;
		if (adminID == null) {
			if (other.adminID != null)
				return false;
		} else if (!adminID.equals(other.adminID))
			return false;
		if (password != other.password)
			return false;
		return true;
	}
	
	

}
