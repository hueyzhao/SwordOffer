package Problem30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LeastKeyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastKeyNum keys = new LeastKeyNum();
		int array [] ={95,234,45,67,89,2,2,2,21,96,12,34};
		Map<Integer,Integer> keyMap = keys.returnLeaskKNum(array, 5);
		Set<Integer> leastKeys = keyMap.keySet();
		Iterator<Integer> it = leastKeys.iterator();
		while(it.hasNext()){
			int oneKey = it.next();
			int count = keyMap.get(oneKey);
			while(count>=1){
				count--;
				System.out.println(oneKey);
			}
		}
//		System.out.println(keyMap.keySet());
	}
	
	public Map<Integer,Integer> returnLeaskKNum(int [] array, int k){
		if(array == null || array.length==0||k<=0 || k> array.length){
			return null;
		}
		TreeMap<Integer,Integer> redBlackTree = new TreeMap<Integer,Integer>();
		int treeMapSize = 0;
		for(int arrayIndex = 0; arrayIndex < array.length; arrayIndex++){
			if(treeMapSize<k){
				if(redBlackTree.get(array[arrayIndex])==null)
				redBlackTree.put(array[arrayIndex],1);
				else{
					int count = redBlackTree.get(array[arrayIndex]);
					redBlackTree.put(array[arrayIndex], ++count);
				}
				treeMapSize++;
				}
			else{
				int biggestInt = redBlackTree.lastKey();
				if(biggestInt>array[arrayIndex]){
						int count = redBlackTree.get(biggestInt);
					if(count > 1){
						redBlackTree.put(biggestInt, --count);
					}
					else
						redBlackTree.pollLastEntry();
					
					if(redBlackTree.get(array[arrayIndex])==null)
						redBlackTree.put(array[arrayIndex], 1);
					else {
						int newCount = redBlackTree.get(array[arrayIndex]);
						redBlackTree.put(array[arrayIndex], ++newCount);
					}
				}
			}
		}
		return redBlackTree;
	}

}
