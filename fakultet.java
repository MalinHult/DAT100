package Oblig1;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class fakultet {
	
	/* Program som leser inn heltall > 0 
	 * beregner verdien til n fakultet og skriver n!
	 * der n! = 1\*2\*3\*...\(n-1)\*n
	 */
	
	public static void main (String[]args) {
	boolean ulovlig;
	int n;
	
	do {
		String tallTxt = showInputDialog("Sett n =");
		n = parseInt (tallTxt);
		ulovlig = (n < 0 );
		if (ulovlig)
			showMessageDialog (null, "Ugyldig n-verdi");
	} while (ulovlig);
	
	showMessageDialog (null, n + "! = " + fakultet(n));
	}
	
	public static int fakultet (int maxTall) {
		int nFak = 1;
		for (int tall = 1; tall <= maxTall; ++tall)
			nFak = nFak *tall;
		return nFak;
	}
}