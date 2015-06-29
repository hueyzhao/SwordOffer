package Problem41;

import java.util.ArrayList;
import java.util.List;

public class FindSumNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void printSumNums(int [] dataArray, int sum){
		if(dataArray == null || dataArray.length <= 0)
			return ;
		int first = 0;
		int last = dataArray.length -1;
		int tempSum = dataArray[first] + dataArray[last];
		List<Integer> sumArray = new ArrayList<Integer>();
		sumArray.add(dataArray[first]);
		sumArray.add(dataArray[last]);
		while(first!=last){
			if(tempSum == sum){
				for(Integer item: sumArray)
					System.out.println(item + " ");
				System.out.println();
			}
			if(tempSum < sum){
				first ++;
				tempSum += dataArray[first];
				sumArray.add(dataArray[first]);
			}
			if(tempSum > sum){
				sumArray.remove(sumArray.indexOf(dataArray[last]));
				tempSum -= dataArray[last];
				last--;
				tempSum += dataArray[last];
				sumArray.add(dataArray[last]);
				
			}
		}
	}

}
