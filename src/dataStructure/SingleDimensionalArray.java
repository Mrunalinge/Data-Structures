package dataStructure;

public class SingleDimensionalArray {
	int arr[]= null;
	
	public SingleDimensionalArray(int size) {
		arr = new int [size];
		for(int i=0;i< arr.length;i++) {
			arr[i]= Integer.MIN_VALUE;
		}
		
	}
	
	public void traverseArray() {
		try {
		for(int i=0;i< arr.length;i++) {
			System.out.println("Element is: "+arr[i]); 
			
		}
	}catch (Exception e) {
		System.out.println("Array not present!");
	}
		
	}
	
	public void insertion(int location, int value) {
		
		try {
			  if(arr[location]== Integer.MIN_VALUE) {
				  arr[location] = value;
			  }else {
				  System.out.println("The cell is already occupied!");
			  }
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Wrong location given to array!");
		}
		
	}
	
	public void accessCell(int cell) {
		
		try {
			
			System.out.println("Given cell value is: "+arr[cell]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Wrong cell specified!");
		}
	}
	
	public void searchValue(int value) {
		
		System.out.println("Searching value "+value);
		
		for(int i=0; i< arr.length;i++) {
			if(arr[i]== value) {
				System.out.println("Found "+value+ " at position: "+i);
				return;
			}
		}
		
		System.out.println(value+" not found!");
		
		
	}
	
	public void deleteValue(int cellDel) {
		
		System.out.println("Deleting value at: "+cellDel);
		
		try {
			 
			  arr[cellDel] = Integer.MIN_VALUE;
			  System.out.println("Value del successfully!");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong cell specified!");
		}
		
	}

}
