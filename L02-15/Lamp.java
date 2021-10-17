
public class Lamp{
    boolean isOn;
    
    public void switchOn(){
        isOn = true;
    }
    public void switchOff(){
        isOn = false;
    }
    public void display(){
        System.out.println(isOn);
    }
}
