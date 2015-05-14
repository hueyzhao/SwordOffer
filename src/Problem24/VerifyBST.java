package Problem24;

public class VerifyBST {

public boolean verifyBST(int [] postOrder, int start, int end){
          if(postOrder.length<=0||start<0||end<0){
               System.out.println("Invalid input");
               return false;
          }
          if(start==end)
               return true;
          int leftRootIndex = start;
          int rightRootIndex = start;
          int rootIndex = end;
          while(postOrder[leftRootIndex]<postOrder[rootIndex])
               leftRootIndex++;
          rightRootIndex = leftRootIndex;
          if(leftRootIndex!=start)
          leftRootIndex = leftRootIndex - 1;
          while(postOrder[rightRootIndex]>postOrder[rootIndex]){
               if(rightRootIndex!=rootIndex-1)
                    rightRootIndex++;
               else
                    break;
          }
          if(rightRootIndex == end-1){
               return verifyBST(postOrder,start, leftRootIndex)&&verifyBST(postOrder, leftRootIndex+1,rightRootIndex);
          }
          else{
               return false;
          }
     }

}
