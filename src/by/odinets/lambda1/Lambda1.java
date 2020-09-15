package by.odinets.lambda1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

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
		
		//------------------------------------
		
		Artist artist1 = new Artist("Moscow", "Ivan Fuckoff");
		Artist artist2 = new Artist("London", "Ringo Starr");
		Artist artist3 = new Artist("Paris", "Joe Dasin");
		Artist artist4 = new Artist("London", "John Lennon");
		Artist artist5 = new Artist("Kiev", "Taras Bulba");
		List<Artist> allArtists = new ArrayList<Artist>();
		allArtists.add(artist1);
		allArtists.add(artist2);
		allArtists.add(artist3);
		allArtists.add(artist4);
		allArtists.add(artist5);
		
		int count = 0;
		for(Artist artist : allArtists) {
			if(artist.isFrom("London")) {
				count++;
			}
		}
		System.out.println("count :: " + count);
		
		int count1 = 0;
		Iterator<Artist> iterator = allArtists.iterator();
		while(iterator.hasNext()) {
			Artist artist = iterator.next();
			if(artist.isFrom("London")) {
				count1++;
			}
		}
		System.out.println("count1 :: " + count1);
		
		Long countLong = allArtists.stream()
									.filter(artist -> artist.isFrom("London"))	//отложенный метод
									.count();									//энергичный метод
		System.out.println("countLong :: " + countLong);
		
		allArtists.stream()
					.filter(artist -> {
						System.out.println("artist.getName() :: " + artist.getName());	//не печатает тк только отложенный метод
						return artist.isFrom("London");
					});
		
		Long countLong1 = allArtists.stream()
									.filter(artist -> {
										System.out.println("artist.getName() :: " + artist.getName());
										return artist.isFrom("London");
									})
									.count();
		System.out.println("countLong1 :: " + countLong1);
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
		
		Predicate<Integer> atLeast5 = x -> x > 5;
		System.out.println("atLeast5 :: " + atLeast5);
		
		BinaryOperator<Long> addLongs = (x, y) -> x + y;
		System.out.println("addLongs :: " + addLongs);
		
		
		
	}

}
