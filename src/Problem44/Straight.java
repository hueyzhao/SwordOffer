package Problem44;

import java.util.Arrays;

public class Straight {

	
	public boolean isStraight(int [] straightArray){
		if(straightArray == null || straightArray.length!=5){
			return false;
		}
		boolean flag = false;
		int numberOfKing = 0;
		Arrays.sort(straightArray);
		for(int i = 0; i<straightArray.length; i++){
			if(straightArray[i]<0 || straightArray[i]>13)
				return false;
			if(straightArray[i] == 0){
				numberOfKing ++;
				continue;
				}
			if(i<straightArray.length-1){
				if(straightArray[i]+1==straightArray[i+1])
					flag = true;
				else{
					int diff = straightArray[i+1] - straightArray[i] -1;
					numberOfKing -= diff;
					if(numberOfKing < 0){
						flag = false;
						break;
					}
						
				}
			}
				
				
		}
		return flag;
		
	}
}
