package Problem41;

import java.util.ArrayList;
import java.util.List;

public class FindSumNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] dataArray = {1,2,4,7,11,15};
		FindSumNums sumNums = new FindSumNums();
		sumNums.printSumNums(dataArray, 15);
	}
	public void printSumNums(int [] dataArray, int sum){
		if(dataArray == null || dataArray.length <= 0)
			return ;
		int first = 0;
		int last = dataArray.length -1;
		
		
		while(first!=last){
			int tempSum = dataArray[first] + dataArray[last];
			if(tempSum == sum){
				System.out.println(dataArray[first]);
				System.out.println(dataArray[last]);
				break;
			}
			if(tempSum < sum){
				first ++;
			}
			if(tempSum > sum){
				last--;
				
			}
		}
	}

}
