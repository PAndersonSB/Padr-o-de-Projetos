import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public abstract class Banco {
	
	public abstract Connection createConnection() throws SQLException;
	
}
