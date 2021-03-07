package fr.univ_smb.iae.mtii.conteneurs;

import fr.univ_smb.iae.mtii.gestion.Vente;

public class Conteneur {
	
	protected String code;
	protected int dimension;
	protected String couleur;
	
	protected Vente vente;
	protected Vente[] ventes=new Vente[50];
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getDimension() {
		return dimension;
	}


	public void setDimension(int dimension) {
		this.dimension = dimension;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public Vente getVente() {
		return vente;
	}


	public void setVente(Vente vente) {
		this.vente = vente;
	}


	public Vente[] getVentes() {
		return ventes;
	}


	public void setVentes(Vente[] ventes) {
		this.ventes = ventes;
	}


	public Conteneur(String c, int d) {
		// TODO Auto-generated constructor stub
		this.setCouleur(c);
		this.setDimension(d);
	}


	public String toString(){
		return "est de couleur"+" "+this.getCouleur()+ " de dimension "+ this.getDimension() + " litre(s)";
	}
	

	
	public void afficher(){		
		if (this.getVente()!= null){
			System.out.println( " de couleur " +this.getCouleur()+" a été vendue "+ this.getVente().getDate()+" pour "+ this.getVente().getPrix()+" Euros");
		    } 
		else {
			System.out.println(" n'a pas encore été vendu");
		}
	}
	
	
	public void ajouterVente (Vente v){
		boolean VenteAjoutee=false;
		int i=0;
		while(VenteAjoutee==false && i<this.getVentes().length){
			if (this.getVentes()[i]==null){
				this.ventes[i]=v;
				VenteAjoutee=true;
			}
			i++;
		}
	}
	
	public boolean aDejaEteVendu(){
		boolean vendu=false;
		int i=0;
		while(vendu==false && i<this.getVentes().length){
			if (this.getVentes()[i]!=null){
				vendu=true;
			}
			i++;
		}
		return vendu;
	}
	
	public void afficher2(){
		System.out.print(" de couleur "+ this.getCouleur());
			if (this.aDejaEteVendu()==true){
				System.out.println(" a été vendu " +this.count()+" fois ");
			for (int i=0; i<this.getVentes().length;i++){	
				if (this.getVentes()[i]!=null){
					System.out.println("le "+this.getVentes()[i].getDate());
				}
			}
		}
			else{
				System.out.println (" n'a pas encore été vendue");
			}
	
	}
	
	public int count(){
		int a=0;
		for (int i=0; i<this.getVentes().length;i++){
			if (this.getVentes()[i]!=null){
				a++;	
			}
		}
		return a;
	}
	
}
