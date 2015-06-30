package Problem41;

public class FindContinuousSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindContinuousSequence seq = new FindContinuousSequence();
		seq.printContinuousSequence(15);
	}
	public void printContinuousSequence(int num){
		if(num <= 2)
			return ;
		int startNum = 1;
		int endNum = 2;
		int tempSum = startNum + endNum;
		
		while(endNum < (num+1)/2&&startNum<(num+1)/2){
			if(tempSum < num){
				endNum++;
				tempSum += endNum;
			}
			else if(tempSum > num){
				tempSum -= startNum;
				startNum++;
				tempSum += startNum;
			}
			else{
				print2End(startNum, endNum);
			}
				
		}
	}
	private void print2End(int startNum, int endNum){
		if(startNum<0||endNum<0||startNum>endNum)
			return ;
		for(int num = startNum; num<=endNum; num++)
			System.out.print(num + " ");
		System.out.println();
	}

}
