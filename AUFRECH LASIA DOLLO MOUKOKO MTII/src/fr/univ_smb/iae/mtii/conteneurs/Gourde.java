package fr.univ_smb.iae.mtii.conteneurs;

public class Gourde extends Conteneur {
	
	public Gourde (String c, int d){
		super(c , d);
	}
	
	
	public String toString(){
		String s= super.toString();
		s= "La gourde "+s;
		return s;
	}
	public void afficher(){
		
		System.out.print("La gourde ");
		super.afficher();
	
	}
	public void afficher2(){		
		System.out.print("La gourde ");
		super.afficher2();
	

	}

	
}
