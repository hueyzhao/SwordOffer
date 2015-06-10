package Problem34;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNumber ugly = new UglyNumber();
		System.out.println(ugly.getUglyNumber(1500));

	}

	 public int getUglyNumber(int index){
	          int [] uglyArray = new int[index];
	          uglyArray[0]=1;
	          int nextIndex = 1;
	          int multi2 = 0;
	          int multi3 = 0;
	          int multi5 = 0;
	          int minValue = 0;
	          while(nextIndex<index){
	          minValue = minNum(uglyArray[multi2]*2,uglyArray[multi3]*3,uglyArray[multi5]*5);
	          uglyArray[nextIndex] = minValue;
	          while(uglyArray[multi2]*2 <= uglyArray[nextIndex])
	               multi2++;
	          while(uglyArray[multi3]*3 <= uglyArray[nextIndex])
	               multi3++;
	          while(uglyArray[multi5]*5 <= uglyArray[nextIndex])
	               multi5++;

	          nextIndex++;
	     }
	     return uglyArray[nextIndex-1];
	     }
	     
	     public int minNum(int num1, int num2, int num3){
	          int min = (num1>num2)?num2:num1;
	          min = (min>num3)? num3:min;
	          return min;
	     }

}
