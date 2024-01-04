package fr.houda.interfaceListen;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre500 extends JFrame{ 
	
	//=========  code pour gestionner les evenements de beaucoup bouttons =========//
	private static final long serialVersionUID = 1L;
	//------ Creation des buttons ---------//
	private JButton btnClick = new JButton("Clique ici");
	private JButton btnSend = new JButton("Envoyer");
	private JButton btnDelete = new JButton("Supprime");
	
	public Fenetre500() {
		super("Implémentation d'interface"); 
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(new FlowLayout());//centre les buttons sur un ligne 
		contentPanel.setBackground(Color.MAGENTA);
		
		contentPanel.add(btnClick);
		contentPanel.add(btnSend);
		contentPanel.add(btnDelete);
		
		btnClick.addActionListener((e)-> setTitle("fenetre ouvert"));
		btnSend.addActionListener((e)-> System.out.println("message envoye 500"));
		
		btnDelete.addActionListener((e)-> {
			System.out.println("message supprime 500");
			setTitle("titre fenettre");
		});
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Fenetre500();

	}


	}
