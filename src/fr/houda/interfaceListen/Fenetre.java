package fr.houda.interfaceListen;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame { /**
	 * 
	 */
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
		//------ Creation des buttons ---------//
		JPanel contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(new FlowLayout());//centre les buttons sur un ligne 
		//------ Ajouter les buttons au fentre ---------//
		contentPanel.add(btnClick);
		contentPanel.add(btnSend);
		contentPanel.add(btnDelete);
		
		//------ Dimension fenetre ---------//
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);// pour centre au millieu au ecran
		this.setVisible(true);//pour rendre le fenetre visible
	}
	
	public static void main(String[] args) {
		new Fenetre();

	}

}
