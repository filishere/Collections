package collections;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class GUILinkedLists {
	
	
		public static void main(String[] args) {
			LinkedList<Integer> numbers = new LinkedList<>();       
			System.out.println("Please enter five numbers:");
			@SuppressWarnings("unused")
			Scanner sc = new Scanner(System.in);                  
			
			
			JFrame frame = new JFrame("Numbers");
			frame.setSize(350,200);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			JPanel mainPanel= new JPanel();
			frame.add(mainPanel);
			mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); 
				
			
			JTextArea numbersArea = new JTextArea(); 
			
			JTextField inputNumbers = new JTextField();
			inputNumbers.addActionListener(new ActionListener() {     
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Integer number = Integer.parseInt(inputNumbers.getText());
					if(! numbers.contains(number)) {     
						numbers.add(number);              
					}
					inputNumbers.setText("");  
					numbersArea.setText(numbers.toString());            
					System.out.println(numbers);
				}
			});
			
			mainPanel.add(inputNumbers);
			

//			JTextArea numbersArea = new JTextArea();    
			numbersArea.setEditable(false);
			mainPanel.add(numbersArea);
			
			JButton sortButton = new JButton("Sort");
			sortButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Collections.sort(numbers);                  
					numbersArea.setText(numbers.toString());    
				}
			});
			mainPanel.add(sortButton);
			
			JButton reverseSortButton = new JButton("Reverse Sort");
			reverseSortButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Collections.sort(numbers, Collections.reverseOrder()); 
					numbersArea.setText(numbers.toString());               
				}
			});
			mainPanel.add(reverseSortButton);
			
			JButton shuffleButton = new JButton("Shuffle");
			shuffleButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Collections.shuffle(numbers);                   
					numbersArea.setText(numbers.toString());        
				}
			});
			mainPanel.add(shuffleButton);
			
			frame.setVisible(true)  ;     
		}
	
}
