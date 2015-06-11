package Problem37;

import LinkList.Node;

public class CommonNode<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int getLinkListLength(Node<T> head){
	          if(head == null)
	               return -1;
	          int length = 0;
	          Node<T> next = head;
	          while(next!=null){
	               length++;
	               next = next.getNext();
	          }
	               return length;
	     }

public Node<T> getCommonNode(Node<T> linkHead1, Node<T> linkHead2){
          if(linkHead1 == null || linkHead2 == null){
                    return null;
          }
          int length1 = getLinkListLength(linkHead1);
          int length2 = getLinkListLength(linkHead2);
          Node<T> nextLink1 = linkHead1;
          Node<T> nextLink2 = linkHead2;
          if(length1>length2){
               int longer = length1 - length2;
               while(longer>0){
                    --longer;
                    nextLink1 = nextLink1.getNext();
               }
          }
          else{
               int longer = length2 - length1;
               while(longer > 0){
                    --longer;
                    nextLink2 = nextLink2.getNext();
               }
          }

          while(nextLink1 != null && nextLink2 != null && nextLink1 !=nextLink2){
                    nextLink1 = nextLink1.getNext();
                    nextLink2 = nextLink2.getNext();
          }
               return nextLink1;
     }
}
