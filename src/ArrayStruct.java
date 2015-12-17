
public class ArrayStruct {
	
	private int [] array;
	
	private int arraySize = 10;
	
	
	ArrayStruct(){
		
		array = new int [40];
		
	}
	
	
	public void generateRandomArray (){
		
		for (int i = 0; i < arraySize; i++){
			
			array[i] = (int)(Math.random()*50);
			
		}
		
		
		
	}
	
	
	public int []  getArray(){
		
		return array;
		
	}
	
	
	public int getArraySize(){
		
		return arraySize;
	}
	
	
	public int getIndextAt(int index){
		
		return array[index];
		
	}
	
	
	public void insert(int value){
		
		if (arraySize == array.length){
			
			System.out.println("Array is full");
			
		}else {
			
			array[arraySize] = value;
			arraySize++;
		}
	
	}
	
	
	public void deleteIndex(int index ){
		
		if (index < arraySize){
		
			for (int i = index; i < (arraySize-1); i++){
				
				array[i] = array[i+1];
				
				arraySize--;
			}
		}
	}
	
	
	public void printArray(){
		
		for (int i = 0; i < arraySize; i++){
			System.out.println(array[i]);
		}
		
	}
	
	public boolean doesArrayContainValue(int searchValue){
		
		boolean containsValue = false;
		
		for (int i = 0; i < arraySize; i++){
				
				if (array[i] == searchValue)
					containsValue = true;
			}
				
		return containsValue;
		
	}
	
	
	public String linearSearch(int searchValue){
		
		String foundAt = "";
		
		for (int i = 0; i < arraySize; i++){
			
			if (array[i] == searchValue){
				
				foundAt += i + " ";
			}
				
		}
			
			
		return foundAt;
				
	}

}
