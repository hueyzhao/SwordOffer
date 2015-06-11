package Problem35;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNotRepeatingChar firstChar = new FirstNotRepeatingChar();
		char [] charArray = {'a','a','a'};
		System.out.println(firstChar.getFirstShow(charArray));
	}

public char getFirstShow(char [] charArray){
          if(charArray == null || charArray.length <=0)
               return ' ';
          Map<Character,Integer> firstShowMap = new HashMap<Character,Integer>();
          for(int i = 0; i< charArray.length; i++){
                    if(firstShowMap.get(charArray[i]) == null)
                         firstShowMap.put(charArray[i],1);
                    else{
                         int count = firstShowMap.get(charArray[i]);
                         firstShowMap.put(charArray[i], count+1);
                    }
          }
          for(int k = 0; k< charArray.length; k++){
                    if(firstShowMap.get(charArray[k]) == 1)
                         return charArray[k];
          }
          return ' ';
     }

}
