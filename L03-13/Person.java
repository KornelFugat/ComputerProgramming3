public class Person {
    String name;
    double weight;
    double height;
    
    Person(String name) {
        this.name = name;
    }
    Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    void setWeightandHeight(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    double calculateBMI() {
        return weight/((height*0.01)*(height*0.01));
    }
    void displayRecord() {
        System.out.println("Name: " + this.name + " " + "Weight(kg): " + this.weight + " " + "Height(cm): " + this.height + " " + "BMI: " + this.calculateBMI());
        if (this.calculateBMI() < 18.5) {
            System.out.println("BMI too low");
        }
        if (this.calculateBMI() > 24.9) {
            System.out.println("BMI too high");
        }
    }
    public static void main(String[] args) {
        Person Jakub = new Person("Jakub", 48, 175);
        Person Jan = new Person("Jan", 63, 170);
        Person Michal = new Person("Michal", 113, 192);
    
        Jakub.displayRecord();
        Jan.displayRecord();
        Michal.displayRecord();
    }
    
    
}