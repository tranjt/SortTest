
public class SortTA {

	
	public static void main (String [] args){
		
		ArrayStruct  testArray = new ArrayStruct(10);
		testArray.generateRandomArray();
		
		
		testArray.printArray();
		
		System.out.println();
		
		testArray.deleteIndex(5);
		testArray.printArray();
		
		ArrayView theView = new ArrayView();
		
		
	}
}
