public class Book{
    private String author;
    private int pages;
    private boolean isBorrowed;
    
    Book(String author, int pages, boolean isBorrowed){
        this.setAuthor(author);
        this.setPages(pages);
        this.setIsBorrowed(isBorrowed);
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPages(){
        return this.pages;
    }
    public boolean getIsBorrowed(){
        return this.isBorrowed;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }
    
}
