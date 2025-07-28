import java.sql.*;

public class BoardDAO {
    public void createBoard(Board board) throws Exception {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "INSERT INTO board (name) VALUES (?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, board.getName());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void deleteBoard(int boardId) throws Exception {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "DELETE FROM board WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, boardId);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}
