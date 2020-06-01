package sid.com.sidji;

public class MainBubbleClass {

	public static void main(String[] args) {
		int size = 100;
			BubbleSortImplementation bs = new BubbleSortImplementation(size);
			
			bs.insert(2);
			bs.insert(8);
			bs.insert(87);
			bs.insert(88);
			bs.insert(23);
			bs.insert(90);
			bs.insert(43);
			bs.insert(21);
			bs.insert(65);
			bs.insert(53);
			bs.insert(22);
			
		
			System.out.println("Without Sorting ");
			bs.display();
			
			System.out.println("After Sorting ");
			bs.bubbleSort();
			bs.display();
	}

}
