
public class Chapter{
    private String name;
    private int numberOfPages;
    private int startingPage;
    public void setName(String name){
        this.name=name;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setStartingPage (int startingPage){
        this.startingPage = startingPage;
    }
    public String getName(){
        return this.name;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    public int getYearOfPublishing(){
        return this.startingPage;
    }
    public String toString(){
        return "Name: " + this.name + " Number of pages: " + this.numberOfPages + " Starting page: " + this.startingPage; 
    }
    Chapter(String name, int numberOfPages, int startingPage){
        this.setName(name);
        this.setNumberOfPages(numberOfPages);
        this.setStartingPage(startingPage);
    }
}
