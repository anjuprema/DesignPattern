package com.anju.DesignPattern.Structural.Flyweight;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Drawing extends JFrame{
	private static final long SerialVersionUID = 1L;
	
	public void draw() {
		JPanel panel = new JPanel();
		Container contentPane = getContentPane();
		JButton drawButton = new JButton("Draw");
		
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(drawButton, BorderLayout.SOUTH);
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		drawButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Graphics graphics = panel.getGraphics();				
				for(int i=0; i<5; i++) {
					ShapeFactory.draw(ShapeType.CIRCLE, graphics);
				}
				
				for(int j=0; j<3; j++) {
					ShapeFactory.draw(ShapeType.LINE, graphics);
				}
			}
		});
	}
	
}

public class FlyweightDrawMain {
	public static void main(String[] args) {
		Drawing drawing  = new Drawing();
		drawing.draw();
	}
}
