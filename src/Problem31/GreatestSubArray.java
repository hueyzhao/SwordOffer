package Problem31;

public class GreatestSubArray {
	public static void main(String [] args){
		GreatestSubArray subArray = new GreatestSubArray();
		int[] array = {-3,-2,-4};
		System.out.println(subArray.getGreatestSum(array));
	}

public int getGreatestSum(int [] array){
          if(array == null || array.length <=0){
          System.out.println("Invalid input");
          return -1;
          }
          int maxSum = array[0];
          int tempSum = 0;
          for(int i =0; i< array.length; i++){
               tempSum = tempSum + array[i];
               if(tempSum<0){
                    tempSum = array[i];
               }
               if(tempSum > maxSum)
                    maxSum = tempSum;
               
          }
          return maxSum;
     
     }

}
