package fr.houda.interfaceListen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre200 extends JFrame{ 
	
	//=========  code pour gestionner les evenements de beaucoup bouttons =========//
	
	private static final long serialVersionUID = 1L;
	//------ Creation des buttons ---------//
	private JButton btnClick = new JButton("Clique ici");
	private JButton btnSend = new JButton("Envoyer");
	private JButton btnDelete = new JButton("Supprime");
	
	public Fenetre200() {
		super("Implémentation d'interface"); 
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(new FlowLayout());//centre les buttons sur un ligne 
		contentPanel.setBackground(Color.MAGENTA);
		
		contentPanel.add(btnClick);
		contentPanel.add(btnSend);
		contentPanel.add(btnDelete);
		
		btnClick.addActionListener(new ListenBtn());
		btnSend.addActionListener(new ListenBtn());
//		btnDelete.addActionListener(new ListenBtn());
		
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Fenetre200();

	}
	//********** class interne **************//
	private class ListenBtn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			/*Fenetre200.this.setTitle("fenetre ouvert");*/
			setTitle("fenetre ouvert");
			btnClick.setText("Text modifier");
					
		}
		
	}

	}
