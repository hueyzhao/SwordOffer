package sort;

public class QSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QSort sort = new QSort();
		int test [] = {4,3,2,4,7,8};
		sort.qSort(test,0,test.length-1);
		System.out.println(sort);

	}
	
	private int partition(int a[], int low, int high){
		if(a ==null || low<0||high<0||low>high || high > a.length || low > a.length)
			return -1;
		int midNum = a[low];
		while(low<high){
			while( low< high && a[high]>=midNum) high--;
			a[low] = a[high];
			while(low<high&& a[low]<= midNum) low++;
			a[high] = a[low];
		}
		a[low]= midNum;
		return low;
	}

	public int [] qSort(int [] sort, int low, int high){
		if(sort == null || sort.length<=0){
			return null;
		}
		int mid = partition(sort, low, high);
		if(mid>low)
		qSort(sort, low, mid-1);
		if((mid+1)<high)
		qSort(sort, mid+1, high);

		return sort;
	}

}
