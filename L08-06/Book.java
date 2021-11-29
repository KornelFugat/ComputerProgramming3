public class Book{
    private String title;
    private String author;
    
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void display(){
        System.out.println("Title: " + this.title + " Author: " + this.author);
    }
    Book(String title,String author){
        this.setTitle(title);
        this.setAuthor(author);
    }
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book book2 = new Book("Harry Potter2", "J.K.Rowling");
        book1.display();
    }
}
