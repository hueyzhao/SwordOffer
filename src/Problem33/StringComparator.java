package Problem33;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override

public int compare(String first, String second){
          int firstLength = first.length();
          int secondLength = second.length();
          int longLength;

          char charOfFirst = 0;
          char charOfSecond = 0; 
          longLength = (firstLength > secondLength) ? (firstLength) : (secondLength);
          for(int i = 0; i< longLength; i++){
          if(i < firstLength ){
               charOfFirst = first.charAt(i);
          }    
          if(i<secondLength){
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
