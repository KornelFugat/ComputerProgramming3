import java.util.ArrayList;
public class Book{
    private String name;
    private Author author;
    private int yearOfPublishing;
    private ArrayList<Chapter> chapters = new ArrayList<Chapter>();
    
    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setYearOfPublishing (int year){
        this.yearOfPublishing = year;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYearOfPublishing(){
        return this.yearOfPublishing;
    }
    public String toString(){
        return "Name: " + this.name + " Author: " + this.author.getName() + " Year of Publishing: " + this.yearOfPublishing;
    }
    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }
    public void displayInfo(){
        System.out.println(this);
    }
    public void showChapters(){
        for(Chapter i : chapters){
            System.out.println(i);
        }
    }
    Book(String name,Author author, int yearOfPublishing){
        this.setName(name);
        this.setAuthor(author);
        this.setYearOfPublishing(yearOfPublishing);
    }
    
    public static void main(String[] args){
        Author author1 = new Author("J.K.Rowling", 1968);
        Book book1 = new Book("Harry Potter",author1, 1998);
        Book book2 = new Book("Harry Potter2",author1, 1999);
        book1.displayInfo();
        Bookcase bookcase1 = new Bookcase(30);
        bookcase1.addBook(book1);
        bookcase1.addBook(book2);
        bookcase1.displayInfo();
        bookcase1.removeBook(book1);
        bookcase1.displayInfo();
        Chapter chapter1 = new Chapter("Birthday",33,1);
        book1.addChapter(chapter1);
        book1.showChapters();
    }
}

