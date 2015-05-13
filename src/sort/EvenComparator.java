package sort;

public class EvenComparator implements IComparator<Integer> {

	@Override
	public boolean compare(Integer o1) {
		// TODO Auto-generated method stub
		int data = o1.intValue();
		
		return ((data&1)==0);
	}

}
