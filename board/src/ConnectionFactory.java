import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/kanban";

        String user = "root";  // Usuário root, se você estiver usando esse usuário
        String password = "2907";  // Sua senha do MySQL
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            // Conectar ao banco de dados
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {

            throw new SQLException("Driver do MySQL não encontrado", e);
        }
    }
}


