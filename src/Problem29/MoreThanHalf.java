package Problem29;

public class MoreThanHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreThanHalf half = new MoreThanHalf();
		int [] array = {1,2,3,4,1};
		System.out.println(half.partitionMoreThanHalf(array));
	}
	 public int partitionMoreThanHalf(int [] array){
         if(array == null || array.length <=0)
              return -1;
         int midValue =  partition(array, 0, array.length-1);
         if(!checkMoreThanHalf(array,midValue)){
              return -1;
         }
         return midValue;
    }
    private boolean checkMoreThanHalf(int [] array, int value){
         boolean isMoreThanHalf = true;
         int times = 0;
         for(int i = 0; i < array.length; i++){
              if(array[i]==value) times++;
         }
         if(times<array.length/2){
                   isMoreThanHalf = false;
         }
         return isMoreThanHalf;
     }
    private int partition(int [] array, int start, int end){
         if(array == null || start<0 || end <0 || start > end)
              return -1;
         if(array.length == 0)
              return -1;
         if(start == end)
              return array[start];
         int endPosition = end;
         int startPosition = start;
         int midIndex = (array.length-1)/2;
         int midValue = array[midIndex];
         while(start < end){
              while(start < end&&array[start] <= midValue ) start++;
              int temp = array[start];
              array[start] = midValue;
              array[midIndex] = temp;
              midIndex = start;
              while(start < end && array[end]>=midValue ) end--;
              int endTemp = array[end];
              array[end] = midValue;
              array[midIndex] = endTemp;
              midIndex = end;
         }
         if(midIndex == (array.length-1)/2)
              return array[midIndex];
         else if(midIndex>(array.length-1)/2){
              return partition(array,startPosition,midIndex-1);
         }
         else {
               return partition(array,midIndex+1, endPosition);
         }
         
    }

}
