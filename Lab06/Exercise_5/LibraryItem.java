package Exercise_5;

public class LibraryItem {
    protected String _title;
    protected int _id;

    public LibraryItem(String title, int id) {
        this._title = title;
        this._id = id;
    }

    public void display_info() {
        System.out.println("Title: " + _title);
        System.out.println("ID: " + _id);
    }
}

