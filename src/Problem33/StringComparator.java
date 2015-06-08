package Problem33;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override

public int compare(String first, String second){
          int firstLength = first.length();
          int secondLength = second.length();
          int longLength;

          char charOfFirst;
          char charOfSecond; 
          (firstLength > secondLength) ? (longLength = firstLength) : (longLength = secondLength);
          for(int i = 0; i< longLength; i++){
          if(i < firstLength - 1){
               charOfFirst = first.charAt(i);
          }    
          if(i<secondLength -1){
               charOfSecond = second.charAt(i);
          }
               int intOfFirst = charOfFirst - '0';
               int intOfSecond = charOfSecond - '0';
               
               if(intOfFirst>intOfSecond){
                    return 1;     
               }
               else if(intOfFirst < intOfSecond){
                    return -1;
               }
               else{
                    continue;
               }
          }
          return 0;
     }

}
