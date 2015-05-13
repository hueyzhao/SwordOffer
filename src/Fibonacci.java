
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(10000000));//still need improve, big data can't be processed

	}
	public static long fibonacci(long n){
		if(n <= 0)
			return 0;
        int result[] = {0,1};
         if(n<2)
              return result[(int)n];
         long index =3;
         long  first = 1;
         long second = 2;
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
