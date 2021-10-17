public class Book{
    String title;
    String author;
    int pages;
    boolean isAvailable;
    
    public void display(){
        System.out.println(title + " " + author);
    }
    public void changeStatus(){
        isAvailable = !(isAvailable);
    }
    public void howManyPages(){
        System.out.println(pages);
    }
}
