package fr.univ_smb.iae.mtii.gestion;

public class Vente {
	
	private String date;
	private int prix;
	
	public Vente (String d,int p){
		this.setDate(d);
		this.setPrix(p);
	}
	public void setDate(String d){
		this.date=d;
	}
	public void setPrix (int p){
		this.prix=p;
	}
	
	public String getDate(){
		return this.date;
	}
	public int getPrix(){
		return this.prix;
	}
}
