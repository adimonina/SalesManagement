package model;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table  (name = "product")
public class Product {

	@Id
	@GeneratedValue()
	@Column	(name="\"productID\"")
	private int productID; 
	@Column	(name="\"name\"")
	private String name;
	@Column	(name="\"color\"")
	private String color;
	@Column	(name="\"size\"")
	private String size;
	@Column	(name="\"unitsInStock\"")
	private int unitsInStock;
	@Column	(name="\"price\"")
	private double price;
	
	
	

	public Product() {
		super();
	}

	public Product(int productID, String name, String color, String size, int unitsInStock, double price) {
		super();
		this.productID = productID;
		this.name = name;
		this.color = color;
		this.size = size;
		this.unitsInStock = unitsInStock;
		this.price = price;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", color=" + color + ", size=" + size
				+ ", unitsInStock=" + unitsInStock + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + productID;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + unitsInStock;
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
		Product other = (Product) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productID != other.productID)
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (unitsInStock != other.unitsInStock)
			return false;
		return true;
	}
	
	
	
}
