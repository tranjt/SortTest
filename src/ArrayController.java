import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayController {
	
	private ArrayStruct theModel;
	private ArrayView theView;
	
	ArrayController( ArrayStruct theModel, ArrayView theView){
		
		this.theModel = theModel;
		this.theView = theView;
		
		theView.updateTable(theModel.getArray(), theModel.getArraySize());
		
		theView.addinsertButtonListener(new insertButtonListener());
		theView.addDeleteButtonListener(new deleteButtonListener());
		theView.addFindButtonListener(new findButtonListener());
		theView.addSortButtonListener(new sortButtonListener());
		
	}
	
	class sortButtonListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			
			if(theView.descendButton.isSelected()){
				
				theModel.bubbleSortDescending();
				
			}else{
				
				theModel.bubbleSort();
			}
			
			theView.updateTable(theModel.getArray(), theModel.getArraySize());
			
		}
		
	}
	
	class deleteButtonListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			try{
				
				theModel.deleteIndex(theView.getIndex()); 
				
				theModel.printArray();
				
				theView.updateTable(theModel.getArray(), theModel.getArraySize());
				
			}catch (NumberFormatException ex) {
			
				theView.sendMessageToUser("Please enter index value in the index box!");
			}
		}
		
	}
	
	class findButtonListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			String valueAt = "";
			
			if (theView.linear.isSelected()){
				
				try{
					
					if (theModel.doesArrayContainValue(theView.getValue())){
						
						valueAt = theModel.linearSearch(theView.getValue());
						
						
						theView.sendMessageToUser("Found at " + valueAt);
						
					}else 
						theView.sendMessageToUser("Value not found");
					
					
					
					
					}catch (NumberFormatException ex) {
					
						theView.sendMessageToUser("Please enter an number in the value box!");
					}
			}
			
		}
		
	}
	
	class insertButtonListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			try{
				
			theModel.insert(theView.getValue());
			
			theModel.printArray();
			
			theView.updateTable(theModel.getArray(), theModel.getArraySize());
			
			}catch (NumberFormatException ex) {
			
				theView.sendMessageToUser("Please enter an number in the value box!");
			}
		
			
		}
		
	}
	
	
	

}
