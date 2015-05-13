package LinkList;

public class ReverseOutput {
	public <T> void reverseOutput(Node<T> linkList){
		if(linkList == null){
			return;
		}
		else{
		if(linkList.getNext()!=null){
				reverseOutput(linkList.getNext());
			}
			System.out.println(linkList.getData());
		}
	
	}
	public static void main(String args[]){
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
		ReverseOutput reverse = new ReverseOutput();
		reverse.reverseOutput(head);
		
	}

}
