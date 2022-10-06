package com.soprasteria.giornimesearray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mesiAnno = {"gennaio","febbraio", "marzo", "aprile", "maggio", "giugno",
				"luglio","agosto", "settembre", "ottobre", "novembre", "dicembre"};
		int[] giorniDelMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int numeroMese;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Che giorno del mese vuoi?: ");
		numeroMese = s.nextInt();
		s.nextLine();
		
		System.out.println("Il numero di giorni di " + mesiAnno[numeroMese] + " è " 
							+ giorniDelMese[numeroMese]);
		
	}

}
