package dbAPI;

import model.Product;

public interface ProductDBApi {
	
	 public void saveProduct (Product product);
	 public void deleteProduct (Product product);
	 public void deleteAllProduct ();
	 public void readProduct (int productID);
	 public void readAllProduct ();
	 public void sortProductByPrice ();
	 public void readProducInStock ();
	 public void updteProduct (int productID);
	
	
	
	
	

}
