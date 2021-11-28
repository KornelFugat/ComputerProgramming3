import java.util.ArrayList;
public class Author{
    private String name;
    private int yearOfBirth;
    private ArrayList<Book> writtenBooks = new ArrayList<Book>();
    
    public void setName(String name){
        this.name=name;
    }
    public void setYearOfBirth (int year){
        this.yearOfBirth = year;
    }
    public String getName(){
        return this.name;
    }
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
    Author(String name, int yearOfBirth){
        this.setName(name);
        this.setYearOfBirth(yearOfBirth);
    }
}

