public class Stats{
    static void numberOfItems(int x,int y){
        int count=0;
        for (int i = x; i<=y;i++){
            count = count+1;
        }
        System.out.println(count);
    }
    static void sumOfItems(int x,int y){
        int count=0;
        for (int i = x; i<=y;i++){
            count = count+i;
        }
        System.out.println(count);
    }
    static void meanOfItems(int x,int y){
        int count=0;
        int sum=0;
        for (int i = x; i<=y;i++){
            sum = sum+i;
            count = count+1;
        }
        System.out.println(sum/count);
    }
    public static void main(String[] args){
        numberOfItems(5,10);
        sumOfItems(5,10);
        meanOfItems(5,10);
    }
}
