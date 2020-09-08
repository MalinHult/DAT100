package Oblig1;

import static javax.swing.JOptionPane.*;

public class Karakterskala {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			
		
			String karakter = showInputDialog("Skriv inn antall poeng");
			int K = Integer.parseInt(karakter);
			
			/*if (K < 0 || K > 100) {
			*	showMessageDialog(null, "skriv inn gyldig poengsum");
			* 
			*}
			*/
			
			String utTxt = "Karakteren er: ";
			if (K <= 39) {
				utTxt += "F";
			}
			if (K >= 40 && K <= 49) {
				utTxt += "E";
			}
			if (K >= 50 && K <= 59) {
				utTxt += "D";
			}
			if (K >= 60 && K <= 79) {
				utTxt += "C";
			}
			if (K >= 80 && K <= 89) {
				utTxt += "B";
			}
			if (K >= 90 && K <= 100) {
				utTxt += "A";
			}
			if (K < 0 || K > 100) {
				showMessageDialog(null, "feilmelding: ugyldig poengsum, skriv inn på nytt");
				i--;
			}
			
			
			else {
			showMessageDialog(null, utTxt);
			}
			
		}
	}

}
