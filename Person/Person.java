public class Person{
    String name;
    float height;
    float weight;
    public Person(String x){
        name=x;
        
    }
    public Person(String n, float w, float h){
        name=n;
        weight=w;
        height=h;
    }
    public void setWeightAndHeight(float xw,float xh){
        weight = xw;
        height = xh;
    }
    public float calculateBMI(){
        return weight/(height*height);
    }
    public void displayRecord(){
        float BMI = calculateBMI();
        System.out.println("name: " + name + "\nweight: " + weight + "\nheight: " + height + "\nBMI: " + BMI);
        if(BMI<18.5){
            System.out.println("BMI too low");
        }   else if(BMI>24.9){
            System.out.println("BMI too high");
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("Marek");
        person1.setWeightAndHeight(65f,1.80f);
        person1.displayRecord();
        Person person2 = new Person("Marek",95f,1.65f);
        person2.displayRecord();
        
    }
}
