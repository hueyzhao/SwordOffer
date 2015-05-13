package Problem8;

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {1,2,3};
		System.out.println(minValue(test,0,test.length-1));

	}
	

public static int minValue(int a [], int low, int high){
     if(low<0 || high < 0 || low > high || low> a.length || high > a.length){
     System.out.println("invalid Input");
           return -1;
     }
         
     int mid = (high + low)/2;
     if(a[low] < a[mid] && a[mid] < a[high]) return a[0];
     if(a[low] < a[mid] ) low = mid;
     if(a[high] > a[mid]) high = mid;
    
     if(a[low]>=a[mid]&&a[high]>=a[mid]) return a[mid];
     
     return minValue(a, low, high);
     
     
}

}
