package Oblig1;

import static javax.swing.JOptionPane.*;

public class Bruttoinntekt {

	public static void main(String[]args) {
		
		/* inntekt mellom 0 - 180 800 ingen trinnskatt
		 * inntekt mellom 180 801 - 254 500 1,9% trinnskatt
		 * inntekt mellom 254 501 - 639 750 4,2% trinnskatt
		 * inntekt mellom 639 751 - 999 550 13,2% trinnskatt
		 * inntekt over 999 550 16,2 % trinnskatt
		 */
		
		String brutto = showInputDialog("Skriv inn bruttoinntekten");
		int B = Integer.parseInt(brutto);
		
		String utTxt = "Trinnskatten er: ";
		if (B < 180800) {
			utTxt += B * 0;
		}
		if (B > 180801 && B < 254500) {
			utTxt += B * 0.019;
		}
		if (B > 254501 && B < 639750) {
			utTxt += B * 0.042;
		}
		if (B > 639751 && B < 999550) {
			utTxt += B * 0.132;
		}
		if (B > 999551) {
			utTxt += B * 0.162;
		}
		showMessageDialog(null, utTxt);
	}
}
