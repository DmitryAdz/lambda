package by.odinets.lambda1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Lambda1 {

	JFrame jFrm;
	JPanel mainPanel;
	JButton jBtnTest1;
	JButton jBtnTest2;
	
	public static void main(String[] args) {
		System.out.println("test");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Lambda1();
			}
		});
	}
	
	public Lambda1() {
		jFrm = new JFrame("test");
		jFrm.getContentPane().setLayout(new BorderLayout());
		jFrm.setSize(500, 400);
		jFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel(null);
		mainPanel.setBackground(new Color(186, 250, 230));
		jFrm.add(mainPanel, BorderLayout.CENTER);
		
		jBtnTest1 = new JButton("TEST1");
		jBtnTest1.setBounds(50, 50, 400, 30);
		jBtnTest1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) { 
				System.out.println("button1 clicked");
			}
		});
		
		jBtnTest2 = new JButton("TEST2");
		jBtnTest2.setBounds(50, 80, 400, 30);
		jBtnTest2.addActionListener(event -> System.out.println("button2 clicked"));
		
		mainPanel.add(jBtnTest1);
		mainPanel.add(jBtnTest2);
		jFrm.setVisible(true);
	}

}
