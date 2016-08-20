import java.util.ArrayList;
/**
 * Created by ScorpionOrange on 2016/07/21.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args){
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for(int i = 1; i <= 10; i++){
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
