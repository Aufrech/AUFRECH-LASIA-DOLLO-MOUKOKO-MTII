package fr.univ_smb.iae.mtii.gestion;

import fr.univ_smb.iae.mtii.conteneurs.Conteneur;

public class Stock {
	
private Conteneur[] conteneurs;
	
	public Stock (int nb){
		this.conteneurs=new Conteneur[nb];
	}
	
	public Conteneur[] getConteneurs(){
		return this.conteneurs;
	}
	
	public void ajouterConteneur (int i, Conteneur c){
		this.getConteneurs()[i]=c;
	}
	public void  afficherListe(){
		for (int i=0; i<this.getConteneurs().length; i++){
			if (this.getConteneurs()[i]!=null){
				System.out.println(this.getConteneurs()[i].toString());					
			}
		}
	}

	public void afficherConteneur_enVente(){
		for (int i=0; i<this.getConteneurs().length;i++){
			if (this.getConteneurs()[i]!=null){
				this.getConteneurs()[i].afficher();						
			}
		}
	}
	
	public void afficherHistorique_Conteneursvendus(){
		for (int i=0; i<this.getConteneurs().length;i++){		
			if (this.getConteneurs()[i]!=null){				
				this.getConteneurs()[i].afficher2();
			}
		}
	}
}
