
public class NumberOf1 {
	public static int numberOf1(int n){
	     int digit = 1;
	     int count = 0;
	     while(digit != 0){
	     if((n & digit)!=0){
	          count ++;
	          }
	          digit = digit << 1;
	     }
	     return count;
	     }
	
	public static void main(String args[]){
		System.out.println(numberOf1(-1));
		System.out.println(numberOf0(-1));
	}

public static int numberOf0(int n){
     int m = ~n;
     int count = 0;
     while(m!=0){
          m = m&(m-1);
          count++;
     }     
     return count;
}

}
