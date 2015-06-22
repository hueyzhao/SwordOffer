package Problem38;

public class GetNumberofK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNumberofK numberK = new GetNumberofK();
		int [] intArray = {1,2,3,3,4,5,6};
		System.out.println(numberK.getNumberOfK(intArray, 3));
	}

private int getFirstK(int [] intArray, int start, int end, int numberK){
          if(start<0 || end <0 || start> end || intArray == null || intArray.length <=0|| end>intArray.length-1){
               return -1;
          }
          int mid = (end + start)/2;
          if(numberK == intArray[mid]){
               if(mid>0&&intArray[mid-1]==numberK){
                    return getFirstK(intArray, start, mid-1, numberK);
               }
               else if(mid >0 && intArray[mid-1]<numberK)
                    return mid;
               else if(mid == 0)
            	   return mid;
          }
          else if(numberK < intArray[mid])
               return getFirstK(intArray, start, mid-1, numberK);
          else
               return getFirstK(intArray, mid+1, end, numberK);
          
          return -1;
     }

     private int getLastK(int [] intArray, int start, int end, int numberK){

     if(start<0 || end <0 || start> end || intArray == null || intArray.length <=0|| end>intArray.length-1){
               return -1;
          }
     int mid = (end + start)/2;
     if(numberK == intArray[mid]){
          if(mid<end && intArray[mid+1] == numberK)
               return start = mid + 1;
          else if(mid<end&& intArray[mid+1]>numberK)
               return mid;
          else if(mid==end)
        	  return mid;
     }
          else if(mid<end&&numberK < intArray[mid])
               end = mid-1;
          else
               start = mid+1;
     return getLastK(intArray, start, end, numberK); 
}

public int getNumberOfK(int [] intArray, int numberOfK){
     if(intArray == null || intArray.length <=0)
          return -1;
     int lastK = getLastK(intArray, 0, intArray.length-1, numberOfK);
     int firstK = getFirstK(intArray, 0, intArray.length-1, numberOfK);
     if(lastK == -1 || firstK == -1)
    	 return -1;
     return  lastK - firstK+1;
     }

}
