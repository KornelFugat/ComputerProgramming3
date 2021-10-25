import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Locale;
public class StudentGrades{ 
    String studentName; 
    double[] grades;
    
    
    StudentGrades(String name, double[] grades) { 
        this.studentName = name; 
        this.grades = grades; 
    } 
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        for (int i = 0; i < grades.length; i++) {
           grades[i] = new Random().nextInt(5);
        }
    }
    StudentGrades(String name) { 
        this.studentName = name; 
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int n= scan.nextInt();
        this.grades = new double[n];
        for (int i = 0; i < grades.length; i++){
            grades[i] = scan.nextDouble();
        }
    } 
    public double lowestGrade(){
        double grade = grades[0];
        
        for(double i : grades) {
            if(i<grade){
                grade=i;
            } else {
                continue; 
            }
        }
        System.out.println(grade);
        return grade;
    }
    public double highestGrade(){
        double grade = grades[0];
        
        for(double i : grades) {
            if(i>grade){
                grade=i;
            } else {
                continue; 
            }
        }
        System.out.println(grade);
        return grade;
    }
    public int numberOfGrades(){
        System.out.println(grades.length);
        return grades.length;
    }
    public double average(){
        int counter=0;
        int sum=0;
        for(double i : grades) {
            counter+=1;
            sum+=i;
        }
        System.out.println(sum/counter);
        return sum/counter; 
    }
    public void display(){
        System.out.println(studentName + " " + Arrays.toString(grades) + " " + numberOfGrades() + " " + lowestGrade() + " " + highestGrade() + " " + average());
    }
    public static void main(String[] args){
        double gradesAmanda[] = {3.5,4.5,4.0,2.0,5.0,3.5,3.5};
        StudentGrades student1 = new StudentGrades("Amanda",gradesAmanda);
        student1.lowestGrade();
        student1.highestGrade();
        student1.numberOfGrades();
        student1.average();
        student1.display();
        StudentGrades student2 = new StudentGrades("Max", 6);
        student2.lowestGrade();
        student2.highestGrade();
        student2.numberOfGrades();
        student2.average();
        student2.display();
        StudentGrades student3 = new StudentGrades("Jack");
        student3.lowestGrade();
        student3.highestGrade();
        student3.numberOfGrades();
        student3.average();
        student3.display();
        }
    }
