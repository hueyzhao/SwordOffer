
public class ReplaceBlank {

	 public static char[] replaceBlank(char string[], int length){
	     if(string == null || length <= 0){
	     return null;
	     }
	     int blankCount = 0;
	     int arrayLeng = length;
	     int newLength = 0;
//	     string = new char[length];
	     int i = 0;
	     System.out.println(string[0]);
	     while(string[i]!='\0'){
	     if(string[i]== ' '){
	          blankCount++;
	          }
	     	i++;
	     }
	     newLength = blankCount + arrayLeng;
	     if(newLength > string.length)
	          return null;
	     int p1 = arrayLeng-1;
	     int p2 = newLength+1;
	     while(p1>=0){
	     if(string[p1]==' '){
	          string[p2--]='0';
	          string[p2--]='2';
	          string[p2--]='%';
	     } else{
	          string[p2--]=string[p1];
	     }
	     p1--;
	     }
	     return string;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] stringTest = "Hello World".toCharArray();
		int length = 30;
		char [] string = new char[length];
		int i = 0;
		while(i<stringTest.length){
			
			string[i]=stringTest[i];
			i++;
		}
		int originalLeng = stringTest.length;
		char [] test = replaceBlank(string,originalLeng);
//		System.out.prin/tln(test);

	}

}
