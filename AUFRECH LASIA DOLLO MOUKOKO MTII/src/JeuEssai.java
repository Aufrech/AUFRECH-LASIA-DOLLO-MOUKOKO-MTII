import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;

import fr.univ_smb.iae.mtii.conteneurs.Boite;
import fr.univ_smb.iae.mtii.conteneurs.Gourde;
import fr.univ_smb.iae.mtii.gestion.Stock;


public class JeuEssai {
	
	private static JLabel label, password, succes, couleur, marque, dimension, message;
	private static JTextField textPseudo, textCouleur, textMarque, textDimension;
	private static JPasswordField textPassword;
	private static JButton bouton, bouton2;
	private static JFrame frame2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPanel panel = new JPanel();
		
		Login login = new Login();
		login.setTitle("Gestion et vente d'emballage");
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setSize(500,500);
		
		login.add(panel);
		
		panel.setLayout(null);
		
		label = new JLabel("Pseudo");
		label.setBounds(10,20,80,25);
		panel.add(label);
		
		textPseudo = new JTextField(20);
		textPseudo.setBounds(100,20,165,25);
		panel.add(textPseudo);
		
		password = new JLabel("Mot De Passe");
		password.setBounds(10,50,80,25);
		panel.add(password);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(100,50,165,25);
		panel.add(textPassword);
		
		bouton = new JButton("Connexion");
		bouton.setBounds(100,80,80,25);
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
					 
					 JPanel panel2 = new JPanel();
						frame2 =  new  JFrame();
						frame2.setVisible(true);
						frame2.setTitle("Gestion et vente d'emballage");
						frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame2.setSize(500,300);
						
						frame2.add(panel2);
						
						panel2.setLayout(null);
						
						couleur = new JLabel("Couleur");
						couleur.setBounds(10,20,80,25);
						panel2.add(couleur);
						
						textCouleur = new JTextField(20);
						textCouleur.setBounds(100,20,165,25);
						panel2.add(textCouleur);
						
						marque = new JLabel("Marque");
						marque.setBounds(10,50,80,25);
						panel2.add(marque);
						
						textMarque = new JTextField(20);
						textMarque.setBounds(100,50,165,25);
						panel2.add(textMarque);
						
						dimension = new JLabel("Dimension");
						dimension.setBounds(10,80,80,25);
						panel2.add(dimension);
						
						textDimension = new JTextField(20);
						textDimension.setBounds(100,80,165,25);
						panel2.add(textDimension);
						
						message = new JLabel("");
						message.setSize(300,300);
						message.setBounds(100,140,380,25);
						panel2.add(message);
						
						bouton2 = new JButton("Afficher");
						bouton2.setBounds(100,110,80,25);
						bouton2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String coul = textCouleur.getText();
								String marq = textMarque.getText();
								String dim = textDimension.getText();
								int dimen = Integer.parseInt(dim);
								
								Gourde g1, g2;
								g1=new Gourde(coul,dimen);
								g2= new Gourde(coul,dimen);
									
								
								String messa = "La couleur " + coul + " La marque " + marq;
								message.setText(messa);
							}
						});
						panel2.add(bouton2);
						
				 }
				 catch(Exception ex){
					 System.out.println(ex);
				 }
				
				
			}
		});
		panel.add(bouton);
		
		
		succes = new JLabel();
		succes.setBounds(10,110,300,25);
		panel.add(succes); 
		
		
		
		login.setVisible(true);
		
		/*String coul = textCouleur.getText();
		String marq = textMarque.getText();
		String dim = textDimension.getText();
		int dimen = Integer.parseInt(dim);
		
		 Gourde g1, g2;
		g1=new Gourde(coul,dimen);
		g2= new Gourde(coul,dimen);
		
		Boite b1,b2;
		b1= new Boite(coul, dimen, marq);
		b2= new Boite(coul,dimen,marq);
		
		Stock s;
		s=new Stock(5);

		s.ajouterConteneur(2, b1);
		s.ajouterConteneur(3, b2);
		
		s.afficherListe();*/
		
	}

	//@Override
	//public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	// String utilisateur = textPseudo.getText();
	//	String password = textPassword.getText(); 
	 	
	//	if(utilisateur.equals("Lasia") && password.equals("password")) {
		//	succes.setText("Connexion reussie ");
		//}
		
	//}
	
	
	
	
	
	
	

}
