package Problem49;

public class String2Int {
	private boolean valid = true;
	
	public boolean isValid() {
		return valid;
	}
	
	public int getInt(String strNum){
		if(strNum == null){
			this.valid = false;
			return 0;
			
		}
		int minusNum = 1;
		long resultNum = 0;
		boolean init = true;
		char [] charNumArray = strNum.toCharArray();
		for(int i = 0; i < charNumArray.length; i++){
			if(charNumArray[0] == '+')
				minusNum = 1;
			else if (charNumArray[0] == '-')
				minusNum = -1;
			else if(charNumArray[0]<'0' || charNumArray[0] > '9'){
				valid = false;
				return 0;
			}
				
			if(i!=0&&(charNumArray[i]>'9' || charNumArray[i]<'0')){
				valid = false;
				return 0;
			}
			if(init){
				resultNum = charNumArray[i] - '0';
				
			}
			else{
				resultNum = resultNum*10L + (charNumArray[i] - '0');
			}
			
		}
		if(resultNum>Integer.MAX_VALUE){
			valid = false;
			return 0;
		}
		return (int)resultNum*minusNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
