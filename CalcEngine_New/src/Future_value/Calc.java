package Future_value;

import java.lang.Math;
import java.text.NumberFormat;
import java.util.Locale;
public class Calc {
	
	public static String calc_fv(double i_investment, int years, double interest_rate){
		double future_value;
		double int_rate= interest_rate / 100;
		future_value = i_investment * Math.pow((1 + int_rate), years);
		
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		
		String ans = n.format(future_value);
		return ans;
	}
	
	public static void main(String[] args){
		System.out.println(calc_fv(100,3,10));
	}
	
}
