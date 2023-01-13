import java.util.LinkedList;
import java.util.Queue;

public class Books {
    String title;
    int page;

    public Books(String title, int page) {
        this.title = title;
        this.page = page;
    }

    public String getTitle() {
        return title;
    }
    public static void main(String[] args) {
        Queue<Books> myBooks = new LinkedList<>();
        myBooks.add(new Books("War and Peace", 1200));
        myBooks.add(new Books("Old Yeller", 128));
        myBooks.add(new Books("Wizard of Oz", 122));
        myBooks.add(new Books("Dune", 412));
        Books b = myBooks.peek();
        Books b2 = myBooks.peek();
        Books b3 = myBooks.remove();
        System.out.printf("\nB:%s", b3.getTitle());
    }
}