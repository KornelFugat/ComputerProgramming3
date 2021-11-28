import java.util.ArrayList;
public class Bookcase{
    private int capacity;
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public void displayInfo(){
        for (Book i : books){
            System.out.println(i);
        }
    }
    Bookcase(int capacity){
        this.setCapacity(capacity);
    }
}
