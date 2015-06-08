package Problem33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = {0,1023,0,4};
		PrintMinNum minNum  = new PrintMinNum();
		minNum.printMinNum(intArray);
		
	}

public void printMinNum(int [] array){
          if(array == null || array.length <=0){
                    return ;
          }
          int arrayLength = array.length;
          List<String> arrayList = new ArrayList<String>();
          for(int i = 0; i< arrayLength; i++){
               int ele = array[i];
               arrayList.add(new Integer(ele).toString());
          }
          Comparator stringCom = new StringComparator();
          Collections.sort(arrayList, stringCom);
          
          for(String ele : arrayList){
               System.out.print(ele);
          }
               System.out.println();
          
          
     }

}
