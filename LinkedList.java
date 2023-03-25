//LinkedList
class Node{
	Object ele;
	Node next;
	public Node(Object ele){
		this.ele=ele;
	}
}
class LinkedList{
	Node head,temp;
	
public void insert(Object ele){
	Node newNode=new Node(ele);
	if(head==null)
	{
		head=newNode;
	}else{
		temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
}
}
public void display(){
	    temp=head;
		while(temp.next!=null)
		{
		System.out.println(temp.ele);	
		temp=temp.next;
		}
		System.out.println(temp.ele);
		
}
public void delete(Object ele){
	temp=head;
	while(temp.next!=null){
		if(temp.next.ele.equals(ele))
		{   
			temp.next=temp.next.next;
			break;
		}
		else{
			temp=temp.next;
			//System.out.println("else");
		}
	}
}
public void deleteAt(int index){
	temp=head;
	int i=1;
	if(index==1){
		head=head.next;
	}else{
		while(temp.next!=null){
			if(i==index-1){
				temp.next=temp.next.next;
				break;
			}else{
				temp=temp.next;
			}
			i++;
		}
	}
}
public void addAt(int index,Object ele){
	Node newNode=new Node(ele);
	temp=head;
	int i=1;
	if(index==1){
		newNode.next=head;
		head=newNode;
	}else{
		while(temp.next!=null){
			if(i==index-1){
				newNode.next=temp.next.next;
				temp.next=newNode;
				break;
			}else{
				temp=temp.next;
			}
			i++;
		}
	}
}

public Object find(Object ele){
	temp=head;
	while(temp.next!=null){
		if(temp.ele.equals(ele)){
			break;
		}
		temp=temp.next;
	}
	return temp.ele;
}

public static void main(String[] args){
	LinkedList list=new LinkedList();
	for(int i=0;i<11;i++)
	{
		list.insert(i);
	}for(int i=0;i<11;i++)
	{
		
		//System.out.println(list.display());
	}
	list.display();
	list.delete(4);
	list.delete(5);
	list.deleteAt(1);
	list.deleteAt(3);
	
	list.display();
	list.addAt(1,5);
	list.display();
	System.out.println(list.find(7));
	
	
	
}
}