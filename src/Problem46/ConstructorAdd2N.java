package Problem46;

public class ConstructorAdd2N {
	private static int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorAdd2N add = new ConstructorAdd2N();
		System.out.println(getSum());
	}
	public ConstructorAdd2N(){
		System.out.println("Add 1");
		addSum();
	}
	private void addSum(){
		sum ++;
		
	}
	public static int getSum(){
		return sum;
	}

}
