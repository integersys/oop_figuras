package uzdevums5;

import javax.swing.JOptionPane;

import uzdevums1.MinkuTante;

public class OMetIzs {
	static void izsauktMetodi(int poga) {
		switch(poga) {
		case 0:
			int cPNr = OIzveide.cPIzvele();
			Figuras.centraObjekti.get(cPNr).parvietot(
			MinkuTante.skaitlaParbaude("Cik vienības pabīdīt pa x asi?", -100, 100),
			MinkuTante.skaitlaParbaude("Cik vienības pabīdīt pa y asi?", -100, 100));
			break;
			
		case 1:
			int cetNr = OIzveide.cetIzvele();
			JOptionPane.showMessageDialog(null, Figuras.cetrsturaObjekti.get(cetNr).cLaukums(), "Četrstūra laukums", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 2:
			//Apļi
			break;
			
		case 3:
			//Trījstūrī
			break;
		}
	}
}
