import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList{
    ArrayList<String> list = new ArrayList<String>();  
    public void addItem(){
        int number = displayNumber();
        for(int i=0;i<number;i++){
            System.out.println("enter in the name of the product");
            Scanner keyboard = new Scanner(System.in);
            String ItemName=keyboard.nextLine();
            list.add(ItemName);
        }
        
    }
    public int displayNumber(){
        System.out.println("enter the number of products");
        Scanner numb = new Scanner(System.in);
        int number =numb.nextInt();
        System.out.println("number of products to purchase: " + number);
        return number;
    }
    public void displayList(){
        System.out.println("shopping list:");
        System.out.println(list);
    }
    public static void main(String[] args){
        ShoppingList list1=new ShoppingList();
        list1.displayList();
        list1.addItem();
        list1.displayList();
        
        
        
    }
}
