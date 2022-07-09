package com.myJourney.SwingCalculator;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField testfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton, suButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	JPanel panel;

	Font myFont = new Font("Ink Free", Font.BOLD, 30);

	double num1, num2, result = 0;
	char operator;

	Calculator() {

		frame = new JFrame("calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);

		testfield = new JTextField();
		testfield.setBounds(50, 25, 300, 50);
		testfield.setFont(myFont);
		testfield.setEditable(false);

		functionButtons[0] = addButton = new JButton("+");
		functionButtons[1] = suButton = new JButton("-");
		functionButtons[2] = mulButton = new JButton("*");
		functionButtons[3] = divButton = new JButton("/");
		functionButtons[4] = decButton = new JButton(".");
		functionButtons[5] = equButton = new JButton("=");
		functionButtons[6] = delButton = new JButton("Delete");
		functionButtons[7] = clrButton = new JButton("Clear");

		for (int i = 0; i < 8; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);

		}
		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);

		}

		delButton.setBounds(50, 430, 145, 50);
		clrButton.setBounds(205, 430, 145, 50);

		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));

		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(suButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);

		frame.add(panel);
		frame.add(clrButton);
		frame.add(delButton);
		frame.add(testfield);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
				testfield.setText(testfield.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == decButton) {
			testfield.setText(testfield.getText().concat("."));
		}
		if (e.getSource() == addButton) {
			num1 = Double.parseDouble(testfield.getText());
			operator = '+';
			testfield.setText("");
		}
		if (e.getSource() == suButton) {
			num1 = Double.parseDouble(testfield.getText());
			operator = '-';
			testfield.setText("");
		}
		if (e.getSource() == mulButton) {
			num1 = Double.parseDouble(testfield.getText());
			operator = '*';
			testfield.setText("");
		}
		if (e.getSource() == divButton) {
			num1 = Double.parseDouble(testfield.getText());
			operator = '/';
			testfield.setText("");
		}
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(testfield.getText());

			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			testfield.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource()==clrButton) {
			testfield.setText("");	}
		if(e.getSource()==delButton) {
			String string =  testfield.getText();
			testfield.setText("");
			for(int i = 0 ; i < string.length() -1; i++) {
				testfield.setText(testfield.getText()+string.charAt(i));
			}
		}
	}

}
