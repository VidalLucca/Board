import java.sql.*;

public class CardDAO {
    public void createCard(Card card) throws Exception {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "INSERT INTO card (title, description, column_id) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, card.getTitle());
        stmt.setString(2, card.getDescription());
        stmt.setInt(3, card.getColumnId());
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }

    public void deleteCard(int cardId) throws Exception {
        Connection conn = ConnectionFactory.getConnection();
        String sql = "DELETE FROM card WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, cardId);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
    }
}
