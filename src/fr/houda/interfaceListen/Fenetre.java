package fr.houda.interfaceListen;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame implements ActionListener{ 
	
	//=========  code pour gestionner les evenements de 2 ou 3 bouttons =========//
	
	private static final long serialVersionUID = 1L;
	//JFrame object de java pour créer des interface graphique
	//------ Creation des buttons ---------//
	private JButton btnClick = new JButton("Clique ici");
	private JButton btnSend = new JButton("Envoyer");
	private JButton btnDelete = new JButton("Supprime");
	
	public Fenetre() {
		
		//------ Caracterestique fenetre ---------//
		super("Implémentation d'interface"); //titre de fenetre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//arrete l'excution de programme quand on ferme le fenere
		
		//------ Creation de containeur des buttons ---------//
		JPanel contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(new FlowLayout());//centre les buttons sur un ligne 
		
		//------ Ajouter les buttons au containeur ---------//
		contentPanel.add(btnClick);
		contentPanel.add(btnSend);
		contentPanel.add(btnDelete);
		
		//------ Ajouter des events au buttons ---------//
		btnClick.addActionListener(this);//this c'est le fenetre 
		// addActionListener besoin d'implanter l'interface ActionListener
		btnSend.addActionListener(this);
		btnDelete.addActionListener(this);
		//------ Dimension fenetre ---------//
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);// pour centre au millieu au ecran
		this.setVisible(true);//pour rendre le fenetre visible
	}
	
	@Override
	public void actionPerformed(ActionEvent event) { //l'action de clique 
		if(event.getSource()== btnClick)// on fait == et pas equals car on compare deux adresses d'object
			this.setTitle("fenetre ouvert");//this c'est la fenetre
		else if(event.getSource()== btnSend)
			System.out.println("message envoye");
		else if(event.getSource()== btnDelete)
			System.out.println("message supprime");
		
	}

	public static void main(String[] args) {
		new Fenetre();

	}

	}
