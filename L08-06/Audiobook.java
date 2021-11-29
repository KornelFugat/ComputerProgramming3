public class Audiobook extends Book{
    private int minutes;
    private int seconds;
    
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public void setSeconds(int seconds){
        this.seconds=seconds;
    }
    public int getSeconds(){
        return this.seconds;
    }
    Audiobook(String title, String author, int minutes, int seconds){
        super(title,author);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }
    public void display(){
        System.out.println("Title: " + this.getTitle() + " Author: " + this.getAuthor() + " Time: " + this.minutes + ":" + this.seconds);
    }
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book audiobook1 = new Audiobook("Harry Potter2", "J.K.Rowling",432,29);
        Book audiobook2 = new Audiobook("Harry Potter3", "J.K.Rowling",567,45);
        book1.display();
        audiobook1.display();
        audiobook2.display();
    }
}
