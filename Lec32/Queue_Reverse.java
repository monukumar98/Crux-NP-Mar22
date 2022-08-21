package Lec32;

import Lec31.DynamicQueue;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DynamicQueue q = new DynamicQueue();
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		q.display();
		Reverse(q);
		q.display();
		

	}
	
	public static void Reverse(DynamicQueue dq) throws Exception {
		if(dq.isEmpty()) {
			return;
		}
		int ii = dq.Dequeue();
		Reverse(dq);
		dq.Enqueue(ii);
		
	}

}
