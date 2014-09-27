import javax.swingJOptionPane;

public class prisma 
{
		int submenu3 = Integer.parseInt(JOptionPane.showInputDialog)
		"Anda Memilih Menu dengan Rumus Prisma Segitiga \n" +
		"\n"+
		"1. Hitung Luas Permukaan \n"+
		"2. Hitung Volume \n"+
		"\n"
		switch(submenu3) {
			case 1 : double alasprisma, tgprisma, sisialas, tgalas, lalas, kalasprisma, lpermukaan;
					 alasprisma = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas : "));
					 tgalas = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas : "));
					 sisialas = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Alas : "));
					 tgprisma = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Prisma : "));
					 lalas=(alasprisma * tgalas) / 2;
					 kalasprisma= 3 * sisialas;
					 lpermukaan= 2 * lalas + (kalas * tgprisma);
					 JOptionPane.showMessageDialog(null, "Luas Permukaan Prisma Segitga adalah : "+ lpermukaan);
					 break;
			case 2 : double aprisma1, tgalas1, lalas1, tgprisma1, vprisma;
					 aprisma1 = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas : "));
					 tgalas1 = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas : "));
					 tgprisma1 = Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Prisma : "));
					 lalas1 = (aprisma1 * tgalas1) /2;
					 vprisma = lalas1 * tgprisma1;
					 JOptionPane.showMessageDialog(null, "Volume Prisma Segitga adalah : "+ vprisma);
					 break;
					 }
}