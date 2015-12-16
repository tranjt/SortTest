
public class ArrayStruct {
	
	private int [] array;
	
	private int arraySize;
	private int elementsInArray;
	
	ArrayStruct(int arraySize){
		
		this.arraySize = arraySize;
		array = new int [arraySize];
		
	}
	
	
	public void generateRandomArray (){
		
		for (int i = 0; i < array.length; i++){
			
			array[i] = (int)(Math.random()*50);
			
		}
		
		elementsInArray = array.length;
		
	}
	
	
	public int []  getArray(){
		
		return array;
		
	}
	
	
	public int getArraySize(){
		
		return array.length;
	}
	
	
	public int getIndextAt(int index){
		
		return array[index];
		
	}
	
	
	public void insert(int value){
		
		if (elementsInArray == array.length){
			
			System.out.println("Array is full");
			
		}else {
			
			array[elementsInArray] = value;
			elementsInArray++;
		}
	
	}
	
	
	public void deleteIndex(int index ){
		
		for (int i = index; i < (elementsInArray-1); i++){
			
			array[i] = array[i+1];
			
			elementsInArray--;
		}
		
	}
	
	
	public void printArray(){
		
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
	}

}
