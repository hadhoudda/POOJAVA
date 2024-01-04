package fr.houda.interfaceListen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenbtnClick implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton btn = (JButton) event.getSource();//(JButton) c'est un caste oblige le type
		Fenetre100 fenetre =(Fenetre100) btn.getTopLevelAncestor(); //renvoyer le composant graphigue que le contient
		fenetre.setTitle("fenetre ouvert");
		btn.setForeground(Color.RED);
		
		
	}
	
	
}
