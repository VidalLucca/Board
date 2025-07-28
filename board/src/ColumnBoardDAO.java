import java.sql.*;

public class ColumnBoardDAO {
    public void createColumn(ColumnBoard column) throws Exception {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "INSERT INTO column_board (name, board_id) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, column.getName());
        stmt.setInt(2, column.getBoardId());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}

