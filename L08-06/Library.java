import java.util.ArrayList;
public class Library{
    ArrayList<Book> books = new ArrayList<Book>();
    
    public void addBook(Book book){
        books.add(book);
    }
    public void display(){
        for (Book i : books){
            display();
        }
    }
    public static void main(String[] args){
        Library library1 = new Library();
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book ebook1 = new Ebook("Harry Potter", "J.K.Rowling","HP1");
        Book audiobook1 = new Audiobook("Harry Potter2", "J.K.Rowling",432,29);

        
        
        
    }
}

