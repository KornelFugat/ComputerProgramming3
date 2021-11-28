import java.util.Arrays;
import java.util.Collections;

public class Diagram{
    public int[] scores;
    Diagram(int[] scores){
    this.scores = scores;
    }
    public int sumOfElements(){
    int sum=0;
    for (int value : scores) {
        sum+=value;
    }
    return sum;
    }
    public double countScore(){
    double score = 0;
    int min = Arrays.stream(scores).min().getAsInt();
    int max = Arrays.stream(scores).max().getAsInt();
    int fullScore = sumOfElements()-min-max;
    double fullScoreDb = fullScore;
    score = fullScoreDb/3;
    System.out.println(score);
    return score;
    }
    public static void main (String[] args){
        Diagram player1 = new Diagram(new int[] {1,4,3,4,5});
        player1.countScore();
        Diagram player2 = new Diagram(new int[] {5,4,3,4,5});
        player2.countScore();
        Diagram player3 = new Diagram(new int[] {2,4,1,5,2});
        player3.countScore();
    }
    
}

