package dataStructure;

public class TwoDArray {
	
	
	int arrTwo[][] = null;
	
	public TwoDArray(int nor, int noc) {
		
		this.arrTwo = new int [nor][noc];
		for(int i=0;i<arrTwo.length;i++) {
			for(int j=0; j< arrTwo[0].length;j++) {
				arrTwo[i][j] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void traversal() {
		try {
		for(int i=0;i<arrTwo.length;i++) {
			for(int j=0; j< arrTwo[0].length;j++) {
				//arrTwo[i][j] = Integer.MIN_VALUE;
				System.out.println("Element "+" ["+i+"]"+"["+j+"]: "+arrTwo[i][j]);
			}
		}
		}catch(NullPointerException e) {
			System.out.println("Array does not exist!");
		}
	}
	
	public void insertion(int row, int col, int val) {
		try {
			  System.out.println("Inserting: ");
			  if(arrTwo[row][col] == Integer.MIN_VALUE) {
				  arrTwo[row][col] = val;
				  System.out.println("Insertion successful!");
				  return;
			  }
			  
			  System.out.println("Value already present at given cell cannot override!");
		
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong row or col value specified. ");
		}
		
	}
	
	public void accessCell(int row, int col) {
		
		try {
			
			System.out.println("Value at the given cell is: "+arrTwo[row][col]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong cell specified!!");
		}
	}
	
	public void searchValue(int value) {
		
		for(int row=0; row<arrTwo.length;row++) {
			for(int col=0;col<arrTwo[0].length;col++) {
				if(arrTwo[row][col]== value) {
					System.out.println("Value "+value+" found at ["+row+"]"+"["+col+"]");
					return;
				}
			}
		}
		
		System.out.println("Value not found!");
	}
	
	public void deleteValue(int row,int col) {
		
		try {
			
			arrTwo[row][col] = Integer.MIN_VALUE;
			System.out.println("Value successfully deleted!");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong cell specified!");
		}
		
	}
	
	public void delEntierArray() {
		arrTwo = null;
		System.out.println("Array deleted successfully");
	}
	

}
