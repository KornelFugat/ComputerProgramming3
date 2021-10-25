public class InternetDevice{
    String name;
    boolean connected;
    static int connectedDevices;
    
    public InternetDevice(String name){
    this.name=name;
    }
    
    public void connect(){
        connectedDevices+=1;
        connected = true;
    }
    public void disconnect(){
        connected = false;
    }
    public void isConnected(){
        System.out.println(connected);
    }
    public void displayStatus(){
        if(connected){
            System.out.println(name+" is connected");
        } else {
            System.out.println(name+" is disconnected");
        }
        
    }
    static void displayConnections(){
        System.out.println(connectedDevices);
    }
    public static void main(String[] args){
        InternetDevice device1 = new InternetDevice("PC");
        device1.connect();
        InternetDevice device2 = new InternetDevice("phone");
        InternetDevice device3 = new InternetDevice("radio");
        InternetDevice device4 = new InternetDevice("TV");
        device4.connect();
        InternetDevice device5 = new InternetDevice("smartphone");
        device5.connect();
        device1.displayStatus();
        device2.displayStatus();
        device3.displayStatus();
        device4.displayStatus();
        device5.displayStatus();
        displayConnections();
        

    }
}
