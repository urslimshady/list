package List.queue;

import List.liinkedList.MyLinkedList.Node;

public class MyQueue <E> {

private Node <E> head, rear ;

public void enqueue (E e) {
	
Node <E> toAdd = new Node <> (e) ;

if(head == null) {
	rear = head = toAdd ;
	return ;
}
	
	rear.next = toAdd ;
	rear = rear.next ;
}

public E dequeue () {
	
	if(head == null) {
		return null ;
	}
	
	Node <E> temp = head ;
	head = head.next ;
	
	if(rear == null) {
		rear = null ;
	}
	return temp.data ;
	
}
	
}
