package _02_Firework_Display;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FireworkDisplayUpdate extends JPanel implements ActionListener {
	public static int WIDTH = 720;
	public static int HEIGHT = 480;
	
	private JFrame window;
	private JPanel buttonPanel;
	private JButton fireButton;
	private Timer timer;
	int ren = 750;
	
	ArrayList<Firework> firework= new ArrayList<Firework>();
	
	public static void main(String[] args) {
		new FireworkDisplayUpdate().start();
	}
	
	public void start() {
		window = new JFrame();
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		
		WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
		HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		buttonPanel = new JPanel();
		fireButton = new JButton("FIRE");
		fireButton.addActionListener((e)->{
			fire();
		});
		
		buttonPanel.add(fireButton);
		window.add(buttonPanel, BorderLayout.SOUTH);
		
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		timer = new Timer(1000 / 60, this);
	}
	
	private void fire() {
		fireButton.setEnabled(true);
		
		Random ran = new Random();
		int ren = ran.nextInt(1000);
		firework.add(new Firework(ren));
		
		firework.get(firework.size()-1).launch();
		
		
		timer.start();		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(10, 30, 70));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		for(int i=0;i<firework.size();i++) {
		firework.get(i).drawSparks(g);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		firework.add(new Firework(ren));
		firework.get(firework.size()-1).launch();
		
		for(int i=0;i<firework.size();i++) {
			
			firework.get(i).updateSparks();
		repaint();
		
		boolean reset = true;
		
		if(!firework.get(i).dead) {
			reset = false;
		}
		if(reset) {
			if(firework.get(i).dead) {
				firework.remove(firework.get(i));
			}
			
			fireButton.setEnabled(true);
		}
		
		}
		
		
	}
}
