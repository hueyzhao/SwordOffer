package Promblem22;

import java.util.Stack;

public class StackPopOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public boolean isPopOrder(int[] pushOrder, int[] popOrder){
	         if(pushOrder.length<=0 || popOrder.length <=0){
	                   return false;
	          }
	          if(pushOrder.length != popOrder.length)
	                    return false;
	          boolean result = false;
	          int pushIndex = 0;
	          int popIndex = 0;
	          int length = pushOrder.length;
	          Stack<Integer> stackData = new Stack<Integer>();
	     
	          while(popIndex<length){
	        	  if(pushIndex==length)
	        		  break;
	          while(stackData.empty() || stackData.peek()!=popOrder[popIndex]){
	               if(pushIndex<length){
	               stackData.push(pushOrder[pushIndex]);
	                pushIndex++;
	               }
	             
	          }
	          if(stackData.peek()==popOrder[popIndex]){
	               stackData.pop();
	                popIndex++;
	          }
	          }
	          if(stackData.empty()&&popIndex == length){
	               result = true;
	          }
	          return result;
	     }


}
