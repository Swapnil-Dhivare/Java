import java.util.ArrayList;
import java.util.List;

public class Kidwithcandies {
    public List<Boolean> kidwithcandies(){
        List<Boolean> result = new ArrayList<>();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]>max){
                max = candies[i];
            }
        }
        for (int i: candies) {
            if (i + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
