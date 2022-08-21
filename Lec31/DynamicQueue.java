package Lec31;

public class DynamicQueue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {

		if (isFull()) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < size; i++) {
				int idx = (this.front + i) % this.data.length;
				arr[i] = data[idx];
			}
			this.front = 0;
			data=arr;
		}

		super.Enqueue(item);
	}
	public static void main(String[] args) throws Exception {
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.Enqueue(10);
		dq.display();
		
	}
}
