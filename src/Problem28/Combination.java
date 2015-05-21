package Problem28;

public class Combination {
	  public void showCombination(char [] array){
          int length = array.length;
          if(length<=0)
               return;
          printCombination(array, 0, length-1);
     }
     private void printCombination(char [] array, int startIndex, int endIndex){
     if(startIndex<0 || endIndex < 0 )
          return ;
     int length = array.length;
     if(startIndex > (length -1)|| endIndex > (length - 1)){
          return;
     }
     if(startIndex>endIndex)
          return;
     while(endIndex>startIndex){
    	 printCombination(array,startIndex,endIndex-1); 
     }
     for(int i = startIndex; i<=endIndex; i++){
          System.out.println(array[i]);
     
     }
     
     }
     
     public void combinationTest(char [] array){
    	 if(array == null||array.length==0)
    		 return;
    	 int pick=0;
    	 int tempLength = array.length;
    	 for(;tempLength>=1;tempLength--){
    	 for(int start=pick= 0; start<array.length&&pick<array.length;start++){
    		 if(tempLength == 1){
    			 for(int index = 0; index < array.length; index++){
    				 System.out.println(array[index]);
    			 }
    			 break;
    		 }
    		 
    		 pick=start;
    		 pick++;
    		 while((array.length-pick)>=tempLength-1){
    		 printTest(array,start,pick,tempLength); 
    		 System.out.println();
    		 pick++;
    		 }
    		 pick=start;
    	 }
    	}
    	 
     }
     private void printTest(char [] array, int startIndex,int pick, int length){
    	 

    	 if(length>0&&(array.length-pick)>=length-1&&pick<array.length){
    		 System.out.print(array[startIndex]);
    		 startIndex = pick; 
    		 printTest(array,startIndex,pick+1,length-1);
    	 }
    	
    		 
    
     }
     
     public static void main(String [] args){
    	 Combination comb = new Combination();
    	 char [] array = {'a','b','c','d'};
    	 comb.combinationTest(array);
     }

}
