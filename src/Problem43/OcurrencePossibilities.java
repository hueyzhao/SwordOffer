package Problem43;

public class OcurrencePossibilities {
	private int [] occurrenceArray;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OcurrencePossibilities pos = new OcurrencePossibilities();
		pos.printAllPossibilities(5);
	}
	public void printAllPossibilities(int number){
		if(number <=0)
			return ;
		occurrenceArray = new int[5*number + 1];
		int all = (int)Math.pow(6.0, (double)number);
		allPossibilities(number);
		for(int i = number; i <= 6*number; i++){
			if(occurrenceArray[i-number]!=0){
				double ratio = (double)occurrenceArray[i-number]/all;
				System.out.println(i + " : " + ratio);
			}
		}
	}
	
	private void allPossibilities(int number){
		if(number <=0)
			return ;
		for(int i = 1; i<=6; i++){
			possibilities(number, number, i);
			}
	}
	
	private void possibilities(int origin, int current, int sum){
		if(origin <= 1 || current <1 || sum<0 || occurrenceArray == null || occurrenceArray.length!=5*origin +1)
			return ;
		if(current == 1){
			occurrenceArray[sum-origin]++;
		}
		else{
			for(int i = 1; i <= 6; i++){
				possibilities(origin, current-1,sum+i);
			}
		}
	}

}
