package List.liinkedList;

public class MyLinkedList <E> 
{
	
	Node <E> head ;                                                    //Created a node
	void add (E data) 
		{
		Node <E> toAdd = new Node <E> (data);                   //Created the object for add function
		if (isEmpty()) 
		{                                           //Handled the first case of having the first node as null
			head = toAdd;
			return ;
		}
		Node <E> temp = head;                                         //Initialized the first Node  as temp
		while(temp.next != null) 
		{                                //A loop will run to add the object we created to last position
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	
	
	void print () 
		{                                                      //Print function to prEthe given function
		Node <E> temp = head;
		while (temp != null) 	
			{
			System.out.println(temp.data + " " );
			temp = temp.next ;
		}
	}
	
	boolean isEmpty() 
		{                                            //A boolean for returning the first node as null
		return head == null ;
	}
	public static class Node<E> 
		{                                            //Made a static class and passed the variable
		public E data ;
		public Node <E> next;
		
		public Node (E data)
		{                                  //Constructor of above class to initialize the values
			this.data = data;
			next = null;
		}
	}
  }

 
