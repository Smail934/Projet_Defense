package map;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;


public class main {
	
	public static void main(String[] args) {
	    JFrame fen = new JFrame ("Ordinateur Qui Parle");
	    fen.setResizable(false);
	    
	    JLabel pan = new JLabel(new ImageIcon(/*adresse de l'image en string*/));
	    pan.setBackground(Color.BLUE);
	    fen.setContentPane(pan); 
	  
	    JTextField tape = new JTextField ();
	  
	    Font police = new Font ("Arial", Font.BOLD, 25);
	    pan.add(tape);
	    tape.setBounds(60,450,560,50);
	    tape.setFont(police); 
	  
	    JButton bouton = new JButton ("Dis lui !");
	    pan.add(bouton);
	    bouton.setVisible(true);
	    bouton.setBounds(650,450,150,50);
	 
	    fen.setSize(850,600);
	    fen.pack();
	    fen.setLocationRelativeTo(null);
	    fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fen.setVisible(true);
}
}
