package dataStructure;

public class ArraysDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
//		int arr1[] = new int[5];
//		arr1[0] = 1;
//		System.out.println(arr1[1]);
//		arr1[1]= Integer.MIN_VALUE;
//		System.out.println(arr1[1]);
//		
//		System.out.println("Creating array of size 10");
//		SingleDimensionalArray sda = new SingleDimensionalArray(10);
//		sda.traverseArray();
//		sda.insertion(0, 10);
//		sda.insertion(1, 20);
//		sda.insertion(2, 30);
//		sda.insertion(3, 40);
//		sda.insertion(4, 50);
//		sda.insertion(5, 60);
//		sda.insertion(6, 70);
//		sda.insertion(7, 80);
//		sda.insertion(8, 90);
//		sda.insertion(9, 100);
//		sda.traverseArray();
//		//sda.insertion(11, 3);
//		sda.accessCell(4);
//		sda.searchValue(50);
//		sda.deleteValue(2);
		
		// Two D array Program
		
		System.out.println("Two-D array: ");
		
		TwoDArray tda = new TwoDArray(5, 5);
		tda.traversal();
		tda.insertion(0, 0, 10);
		tda.traversal();
		tda.insertion(0, 1, 20);
		tda.accessCell(0, 0);
		tda.searchValue(70);
		tda.deleteValue(0, 1);
		tda.traversal();
		tda.delEntierArray();
		tda.traversal();
		
		
		
		
		
	}

}
