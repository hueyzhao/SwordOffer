package Problem40;

import java.util.ArrayList;
import java.util.List;

public class NumAppearOnce {
	public int [] findNumberAppearOnce(int [] intArray){
		int [] resultList = new int[2];
		if(intArray == null || intArray.length<0)
			return null;
	
		if(intArray.length == 1){
			resultList[0]=intArray[0];
			return resultList;
		}
			
		int arrayXOR = intArray[0];
		for(int i = 1; i < intArray.length; i++){
			arrayXOR ^= intArray[i];
		}
		int firstBitNum = firstBit1(arrayXOR);
		int firstNum = 0;
		int secNum = 0;
		for(int i = 0; i < intArray.length; i++){
			if((firstBitNum&intArray[i])==0){
				if(firstNum == 0)
					firstNum = intArray[i];
				else
					firstNum ^= intArray[i];
			}
			else{
				if(secNum == 0)
					secNum = intArray[i];
				else
					secNum ^= intArray[i];
			}
			resultList[0] = firstNum;
			resultList[1] = secNum;
		}
		return resultList;
		
	}
	
	private int firstBit1(int number){
		if(number==0)
			return -1;
		int bitIndex = 0;
		while(number==0){
			number = number >> 1;
			bitIndex ++;
		}
		int result = 1;
		while(bitIndex >= 0){
			result = result <<1;
			--bitIndex;
		}
		return result;
	}
	
	
}
