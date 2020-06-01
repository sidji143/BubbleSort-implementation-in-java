package sid.com.sidji;

public class BubbleSortImplementation {
			
		private long arr [];
		private int nElemts;
		// Creating an Array
		public BubbleSortImplementation(int size) {
			arr = new long[size];
			nElemts =0;
			
		}
		// Inserting value into the Array
		public void insert(long value) {
			arr[nElemts++] = value;
		}
		//Displaying the Array
		public void display() {
			for(int  i =0; i< nElemts; i++) {
				System.out.println("The elements of the array :"+arr[i]+",");
			}
		}
		//Implementing Bubble Sort
		public void bubbleSort() {
			int out;
			int in;
			for(out = nElemts -1; out> 1; out--) {
				for(in =0; in < out; in++) {
					if(arr[in] > arr[in+1]) {
						long temp = arr[in];
						arr[in] = arr[in+1];
						arr[in+1] = temp;
					}
				}
			}
		}
}










