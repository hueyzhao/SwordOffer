package Problem26;


class ComplexLinkNode<T>{
     private T data;
     private ComplexLinkNode<T> next;
     private ComplexLinkNode<T> sibling;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public ComplexLinkNode<T> getNext() {
		return next;
	}
	public void setNext(ComplexLinkNode<T> next) {
		this.next = next;
	}
	public ComplexLinkNode<T> getSibling() {
		return sibling;
	}
	public void setSibling(ComplexLinkNode<T> sibling) {
		this.sibling = sibling;
	}
}
