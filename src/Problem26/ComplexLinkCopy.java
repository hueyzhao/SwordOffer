package Problem26;

public class ComplexLinkCopy<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public ComplexLinkNode<T> copyComplexLink(ComplexLinkNode<T> head){
     cloneNodes(head);
     copySiblings(head);
     return returnCloneLink(head);

}

private void cloneNodes(ComplexLinkNode<T> head){
     if(head == null)
          return ;
     ComplexLinkNode<T> cloneNext = head;
     while(cloneNext!=null){
     ComplexLinkNode<T> cloneNode = new ComplexLinkNode<T>();
     
     cloneNode.setData(cloneNext.getData());
     cloneNode.setNext(cloneNext.getNext());
     cloneNext.setNext(cloneNode);
     cloneNext = cloneNode.getNext();
     }
}

private void copySiblings(ComplexLinkNode<T> head){
     if(head == null)
               return ;
     ComplexLinkNode<T> nextNode = head;
     while(nextNode != null){
          if(nextNode.getSibling()!=null&&nextNode.getNext()!=null){
               ComplexLinkNode<T> cloneNode = nextNode.getNext();
               cloneNode.setSibling(nextNode.getSibling().getNext());
          
          }
          nextNode = nextNode.getNext().getNext();
     }

}

private ComplexLinkNode<T> returnCloneLink(ComplexLinkNode<T> head){
     if(head == null)
          return null;
     ComplexLinkNode<T> originHead = head;
     ComplexLinkNode<T> cloneHead = head.getNext();
     ComplexLinkNode<T> originNext = head;
     ComplexLinkNode<T> cloneNext = head.getNext();
     int count = 1;
     while(originNext != null&&cloneNext!=null){
          if((count & 0x01)==1){
               originNext.setNext(originNext.getNext().getNext());
               originNext = originNext.getNext();
          }
          else{
               cloneNext.setNext(cloneNext.getNext().getNext());
               cloneNext = cloneNext.getNext();
          }
     }
     return cloneHead;
}

}
