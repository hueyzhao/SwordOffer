package Problem30;

import java.util.Map;
import java.util.TreeMap;

public class LeastKeyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastKeyNum keys = new LeastKeyNum();
		int array [] ={95,234,45,67,89,2,2,2,21,96,12,34};
		Map<Integer,Integer> keyMap = keys.returnLeaskKNum(array, 120);
		System.out.println(keyMap.keySet());
	}
	
	public Map<Integer,Integer> returnLeaskKNum(int [] array, int k){
		if(array == null || array.length==0||k<=0 || k> array.length){
			return null;
		}
		TreeMap<Integer,Integer> redBlackTree = new TreeMap<Integer,Integer>();
		for(int arrayIndex = 0; arrayIndex < array.length; arrayIndex++){
			if(redBlackTree.size()<k)
				redBlackTree.put(array[arrayIndex],arrayIndex);
			else{
				int biggestInt = redBlackTree.lastKey();
				if(biggestInt>array[arrayIndex]){
					redBlackTree.pollLastEntry();
					redBlackTree.put(array[arrayIndex], arrayIndex);
				}
			}
		}
		return redBlackTree;
	}

}
