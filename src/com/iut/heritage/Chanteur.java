package com.iut.heritage;

import java.util.Scanner;

public class Chanteur extends Personne {
	
	private String maisonEdition;
	


	public Chanteur(String prenom, String nom, int age, String maisonEdition)
	{
		super(prenom,nom,age, "chanteur");
		this.setmaisonEdition(maisonEdition);

	}


	public static Chanteur creerChanteur(Scanner scanner)
	{
		Chanteur e= null;
		try{
			boolean sasieOK = false;
			while (!sasieOK) {
				System.out.print("Nom > ");
				String nom = scanner.nextLine();
				System.out.print("Prenom > ");
				String prenom = scanner.nextLine();
				System.out.print("Age > ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Maison d'edition > ");
				String maisonEdition=scanner.nextLine();
				e = new Chanteur(prenom,nom,age,maisonEdition);
				sasieOK = true;
			}
		}catch (Exception ex) {
			
		}
		return e;
	}
	
	public void sePresenter() 
	{
		super.SePresenter();
		System.out.println("et je suis chanteur");
	}
	
	public String getmaisonEdition() {
		return maisonEdition;
	}

	public void setmaisonEdition(String profession) {
		this.maisonEdition = profession;
	}

}
