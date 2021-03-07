package fr.univ_smb.iae.mtii.conteneurs;

public class Boite extends Conteneur{
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Boite (String c, int d , String t){
		super(c , d);
		this.type= t;
	}
	
	
	public String toString(){
		String s =super.toString();
		s= "La boite alimente "+ s + " de type " + this.getType();
		return s;
		
	}
	
	public void afficher(){
		System.out.print("La boite alimentaire");
		super.afficher();
	
	}
	
	public void afficher2(){		
		System.out.print("La boite alimentaire");
		super.afficher2();
			
	}
	
}
