import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Environment{
	static String title = "Демонстрация";
	
	public static void main (String[] args){
		JFrame frame = new JFrame(title);
		Frame gui = new Frame();
		frame.add(gui);
		gui.drawing();
		frame.setVisible(true);
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		gui.b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == gui.b1) {
						int n = Integer.parseInt(gui.t1.getText()); //введенное число пользователя
						if (n == 0){
							throw new Exception();
						}
						gui.setN(n);
						gui.repaint();
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Воу воу полегче! Нужно ввести целое число.");;
				}
			}
		});
	}
}

