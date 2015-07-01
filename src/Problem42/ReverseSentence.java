package Problem42;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "I'm an apple";
		ReverseSentence sentence = new ReverseSentence();
		System.out.println(sentence.getReverseSentence(data));

	}
	public String getReverseSentence(String setence){
		if(setence == null)
			return null;
		char [] wordsArray = setence.toCharArray();
		wordsArray = reverseArray(wordsArray, 0, wordsArray.length-1);
		int start = 0;
		int end = 0;
		while(end<=wordsArray.length-1){
			
			if(wordsArray[end] == ' '){
				wordsArray = reverseArray(wordsArray, start, end-1);
				if(end+1 <= wordsArray.length)
					start = end+1;
			}
			end ++;
		}
		return new String(wordsArray);
		
	}
	private char [] reverseArray(char [] dataArray, int start, int end){
		if(start < 0||end < 0 || start > end || start>=dataArray.length||end >=dataArray.length){
			return null;
		}
		while(start < end){
			char temp = dataArray[start];
			dataArray[start] = dataArray[end];
			dataArray[end] = temp;
			start ++;
			end --;
		}
		return dataArray;
	}

}
