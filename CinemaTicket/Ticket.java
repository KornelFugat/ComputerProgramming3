public class Ticket{
    static String cinemaName = "Multikino";
    String title;
    int row;
    int seat;
    float price;
    
    public void display(){
        System.out.println(cinemaName +"\n" + title +"\n" + row +"\n" + seat +"\n" + price);
    }
    
    public Ticket(int x){
        title = "Gladiator";
        row=x;
        if(row==2) {
            price = 10f;
        } else {
            price = 25f;
        }
    }  
    
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(2);
        ticket1.seat = 12;
        Ticket ticket2 = new Ticket(7);
        ticket2.seat = 10;
        ticket1.display();
        ticket2.display();
    }
    
}
