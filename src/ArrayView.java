import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ArrayView extends JFrame{
	
	
	private JButton deleteButton, insertButton, findButton, sortButton;
	private JRadioButton ascendButton, descendButton, linear, binary;
	private JLabel valueLabel, indexLabel;
	private JTextField valueField, indexField;
	private JTable table;
	private JPanel contentPane, topPanel, centerPanel, dirPanel, sortPanel;
	private JScrollPane bottomPanel;
	
	
	
	ArrayView(){
		
		setTitle("SortTA");
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		
		topPanel = new JPanel();
		
		contentPane.add(topPanel, BorderLayout.PAGE_START);
		
		centerPanel = new JPanel();
		dirPanel = new JPanel();
		sortPanel = new JPanel();
		
				
		dirPanel.setBorder(BorderFactory.createTitledBorder("Sort Direction"));
		sortPanel.setBorder(BorderFactory.createTitledBorder("Sort Type"));
		
		centerPanel.add(dirPanel);
		centerPanel.add(sortPanel);
		
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		
	
		
		valueLabel = new JLabel();
		valueLabel.setText("Value");
		
		indexLabel = new JLabel();
		indexLabel.setText("Index");
		
		valueField = new JTextField();
		valueField.setColumns(10);
		
		indexField = new JTextField();
		indexField.setColumns(10);
		
		
		topPanel.add(valueLabel);
		topPanel.add(valueField);
		
		topPanel.add(indexLabel);
		topPanel.add(indexField);
		
		insertButton = new JButton("Insert");
		deleteButton = new JButton("Delete");
		findButton   = new JButton("Find");
		
		topPanel.add(insertButton);
		topPanel.add(deleteButton);
		topPanel.add(findButton);
		
		
		
		ascendButton = new JRadioButton("Ascending");
		descendButton = new JRadioButton("Descending");
		
		ButtonGroup  sortDirection = new ButtonGroup();
		
		sortDirection.add(ascendButton);
		sortDirection.add(descendButton);
		
	
		
		linear = new JRadioButton("Linear");
		binary = new JRadioButton("Binary");
		
		ButtonGroup  sortType = new ButtonGroup();
		
		sortType.add(linear);
		sortType.add(binary);
		
		
		sortButton = new JButton("Sort");
		
		dirPanel.add(ascendButton);
		dirPanel.add(descendButton);
		
		sortPanel.add(linear);
		sortPanel.add(binary);
		
		centerPanel.add(sortButton);
		
		Object[][] data = {
				
					            {new Integer(0), new Integer(0), ""},	
					            {new Integer(1), new Integer(0), ""},				
					            {new Integer(2), new Integer(0), ""},				
					            {new Integer(3), new Integer(0), ""},				
					            {new Integer(4), new Integer(0), ""},				
					            {new Integer(5), new Integer(0), ""},				
					            {new Integer(6), new Integer(0), ""},				
					            {new Integer(7), new Integer(0), ""},				
					            {new Integer(8), new Integer(0), ""},
					            {new Integer(9), new Integer(0), ""},
				
					        };
				
					     
				
		 String[] columnNames = {"Index",
				
					            "Value",
				
					            "Selected"};
				
					     

		
	    DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
	    table = new JTable(tableModel);
	    table.setFillsViewportHeight(true);
	    
	     bottomPanel = new JScrollPane(table);
	    
	    
	    contentPane.add(bottomPanel, BorderLayout.PAGE_END);
	   
		setVisible(true);
		
	}

}
