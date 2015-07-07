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
		if(charNumArray.length == 1 && (charNumArray[0]<'0' || charNumArray[0] > '9')){
			valid = false;
			return 0;
		}
		for(int i = 0; i < charNumArray.length; i++){
			if(charNumArray[i] == '+' && i == 0){
				minusNum = 1;
				continue;
				}
			else if (charNumArray[i] == '-' && i == 0){
				minusNum = -1;
				continue;
			}
			else if(charNumArray[i]<'0' || charNumArray[i] > '9'){
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
