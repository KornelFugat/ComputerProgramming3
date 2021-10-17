
public class Student{
    String name;
    String idCard;
    boolean isValid;
    String semesterNumber;
    float averageGrade;
    
    public void display(){
        System.out.println(name + semesterNumber + averageGrade);
    }
    public void changeValid(){
    isValid = !(isValid);
    }

}
