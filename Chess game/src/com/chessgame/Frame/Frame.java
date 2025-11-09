package com.chessgame.Frame;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = -4442947819954124379L;
	public static final int WIDTH = 480;
	public static final int HEIGTH = 475;
	
	public Frame() {
		this.setContentPane(new  Panel());
		this.setTitle("Chess");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGTH));
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	
	
}
