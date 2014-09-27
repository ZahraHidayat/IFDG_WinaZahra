import javax.swing.JOptionPane;

public class limas
{
	int submenu4;
	submenu4 = Integer.parseInt(JOptionPane.showInputDialogu(
	"Anda memilih Menu Limas Segitiga \n"+
	"\n"+
	"1. Hitung Luas Permukaan Limas \n"+
	"2. Hitung Volume Limas \n"+
	"Masukkan pilihan :"));
	switch(submenu4) 
	{
	case 1 : double alaslimas, tinggialaslimas, sisialaslimas,tinggilimas, luasalaslimas, luasselimutlimas, luaspermukaanlimas;
			 alaslimas = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas : "));
			 tinggialaslimas = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas : "));
			 sisialaslimas = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi : "));
			 tinggilimas = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi : "));
			 luasalaslimas = 2 * ((alaslimas * tinggilimas) / 2 );
			 luasselimutlimas = 3 * (alaslimas * tinggilimas);
			 luaspermukaanlimas = luasalaslimas + luasselimutlimas;
			 JOptionPane.showMessageDialog(null, "Luas Permukaan Limas Segitga adalah : "+ luaspermukaanlimas);
			 break;
	case 2 : double alaslimas1, tinggialaslimas1, luasalaslimas1, tinggilimas1, volumelimas;
			 alaslimas1 = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas : "));
			 tinggialaslimas1 = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas : "));
			 tinggilimas1 = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi : "));
			 luasalaslimas1 = 2 * ((alaslimas * tinggilimas) / 2 );
			 volumelimas = 0.3 * luasalaslimas1 + tinggilimas1;
			 break;
	}
}