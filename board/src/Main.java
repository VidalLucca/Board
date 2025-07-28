import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {

            Connection conn = ConnectionFactory.getConnection();
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Falha ao conectar ao banco de dados.");
            return;
        }


        try {

            BoardDAO boardDAO = new BoardDAO();
            ColumnBoardDAO columnDAO = new ColumnBoardDAO();
            CardDAO cardDAO = new CardDAO();


            Board board = new Board("Projeto X");
            boardDAO.createBoard(board);

            ColumnBoard coluna = new ColumnBoard("To Do", 1);
            columnDAO.createColumn(coluna);

            Card card = new Card("Implementar login", "Usar JWT", 1);
            cardDAO.createCard(card);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao executar operações no banco de dados.");
        }
    }
}
