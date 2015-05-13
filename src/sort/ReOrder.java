package sort;

public class ReOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReOrder order = new ReOrder();
		IComparator<Integer> comparator = new EvenComparator();
		int [] sort = {3,4,6,8,1,5,9};
		order.reOrder(sort, comparator);
		for(int i = 0; i< sort.length; i++){
			System.out.println(sort[i]);
		}

	}
	


public void reOrder(int [] sort, IComparator<Integer> comparator){
     if(sort == null || comparator == null)
          return ;
     int arrayLength = sort.length;
     if(arrayLength == 1 || arrayLength == 0){
          return ;
     }
     int low = 0;
     int hight = arrayLength - 1;


     while(low <= hight){
          while(!comparator.compare(sort[low])) low ++;
          while(comparator.compare(sort[hight])) hight--;
          if(low<hight){
          int temp = sort[low];
          sort[low] = sort[hight];
          sort[hight] = temp;
          }
          
     }
	}

}
