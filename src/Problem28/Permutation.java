package Problem28;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation per = new Permutation();
//		char [] array = {'a'};
//		char [] array = {};
		char [] array = {'a','b','c','d'};
		per.showAllPermutations(array);
	}
	public void showAllPermutations(char [] array){
		if(array == null)
			return ;
        if(array.length<=0)
             return;
        if(array.length == 1){
             System.out.println(array[0]);
               return;
        }
        permutations(array,0);
}
   private void permutations(char [] array, int startIndex){
        if(startIndex>array.length-1)
                  return;
        if(startIndex == array.length-1){
             for(int k = 0; k< array.length; k++){
                       System.out.print(array[k] + " ");     
             }
             System.out.println();
        }
             
        for(int i = startIndex;i<array.length; i++){
             char temp = array[startIndex];
             array[startIndex] = array[i];
             array[i] = temp;
             permutations(array, startIndex+1);
             temp = array[startIndex];
             array[startIndex] = array[i];
             array[i] = temp;
        }
   }

}
