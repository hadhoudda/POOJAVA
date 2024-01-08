package fr.houda.generic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;

public class GenericComponent<COMPONENT extends Component> extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private COMPONENT myComponent;
	/*
	 * COMPONENT hérite de le type Component
	 * GenericComponent hérite de la classe JFrame
	 */
	public GenericComponent(COMPONENT component){
		super("titre de fenetre");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPanel = (JPanel) this.getContentPane();
		contentPanel.setLayout(new FlowLayout());//centre les buttons sur un ligne 
		contentPanel.setBackground(Color.MAGENTA);
		contentPanel.add(component,BorderLayout.CENTER);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	
	public COMPONENT getMyComponent() {
		return myComponent;
	}
	
	public static void main(String[] args) {
//		GenericComponent<JButton> frame = new GenericComponent<>(new JButton("clique ici"));
//		JButton btn = frame.getMyComponent();
		GenericComponent<JTree> frame = new GenericComponent<>(new JTree());
		JTree btn = frame.getMyComponent();
		
	}


	

}
