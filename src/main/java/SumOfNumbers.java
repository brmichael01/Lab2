
import javax.swing.JOptionPane;


public class SumOfNumbers {
    public static void main(String[] args) {
		
		int num;
		
	String input1 = JOptionPane.showInputDialog("Enter a positive nonzero integer");
		num = Integer.parseInt(input1);
		int sum = 0;
		while(num >= 1){
			sum += num;
			num--;
		}
		JOptionPane.showMessageDialog(null, "Sum: " + sum);
		
    }
}

