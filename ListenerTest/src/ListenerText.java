import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ListenerText extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	JButton btnIch, btnComputer;
	JLabel textLbl;
	JPanel panel;
	
	double x0=0,x1=0,x2=0,x3=0, y0=0, y1=0, y2=0, y3=0, velx = 0, vely = 0;
	
	double XVal[]={x0,x1,x2,x3};
	double YVal[]={y0,y1,y2,x3};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListenerText test = new ListenerText();
		test.setVisible(true);

	}
	
	public ListenerText(){
		this.setSize(500, 500);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 400, 400);
		
		btnIch = new JButton("Ich");
		btnIch.addActionListener(this);
		
		textLbl = new JLabel("Label");
		
		panel.add(btnIch);
		panel.add(textLbl);
		
		this.add(panel);
		
		this.setBounds(100, 400, 636, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource() == this.btnIch){
	            textLbl.setText(("Button 1 wurde betätigt"));
	            JOptionPane.showMessageDialog(null, "Ich bin dran");
	        }
		
	}
	

}
