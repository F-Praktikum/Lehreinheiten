package com.hoffrogge.uebungen;

import java.util.ArrayList;

import com.hoffrogge.lehreinheit02.Wuerfel;;

public interface KlassenWeitergeben {
	
	public ArrayList<Wuerfel> instanceList = new ArrayList<Wuerfel>();
	
	/**
	 * Diese Methode sollte einen W�rfel zu einer Liste von Rechtecksinstanzen hinzuf�gen.
	 */
	public void addToInstanceList(Wuerfel wuerfel);
	
	/**
	 * Diese Methode sollte einen W�rfel mit einer Bezeichnung in der Liste finden und zur�ckgeben;
	 */
	public Wuerfel getDieByName();
	
	/**
	 * Diese Methode gibt ein Array mit den Ergebnissen aller W�rfel zur�ck.
	 */
	public int[] rollAll();
}
