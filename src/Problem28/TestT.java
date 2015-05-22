package Problem28;

import java.util.*;
import java.io.*;
public class TestT{
  public static void main(String[] args)throws Exception{
    String [] array=new String[]{"A","B","C","D"};
    listAll(Arrays.asList(array),"");

}

public static void listAll(List candidate,String prefix){
         System.out.println(prefix);
         for(int i=0;i<candidate.size();i++){
          List temp =new LinkedList(candidate);
          listAll(temp,prefix+temp.remove(i));
        }
  }
 public void combine(String str) {
    char[] in = str.toCharArray();
    StringBuffer out = new StringBuffer();
    allCombine(in, out, 0);
}

private void allCombine(char[] in, StringBuffer out, int start) {
    for (int i = start; i < in.length; i++) {
        out.append(in[i]);
        System.out.println(out);
        if (i < in.length - 1) {
            allCombine(in, out, i + 1);
        }
        out.setLength(out.length() - 1);
    }
}
}
