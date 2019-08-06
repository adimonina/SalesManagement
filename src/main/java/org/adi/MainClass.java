package org.adi;

import java.time.LocalDate;
import java.util.UUID;
import org.hibernate.Session;
import org.hibernate.Transaction;
import db.HibernateUtil;
import dbIMPL.AdminDBImpl;
import dbIMPL.CanceledOrdersDBImpl;
import dbIMPL.CustomerDBImpl;
import dbIMPL.OrderDBImpl;
import dbIMPL.OrderDetailsDBImpl;
import dbIMPL.ProductDBImpl;
import model.Administrator;
import model.CanceledOrders;
import model.Customer;
import model.Order;
import model.OrderDetails;
import model.Product;

public class MainClass {
	
	public static void main(String[] args) {
	
		CustomerDBImpl d = new CustomerDBImpl();
        UUID uuid = UUID.randomUUID();
		Customer first = new Customer(uuid,"adi" ,"Yalin Davis3" , "givatyim", "adimonina@gmail.com" , "054-6793456",  LocalDate.of(1998, 04, 19), true, 12456);
		d.saveCustomer(first);
		
		Customer second = new Customer(uuid,"neta" ,"tabenkin 8" , "ramat gan", "netush@gmail.com" , "054-5247869",  LocalDate.of(1998, 10, 04), true, 867256);
		d.saveCustomer(second);
		d.deleteCustomer(first);
		
		Product firstProduct = new Product(12345, "shirti","red" , "m" , 1, 29.3);
		ProductDBImpl p = new ProductDBImpl();
		p.saveProduct(firstProduct);
		p.deleteProduct(firstProduct);
		
		AdminDBImpl a = new AdminDBImpl();
        UUID uuidAdmin = UUID.randomUUID();
		Administrator firstAdmin = new Administrator(uuidAdmin, 12456);
		a.saveAdmin(firstAdmin);
		a.deleteAdmin(firstAdmin);
		
		UUID uuidOrder = UUID.randomUUID();
		Order firstOrder= new Order(uuidOrder,second.getCustomerID(), 100.4,LocalDate.of(2019, 10, 04),false);
		OrderDBImpl o= new OrderDBImpl();
		o.saveOrder(firstOrder);
		o.deleteOrder(firstOrder);
		
		UUID uuidOrderDetails = UUID.randomUUID();
		OrderDetails firstOrderDetails= new OrderDetails(uuidOrderDetails,firstOrder.getOrderID(), firstProduct.getProductID(),3,firstProduct.getPrice());
		OrderDetailsDBImpl od= new OrderDetailsDBImpl();
		od.saveOrderDetails(firstOrderDetails);
		
		
		CanceledOrders firstCanceled = new CanceledOrders (firstOrder.getOrderID(), LocalDate.of(2019, 3, 05) , "wrong size");
		CanceledOrdersDBImpl c = new CanceledOrdersDBImpl();
		c.saveCanceledOrders(firstCanceled);
	}
}