
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
	static int kantenlange;
	static ArrayList<Quader> quaderList = new ArrayList<Quader>();
    static int anzahlQuader; 
	public static void main(String[] args) throws IOException {
		System.out.println(bubbleSortOberflache(einlesen("test.txt")));
		ausgeben(quaderList);
		
	}

	// txt einlesen, sortieren nach arraygroesse, menge an quadern, einzelne quader
	public static int[][][] ausgangsarray(int kantenlange) {

		int[][][] arr = new int[kantenlange][kantenlange][kantenlange];
		return arr;
	}

	//// man muss evtl in einlesen() ein Array ausgeben, damit man auf der ersten
	//// Position die kantenlange und auf der zweiten position di dings ausgibt
	public static ArrayList<Quader> einlesen(String dateiname) throws IOException { // gibt jetzt erstmal nur
																					// kantenlange aus, damti wir ein
																					// array generieren können
		
		try {

			FileReader fr = new FileReader("test.txt");
			BufferedReader br = new BufferedReader(fr);

			String wuerfel = br.readLine();
			kantenlange = Character.getNumericValue(wuerfel.charAt(0));
			System.out.println(kantenlange);
			
			String anzahl = br.readLine();
			anzahlQuader = Character.getNumericValue(anzahl.charAt(0));
			System.out.println(anzahlQuader);

			String line;
			int i = 0;

			while ((line = br.readLine()) != null) {

				int x = Character.getNumericValue(line.charAt(0));
				int y = Character.getNumericValue(line.charAt(2));
				int z = Character.getNumericValue(line.charAt(4));
				//System.out.println(x + " " + y + " " + z); 
				Quader einquader = new Quader(x, y, z, x, y, z);
				quaderList.add(einquader);
				System.out.println(quaderList.get(i).getSurface());
				i++;
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
			e.printStackTrace();

		}
		return quaderList;
	}

	public static ArrayList<Quader> bubbleSortOberflache(ArrayList<Quader> arraylist) {
		Quader temp;
		for (int i = 0; i < arraylist.size(); i++) {
			for (int j = 0; j < arraylist.size() - 1; j++) {
				if ((arraylist.get(j).getSurface()) > (arraylist.get(j + 1).getSurface())) {
					temp = arraylist.get(j);
					arraylist.set(j, arraylist.get(j + 1));
					arraylist.set(j + 1, temp); 
				}

			}
		}
		return arraylist;
	}
	public static void ausgeben(ArrayList<Quader> arraylist) {
		for (int i = 0; i < arraylist.size(); i++) {
		System.out.println(arraylist.get(i).getSurface());	
	}

	/*
	 * public static int[][][] wurfelAusfullen(ArrayList<Quader>arraylist) { //wir
	 * müssen irgendwo die Kantenlänge speichern aber bis ich das mache, erstmal
	 * hier die kantenlänge als random initialisierte Variable int kantenlange;
	 * 
	 * //ausgangsarray(); }
	 */
}
}






















//Friedhof der Schande
/*
public int kantenlangeEinlesen(String dateiname) throws IOException {
		int kantenlange = 0;
		try {

			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);

			String wuerfel = br.readLine();

			kantenlange = Character.getNumericValue(wuerfel.charAt(0));
			System.out.println(kantenlange);
			br.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("Datei nicht gefunden");
			e.printStackTrace();

		}
		return kantenlange;
	}
	
	public void volumen() {
		// int a = quader1.charAt(0);
	}
	
	System.out.println(quaderList.get(0).getAll());

ausgeben(quaderList); 
System.out.println("Runde: " + i);
*/
