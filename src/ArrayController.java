import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrayController {
	
	private ArrayStruct theModel;
	private ArrayView theView;
	
	ArrayController( ArrayStruct theModel, ArrayView theView){
		
		this.theModel = theModel;
		this.theView = theView;
		
		theView.updateTable(theModel.getArray(), theModel.getArray().length);
		
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

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

}
