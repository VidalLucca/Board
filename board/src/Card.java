public class Card {
    private int id;
    private String title;
    private String description;
    private int columnId;

    public Card(String title, String description, int columnId) {
        this.title = title;
        this.description = description;
        this.columnId = columnId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {  // <--- ESTE MÉTODO PRECISA EXISTIR
        return title;
    }

    public String getDescription() {  // <--- ESTE TAMBÉM
        return description;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }
}
