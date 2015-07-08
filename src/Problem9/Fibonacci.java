package Problem9;
/**
 * 
 * @author "huanyu"
 *frog climb stairs: there're n stairs. 
 *1 jump 1 stair, rest = f(n-1)
 *2 jump 2 stairs, rest = f(n-2)
 *f(n) = f(n-1) + f(n-2);
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(2));//still need improve, big data can't be processed

	}
	public static long fibonacci(long n){
		if(n <= 0)
			return 0;
        int result[] = {0,1};
         if(n<2)
              return result[(int)n];
         long index =2;
         long  first = 0;
         long second = 1;
         long fib = 0;
         while(index<=n){
         fib = first + second;
         first = second;
         second = fib;
         ++index;
    
    } 
         return fib;
   }

}
