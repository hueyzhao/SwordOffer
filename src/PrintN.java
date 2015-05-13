
public class PrintN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintN printer = new PrintN();
//		printer.printN(0);
		printer.printNtoMax(5);
	}
	

public void printN(int n){
     if(n<=0){
     return;
     }
     char data[] = new char[n+1];
     while(!increment(data)){
          printData(data);
     }
     }
     private boolean increment(char [] data){
          int length = data.length;
          int takeOver = 0;
          boolean isOverFlow = false;
          for(int i = length-1; i>0; i--){
               int digitValue = data[i] - '0' + takeOver;
               if(i==length-1)
                    digitValue++;
               if(digitValue>=10){
                    if(i-1==0)
                         isOverFlow = true;
                    else{
                    digitValue = digitValue -10;
                    data[i] = (char)('0' + digitValue);
                    takeOver = 1;
                    }  
               }
               else{
                    data[i]=(char)('0'+digitValue);
                    break;
               }
          }

          return isOverFlow;
     }
     
     private void printData(char[] data){
       if(data == null)
    	   return;
      int index = 0;
          while(data[index]=='0' && index<data.length-1){
               index++;
          }
     for(;index<data.length; index++){
          System.out.print(data[index]);
     }
          System.out.print("\n");
     }

     
     
     public void printNtoMax(int n){
    	 if(n<=0)
    		 return ;
      char [] data = new char[n];
      
     for(int i=0;i<10;i++){
          data[0]= (char)(i + '0');
     printNRecursively(data, 0);
     }
     }
     
     
     
private void printNRecursively(char [] data, int index){
	if(data == null)
		return ;
	if(data.length-1<index||index<0)
		return;

if(index==data.length-1){
          printData(data);
     }
else{
     for(int i =0; i< 10; i++){
          data[index+1] =(char) ('0' + i);
          printNRecursively(data,index+1);
     }
}
}


}
