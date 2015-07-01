package Problem42;

public class LeftRotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr= "abcdefg";
		LeftRotateString rotate = new LeftRotateString();
		System.out.println(rotate.getLeftRotateString(testStr, 0));
	}
	
	public String getLeftRotateString(String data, int offset){
		if(data == null || offset<0)
			return null;
		if(offset == 0 || offset ==data.length())
			return data;
		while(offset>data.length()){
			offset = offset - data.length();
		}
		char [] dataArray = data.toCharArray();
		dataArray = reverseArray(dataArray, 0, offset-1);
		dataArray = reverseArray(dataArray, offset, dataArray.length-1);
		dataArray = reverseArray(dataArray, 0, dataArray.length-1);
		return new String(dataArray);
		
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
