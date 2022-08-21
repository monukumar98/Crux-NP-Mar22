package Lec31;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				arr[i] = data[i];

			}
			data = arr;
		}

		super.push(item);

	}

	public static void main(String[] args) throws Exception {
		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.display();
	}

}
