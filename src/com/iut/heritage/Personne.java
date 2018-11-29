package com.iut.heritage;

import java.util.Scanner;

public class Personne {
	
	private String prenom;
	private String nom;
	private int age;
	private String profession;
	
	public Personne(String prenom, String nom, int age, String profession)
	{
		this.setPrenom(prenom);
		this.setNom(nom);
		this.setAge(age);
		this.setProfession(profession);
	}
	
	public Personne(){
		this("","",-1, "");
	}
	
	public void SePresenter()
	{
		System.out.println(this.getNom() + " " + this.getPrenom() + " " + this.getAge());
	}
	
	public static Personne creerPersonne(Scanner scanner)
	{
		Personne e = new Personne();
		try{
			boolean sasieOK = false;
			while (!sasieOK) {
				System.out.print("Nom > ");
				String nom = scanner.nextLine();
				System.out.print("Prenom > ");
				String prenom = scanner.nextLine();
				System.out.print("Age > ");
				int age = scanner.nextInt();
				System.out.print("Profession > ");
				scanner.nextLine();
				String profession = scanner.nextLine();
				e.setNom(nom);
				e.setPrenom(prenom);
				e.setAge(age);
				e.setProfession(profession);
				sasieOK = true;
			}
		}catch (Exception ex) {
			
		}
		return e;
	}
	
	public String getNom(){
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
