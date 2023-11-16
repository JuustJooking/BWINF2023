package bwinf2023;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
	static int kantenlange;

	public static void main(String[] args) throws IOException {

		System.out.print(bubbleSortOberflache(einlesen("text.txt")));
	}

	// txt einlesen, sortieren nach arraygroesse, menge an quadern, einzelne quader
	public static int[][][] ausgangsarray(int kantenlange) 
	{

		int[][][] arr = new int[kantenlange][kantenlange][kantenlange];
		return arr;
	}

	public void volumen() {
		// int a = quader1.charAt(0);
	}
////man muss evtl in einlesen() ein Array ausgeben, damit man auf der ersten Position die kantenlange und auf der zweiten position di dings ausgibt
	public static ArrayList<Quader> einlesen(String dateiname) throws IOException { //gibt jetzt erstmal nur kantenlange aus, damti wir ein array generieren können
		ArrayList<Quader> quaderList = new ArrayList<Quader>();
		
		try {


			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);

			String wuerfel = br.readLine();

			int kantenlange = Character.getNumericValue(wuerfel.charAt(0));
			System.out.println(wuerfel);

			String anzahl = br.readLine();
			System.out.println(anzahl);

			String line;
			int i = 0;


			while ((line = br.readLine()) != null)
			{

				int x = Character.getNumericValue(line.charAt(0));
				System.out.println(x);
				int y = Character.getNumericValue(line.charAt(2));
				int z = Character.getNumericValue(line.charAt(4));
				Quader einquader = new Quader (x, y, z, x, y, z);
				quaderList.add(einquader);

				i++; 
			}

			System.out.println(quaderList.get(0).getAll());

			br.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
			e.printStackTrace();

		}
		return quaderList;
	}
	public int kantenlangeEinlesen (String dateiname)throws IOException
	{
		int kantenlange = 0;
		try {


			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);

			String wuerfel = br.readLine();

			kantenlange = Character.getNumericValue(wuerfel.charAt(0));
			br.close();
		}
		
		
	catch (FileNotFoundException e) {
		System.out.println("Datei nicht gefunden");
		e.printStackTrace();

	}
		return kantenlange;
	}
	
	
	
	public static ArrayList<Quader> bubbleSortOberflache(ArrayList<Quader> arraylist) {
		Quader temp;
		for(int i=1; i<arraylist.size(); i++) {
			for(int j=0; j<arraylist.size()-1; j++) {
				if((arraylist.get(j).getSurface())>(arraylist.get(j+1).getSurface()))
				{
					temp=arraylist.get(j);
					arraylist.set(j, arraylist.get(j+1));
					temp=arraylist.get(j+1);
				}

			}
		}
		return arraylist;
	}
	
	
	
	
	
	
	public static int[][][] wurfelAusfullen(ArrayList<Quader>arraylist)
	{
		//wir müssen irgendwo die Kantenlänge speichern aber bis ich  das mache, erstmal hier die kantenlänge als random initialisierte Variable
		int kantenlange;
		ausgangsarray()
	}
	
}

