package Promblem21;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> intStack;
	private Stack<Integer> minStack;

	public MinStack(){
	     this.intStack = new Stack<Integer>();
	     this.minStack = new Stack<Integer>();
	}
	     public int minValue(){
	     return this.minStack.peek();
	     }

	     public void push(int value){
	     if(this.intStack.empty()&&this.minStack.empty()){
	          this.intStack.push(value);
	          this.minStack.push(value);
	     }
	     else{
	          this.intStack.push(value);
	          int minValue = this.minStack.peek();
	          if(minValue<value){
	               this.minStack.push(minValue);
	          }     
	          else{
	               this.minStack.push(value);
	          }
	     }
	     }

	     public int pop(){
	          this.minStack.pop();
	          return this.intStack.pop();
	     }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
