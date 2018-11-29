package com.iut.heritage;

import java.util.Scanner;



public class Monde {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		
		
		//Personne a = Personne.creerPersonne(scanner);
		
		//Personne b = Personne.creerPersonne(scanner);
		
		Chanteur c = Chanteur.creerChanteur(scanner);
		
		//a.SePresenter();
		//b.SePresenter();
		c.sePresenter();
		
		//System.out.println(a.getNom());
		//System.out.println(b.getNom());
		System.out.println(c.getmaisonEdition());
		
	
	}
	
	
}
