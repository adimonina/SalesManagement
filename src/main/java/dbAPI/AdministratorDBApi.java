package dbAPI;

import java.util.UUID;

import model.Administrator;

public interface AdministratorDBApi {
	
	  public void saveAdmin (Administrator admin);
	  public void deleteAdmin (Administrator admin);
	  public void deleteAllAdmin ();
	  public void readAdmin (UUID adminID);
	  public void readAllAdmin ();
	  public void updateAdmin (UUID adminID);
}