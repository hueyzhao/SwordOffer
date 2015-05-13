package LinkList;

public class DeleteLinkNode<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = null;
		Node<Integer> next = null;
		for(int i = 0;i < 9; i++){
			if(head == null){
				head = new Node<Integer>(i);
				next = head;
			}
			else{
				
				next.setNext(new Node<Integer>(i));
				next = next.getNext();
			}
		}
		Node<Integer> deleted = head;
		DeleteLinkNode<Integer> delete = new DeleteLinkNode<Integer>();
		head = delete.deleteLinkNodeInO1(head, deleted);
		Node<Integer> printer = head;
		while(printer!=null){
			System.out.println(printer.getData());
			printer = printer.getNext();
		}
	}

public Node<T> deleteLinkNodeInO1(Node<T> head, Node<T> deleted){
     if(head ==null || deleted == null){
          System.out.println("input invalid");
          return null;
     }
     
     if(deleted.getNext()==null){
          Node<T> pre = head;
          while(pre.getNext()!=deleted){
               pre = pre.getNext();
     }
          pre.setNext(null);
     
     }
     else if(deleted == head){
    	 if(head.getNext() == null)
          return null;
    	 else{
    		 head = head.getNext();
//    		 deleted.setNext(null);
    	 }
    		 
     }
     else{
          T value = deleted.getNext().getData();
          deleted.setData(value);
          Node<T> next = deleted.getNext();
          deleted.setNext(next.getNext());;
          next.setNext(null);
     }
     return head;

}

}
