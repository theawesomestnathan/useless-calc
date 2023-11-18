package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private JFrame frame;
	private JLabel label;
	
	private JTextField x;
	private JTextField y;
	private JButton calculate;
	
	GUI() {
		frame = new JFrame();
		
		x = new JTextField("Enter X");
		x.setBounds(130, 100, 100, 40);
		
		y = new JTextField("Enter Y");
		y.setBounds(130, 150, 100, 40);
		
		calculate = new JButton("Calculate");
		calculate.setBounds(130, 200, 100, 40);
		
		calculate.addActionListener(this);
		
		label = new JLabel("The answer is ???");
		label.setBounds(130, 250, 400, 40);
		
		frame.add(x);
		frame.add(y);
		frame.add(calculate);
		frame.add(label);
		frame.setLayout(null);
		frame.setSize(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int xAsInt = Integer.parseInt(x.getText());
		int yAsInt = Integer.parseInt(y.getText());
		
		label.setText("The answer is " + Integer.toString(xAsInt+yAsInt));
	}

}