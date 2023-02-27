import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class BancoConcreto extends Banco{
	public Connection createConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/ifba"; //base de dados
		String user = "root"; //nome do usuário
		String password = "1234"; //senha

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
}
