
public class Room{
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int num){
        this.number=num;
        this.beds=2;
        this.occupied=true;
    }
    Room(int num,int b){
        this.number = num;
        this.beds = b;
        this.occupied=true;
    }
    public void checkin(String name){
        guestName=name;
    }
    public void checkout(){
        guestName=null;
    }
    public boolean isOccupied(){
        System.out.println(occupied);
        return occupied;
    }
    public void displayStatus(){
        System.out.println(number + " " + beds + " " + isOccupied() + " " + guestName); 
    }
    public static void main(String[] args){
        Room[] rooms = new Room[6];
        Room room1 = new Room(1);
        rooms[0] = room1;
        Room room2 = new Room(2);
        rooms[1] = room2;
        Room room3 = new Room(3);
        rooms[2] = room3;
        Room room4 = new Room(4,3);
        rooms[3] = room4;
        Room room5 = new Room(5,3);
        rooms[4] = room5;
        Room room6 = new Room(6,1);
        rooms[5] = room6;

        }
    }


