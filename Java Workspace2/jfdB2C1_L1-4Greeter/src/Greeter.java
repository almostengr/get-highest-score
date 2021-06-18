import javax.swing.JOptionPane;

public class Greeter{
	public void sayHello(){
		// System.out.println("Hello world!");
		JOptionPane.showMessageDialog(null,  "Hello world!", "Greeter", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	}
}