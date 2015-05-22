package Problem28;

public class Combination {

	public void printCombinations(char [] data){
		int length = data.length;
		for(int combLength = 1; combLength<=length;combLength++){
			char [] result = new char[combLength];
			allCombinations(data,result,0,combLength);
		}
	}
  
	
	private void allCombinations(char [] in, char [] out, int start, int combLength){
		int resultLength = out.length;
		int dataLength = in.length;
		for(int i = start; i < dataLength-combLength+1; i++){
			out[combLength-1] = in[i];
			if(0==combLength-1){
				for(int resultIndex = out.length-1; resultIndex>=0;resultIndex--)
					System.out.print(out[resultIndex]);
				System.out.println();
			}
			else{
				allCombinations(in,out,i+1,combLength-1);
			}
		}
	}
     public static void main(String [] args){
    	 Combination comb = new Combination();
    	 char [] array = {'a','b','c','d'};
//    	 comb.combinationTest(array);
    	 comb.printCombinations(array);
     }

}
