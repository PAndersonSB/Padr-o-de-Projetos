
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 

public class CreatorConcreto extends Creator{
	
	public void insertDados() throws SQLException {
		Banco banco = new BancoConcreto();
		Connection conexao = banco.createConnection();
		
		String sql = "INSERT INTO ifba (nome) VALUES ('Mario')";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.execute();
		conexao.close();
	}
	
}