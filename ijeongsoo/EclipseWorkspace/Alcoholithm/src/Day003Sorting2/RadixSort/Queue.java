package Day003Sorting2.RadixSort;

public class Queue {
	Node front;
	Node rear;
	int count;
	
	Queue(){
		front=null;
		rear=null;
		count =0;
	}
	
	public void enqueue(int value){
		Node new_node = new Node(value, null);
		if(this.count==0){
			this.front=new_node;
		}else{
			this.rear.next=new_node;
		}
		this.rear=new_node;
		this.count++;
	}
	
	public Integer dequeue(){
		int result;
		if(this.count==0){
			return null;
		}
		Node d_node = this.front;
		result = d_node.value;
		this.front=d_node.next;
		this.count--;
		
		return result;
	}
}
