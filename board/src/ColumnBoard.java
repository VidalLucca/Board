public class ColumnBoard {
    private int id;
    private String name;
    private int boardId;

    public ColumnBoard(String name, int boardId) {
        this.name = name;
        this.boardId = boardId;
    }

    public int getId() {
        return id;
    }

    public String getName() {     // <- ESTE MÉTODO É ESSENCIAL
        return name;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }
}
