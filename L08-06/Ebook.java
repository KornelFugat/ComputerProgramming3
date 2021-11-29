public class Ebook extends Book{
   private String fileName;
   
   public void setFileName(String fileName){
        this.fileName=fileName;
    }
    public String getFileName(){
        return this.fileName;
    }
    
   Ebook(String title,String author,String fileName){
        super(title,author);
        this.setFileName(fileName);
    }
    
    public void display(){
        System.out.println("Title: " + this.getTitle() + " Author: " + this.getAuthor() + " File name: " + this.fileName);
    }
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter", "J.K.Rowling");
        Book ebook1 = new Ebook("Harry Potter", "J.K.Rowling","HP1");
        Book ebook2 = new Ebook("Harry Potter2", "J.K.Rowling","HP2");
        book1.display();
        ebook1.display();
        ebook2.display();
    }
}
