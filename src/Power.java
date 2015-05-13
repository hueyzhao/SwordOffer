
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public double power(double base, int exponent){
	     if(exponent == 0){
	          return 1;
	     }     
	     if(exponent == 1)
	          return base;
	     
	     if(exponent <0){
	    	 return -1;
	     }
	     double result = power(base, exponent >> 1);
	     result *= result;
	     if((exponent & 0x01) ==1){
	          result *=base;
	     }
	     return result;
	}
	
	 public double powerNoRecursive(double base,int exponent){
		 if(exponent == 0){
			 return 1;
		 }
		 if(exponent == 1){
			 return base;
		 }
		 int exponentTemp = 1;
		 double result = base;
		 while(exponentTemp < exponent){
			 exponentTemp = exponent << 1;
			 result *= result;
		 }
		 if((exponent & 0x01)==1){
			 result *= base;
		 }
		 return result;
	 }
	 
	 public int divide(int dividend, int divisor){
		 if(dividend <0 || divisor < 0){
			 System.out.println("Need data to be positive");
			 return -1;
		 }
		 if(dividend ==0 || dividend <divisor){
			 return 0;
		 }
		 if(divisor == 0){
			 System.out.println("Invalid divisor");
			 return -1;
		 }
		 int divisorMul = divisor;
		 
		 int result = 0;
		 int tempResult = 1;
		 if(dividend - divisor < divisor)
			 return 1;
		 
		 while((dividend - divisorMul) > divisor){
			 while((dividend - divisorMul) > divisor){
				 divisorMul = divisorMul << 1;
				 tempResult = tempResult << 1;
			 }
			 if(divisorMul > dividend){
			 divisorMul = divisorMul >> 1;
			tempResult = tempResult >> 1;
			 }
			result = result + tempResult;
			tempResult = 1;
			dividend = dividend - divisorMul;
			
			divisorMul = divisor;
		 }
		 
		 return result;
	 }

}
