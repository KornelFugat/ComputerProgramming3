public class Clock{  
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    Clock(){
        hour=00;
        minute=00;
    }
    Clock(int h,int min){
        this.hour = h;
        this.minute = min;
    }
    
    public void setClock(int h,int min){
        hour=h;
        minute=min;
    }
    public void setClock(){
        hour=00;
        minute=00;
    }
    public void displayTime(){
        System.out.println(hour + ":" + minute);
    }
    public void setAlarm(int h,int min){
        alarmHour=h;
        alarmMinute=min;
    }
    static void runAlarm(){
        System.out.println("beep-beep-beep-beep !!");
    }
    public void addOneMinute(){
        if(minute<59){
            minute+=1;
        } else {
            if(hour<23){
                minute=00;
                hour+=1;
            } else{
                minute=00;
                hour=00;
            }
        }
        if (hour==alarmHour && minute==alarmMinute){
            runAlarm();
        }
    }
    public static void main(String[] args){
        Clock clock1 = new Clock(12,47);
        clock1.displayTime();
        clock1.setClock(18,14);
        clock1.setAlarm(23,59);
        clock1.displayTime();
        clock1.setClock(9, 3);
        clock1.displayTime();
        clock1.setClock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        
        
        
    }
}
