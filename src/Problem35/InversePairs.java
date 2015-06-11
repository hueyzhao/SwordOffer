package Problem35;

public class InversePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countInversePairs(int [] intArray){
        int [] tempArray = new int[intArray.length];
        return mergeTwoPairs(intArray, tempArray, 0, intArray.length);
        
   }
   private int mergeTwoPairs(int [] dataArray, int [] tempArray, int low, int high){
        if(dataArray == null || tempArray == null || dataArray.length<=0 || tempArray.length<=0||tempArray.length!=dataArray.length){
             return -1;
        }
        if(low==high){
             tempArray[low]=dataArray[low];
             return 0;
        }
        int leftCount = mergeTwoPairs(tempArray,dataArray,low,(low+high)/2);
        int rightCount = mergeTwoPairs(tempArray,dataArray, (low+high)/2+1,high);
        int mid = (low + high)/2;
        int leftHigh = mid;
        int rightHigh = high;
        int tempIndex = high;
        int inversePairCount = 0;
        while(leftHigh>=low&&rightHigh>=mid+1){
             if(dataArray[leftHigh]>dataArray[rightHigh]){
                       inversePairCount += high - mid;
                       tempArray[tempIndex--] = dataArray[leftHigh--];
             }
             else{
                       tempArray[tempIndex--] = dataArray[rightHigh--];
             
             }
        }
        return inversePairCount + leftCount + rightCount;
   }

}
