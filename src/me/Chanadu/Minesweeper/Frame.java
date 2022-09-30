package me.Chanadu.Minesweeper;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Frame extends JFrame {
	ImageIcon iconOfWindow = new ImageIcon(Objects.requireNonNull(getClass().getResource("/me/Chanadu/Resources/Images/Mine.png")));
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		getContentPane().setBackground(Color.gray);
		setLayout(new BorderLayout());
		setTitle("Minesweeper");
		
		
		setIconImage(iconOfWindow.getImage());
		setResizable(false);
		setVisible(true);
	}
}
