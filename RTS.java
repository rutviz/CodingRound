import java.util.*;
import java.lang.*;

public class RTS{
    //returnig -1 if value is not in the list also assumuing that if there are more than one occurance this will consider first occurance
    public static Map<String, Integer> aboveBelow(List<Integer> list, int value){
        Map<String, Integer> result = new HashMap<>();
        if(list == null || list.size() == 0){
            result.put("below", -1);
            result.put("above", -1);
            return result;
        }
        int len = list.size();
        int index = 0;
        //find the occurance
        for(index = 0; index < len; index++){
            if(list.get(index) == value){
                break;
            }
        }
        //if no occurance is found
        if(index == len){
            result.put("below", -1);
            result.put("above", -1);
            return result;
        }
        //return the above and below
        result.put("below", index);
        result.put("above", len - index - 1);
        return result;
    }
    
    public String stringRotation(String input, int rotation){
        int len = input.length();
        rotation %= len;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < len; i++){
            result.append(input.charAt((len - rotation + i) % len));
        }
        return result.toString();
    }
}