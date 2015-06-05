package Problem32;

public class NumberOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			NumberOf1 num = new NumberOf1();
			System.out.println(num.numberOf1Between2AndN(21345));
	}
	public int numberOf1Between2AndN(int n){
		if( n<=0)
			return 0;
		Integer tempInt = new Integer(n);
		char [] strN = tempInt.toString().toCharArray();
		
		return numberOf1(strN);
	}
	private int numberOf1(char [] strN){
		if(strN == null || strN.length <= 0){
			return 0;
		}
		int first = strN[0] - '0';
		int length = strN.length;
		char [] newArray = moveArray(strN,1);
		if(length == 1 && first == 0)
			return 0;
		if(length == 1 && first >0)
			return 1;
		//num of 1 at highest digit
		int numFirstDigit = 0;
		if(first >1) 
			numFirstDigit = this.powerBase10(length-1);
		else if(first == 1){
			numFirstDigit = Integer.parseInt(new String(newArray))+1;
		}
		//number of 1 at other digits
		int numOtherDigits = first * (length-1)*powerBase10(length-2);
		//remove highest digit, get the number of 1 recursively
		int numRecursive = numberOf1(newArray);
		
		return numFirstDigit + numOtherDigits + numRecursive;
	}
	
	private int powerBase10(int n){
		int result = 1;
		for(int i =0; i<n; i++){
			result *=10;
		}
		return result;
	}
	
	private char [] moveArray(char[] array, int offset){
		if(array == null || array.length<=0 || offset<0)
			return null;
		int length = array.length;
		char []  newChar = new char[length-1];
		for(int i =offset; i<length; i++){
			newChar[i-offset] = array[i];
		}
		return newChar;
	}

}
