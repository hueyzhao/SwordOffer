package sort;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {3,6,1,9,4,5,7};
		HeapSort sort = new HeapSort();
		int [] result = sort.heapSort(test);
		System.out.println(result);

	}
	private int [] heapAdjust(int [] a, int s, int m){//adjust a[s] to its right heap place
		int maxIndex = m;
		int rcValue = a[s];
		for(int i = 2*(s+1)-1; i <= maxIndex; i *= 2){ //this is index, can be equal
			if(i!=maxIndex && a[i] < a[i+1]) i++; //don't forget to add i!=maxIndex
			if(rcValue > a[i]) break;
			a[s] = a[i]; s = i;
		}
		
		a[s] = rcValue;
		return a;
		}

		public int[] heapSort(int [] sort){
		for(int i = (sort.length-1)/2-1; i >=0; i--){
				heapAdjust(sort, i, sort.length - 1);//set sort[] to be a heap
			}
		for(int j = sort.length-1; j >0; j--){
				int temp = sort[j];//exchange the biggest value to the end
				sort[j] = sort[0];//and the end value to the first place
				sort[0] = temp;
				heapAdjust(sort, 0, j-1);//adjust rest to heap
			}
		return sort;
		
		}


}
