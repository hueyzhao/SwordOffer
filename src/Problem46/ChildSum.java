package Problem46;

import java.util.ArrayList;
import java.util.List;

public class ChildSum extends FatherSum{
	private List<FatherSum> sum;
	public ChildSum(){
		sum = new ArrayList<FatherSum>();
		sum.add(this);
		sum.add(new FatherSum());
	}

}
