package calculator_box;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Future_value.Calc;
import java.awt.EventQueue;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class Future_Value_Box extends Calc {
	private String fv;
	private double investment;
	private int yrs;
	private double interest;
	private JTextField investment_field;
	private JTextField interest_field;
	private JTextField years_field;
	private JLabel lblNewLabel;
	private JTextField answer_field;
	private JLabel lblFutureValue;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Future_Value_Box window = new Future_Value_Box();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Future_Value_Box() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		investment_field = new JTextField();
		investment_field.setBackground(Color.ORANGE);
		investment_field.setBounds(234, 45, 134, 28);
		frame.getContentPane().add(investment_field);
		investment_field.setColumns(10);
		
		interest_field = new JTextField();
		interest_field.setBackground(Color.ORANGE);
		interest_field.setBounds(234, 85, 134, 28);
		frame.getContentPane().add(interest_field);
		interest_field.setColumns(10);
		
		years_field = new JTextField();
		years_field.setBackground(Color.ORANGE);
		years_field.setBounds(234, 125, 134, 28);
		frame.getContentPane().add(years_field);
		years_field.setColumns(10);
		
		answer_field = new JFormattedTextField();
		answer_field.setBackground(Color.ORANGE);
		answer_field.setBounds(234, 165, 134, 28);
		frame.getContentPane().add(answer_field);
		answer_field.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setFont(new Font("Lucida Blackletter", Font.PLAIN, 13));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(investment == 0){
					answer_field.setText("Please reenter data");
				}
				else if(yrs == 0){
					answer_field.setText("Please reenter data");
				}
				else if(interest == 0){
					answer_field.setText("Please reenter data");
				}
				investment = Double.parseDouble(investment_field.getText());
				yrs = Integer.parseInt(years_field.getText());
				interest = Double.parseDouble(interest_field.getText());
				
				
				fv = calc_fv(investment,yrs,interest);
				
				answer_field.setText(String.valueOf(fv));
			}
		});
		
		btnCalculate.setBounds(147, 220, 117, 29);
		frame.getContentPane().add(btnCalculate);
		
		
		JLabel lblInitialInvestment = new JLabel("Initial Investment");
		lblInitialInvestment.setBounds(58, 51, 134, 16);
		frame.getContentPane().add(lblInitialInvestment);
		
		JLabel lblRate = new JLabel("Annual Interest Rate");
		lblRate.setBounds(58, 91, 164, 16);
		frame.getContentPane().add(lblRate);
		
		lblNewLabel = new JLabel("Years");
		lblNewLabel.setBounds(58, 131, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(58, 171, 117, 16);
		frame.getContentPane().add(lblFutureValue);
		
		JLabel lblFutureValueCalculator = new JLabel("Future Value Calculator");
		lblFutureValueCalculator.setBounds(173, 6, 164, 16);
		frame.getContentPane().add(lblFutureValueCalculator);
		
	}
}
