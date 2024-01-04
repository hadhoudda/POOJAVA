package fr.houda.interfaceListen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre600 extends JFrame{ 
	
	//=========  code pour gestionner les evenements de beaucoup bouttons =========//
	//========= trés utilise et pratique pour implanter  beaucoup des methodes dans l'event et tres propre =========//
	
	private static final long serialVersionUID = 1L;
	//------ Creation des buttons ---------//
	private JButton btnClick = new JButton("Clique ici");
	private JButton btnSend = new JButton("Envoyer");
	private JButton btnDelete = new JButton("Supprime");
	
	public Fenetre600() {
		super("Implémentation d'interface"); 
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(new FlowLayout());//centre les buttons sur un ligne 
		contentPanel.setBackground(Color.MAGENTA);
		
		contentPanel.add(btnClick);
		contentPanel.add(btnSend);
		contentPanel.add(btnDelete);
		
		/*
		 * btnClick.addActionListener(new ActionListener() {
		 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListenbtnClick();
				
			}
		});
		
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListenbtnSend();
				
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Listenbtndelete();
				
			}
		});
	*/
		//**** Ecriture simplifie de precedant *******//
		btnClick.addActionListener(this::ListenbtnClick);
		/*
		 *  signifie que à la clique utilise le methode que sur mon 
		 *  fenetre ListenbtnClick
		 */
		
		
		btnSend.addActionListener(this::ListenbtnSend);
		
		btnDelete.addActionListener(this::Listenbtndelete);
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	//*********** les méthodes des events  ***************//
	private void ListenbtnClick(ActionEvent e) {
		setTitle("fenetre ouvert");
	}
	private void ListenbtnSend(ActionEvent e) {
		System.out.println("message envoye 600");
		/*Fenetre300.this.*/btnClick.setBackground(Color.yellow);
	}
	private void Listenbtndelete(ActionEvent e) {
		System.out.println("message supprime 600");
	}
	
	public static void main(String[] args) {
		new Fenetre600();

	}


	}
