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
		
	}
	
	class sortButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class deleteButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class findButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
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
