import javax.swing.JOptionPane;
public class hitbangunruang {

   
   public static void main(String[] args) {
      int menuutama;
      do {
         menuutama=Integer.parseInt(JOptionPane.showInputDialog(
           "Menghitung Luas dan \n" +
           "Volume Bangun Ruang : \n" +
               "-----------------------\n" +
               "1. Kubus \n" +
               "2. Balok \n" +
               "3. Bola \n" +
               "4. Keluar \n" +
               "-----------------------\n" +
               "Masukkan Nomer Menu :"));
               
        switch (menuutama) {
        case 1 :
          int submenu1;
          submenu1 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Kubus \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan Kubus \n" +
          "2. Hitung Volume Kubus \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu1) {
            case 1 :
              double sisi, luaspermukaankubus;
              sisi=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Kubus : "));
              luaspermukaankubus=6*(Math.pow(sisi,2));
              JOptionPane.showMessageDialog(null, "Luas Permukaan Kubus adalah : " + luaspermukaankubus);
              break;
            case 2 :
              double sisi1, volumekubus;
              sisi1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Kubus : "));
              volumekubus=Math.pow(sisi1,3);
              JOptionPane.showMessageDialog(null, "Volume Kubus adalah : " + volumekubus);
              break;
          }
                  break;
        case 2 :
                  int submenu2;
          submenu2 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Balok \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan Balok \n" +
          "2. Hitung Volume Balok \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu2) {
            case 1 :
              double panjang, lebar, tinggi, luaspermukaanbalok;
              panjang=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Panjang Balok : "));
              lebar=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Lebar Balok : "));
              tinggi=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Balok : "));
              luaspermukaanbalok=2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar + tinggi);
              JOptionPane.showMessageDialog(null, "Luas Permukaan Balok adalah : " + luaspermukaanbalok);
              break;
            case 2 :
              double panjang1, lebar1, tinggi1, volumebalok;
              panjang1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Panjang Balok : "));
              lebar1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Lebar Balok : "));
              tinggi1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Balok : "));
              volumebalok=panjang1 * lebar1 * tinggi1;
              JOptionPane.showMessageDialog(null, "Volume Balok adalah : " + volumebalok);
              break;
          }
                  break;
        case 3 :
                  int submenu3;
          submenu3 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Bola \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan (Kulit) Bola  \n" +
          "2. Hitung Volume Bola \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu3) {
            case 1 :
              double phi = 3.14;
              double jarijari, luaspermukaankulitbola;
              jarijari=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Jari-jari Bola : "));
              luaspermukaankulitbola = 4 * phi * (Math.pow(jarijari,2));
              JOptionPane.showMessageDialog(null, "Luas Permukaan Kulit Bola adalah : " + luaspermukaankulitbola);
              break;
            case 2 :
              double phie = 3.14;
              double jarijarijari, volumebola;
              jarijarijari=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Jari-jari Bola : "));
              volumebola = (4 / 3) * phie * (Math.pow(jarijarijari,2));
              JOptionPane.showMessageDialog(null, "Volume Bola adalah : " + volumebola);
              break;
          }
                  break;
        case 4 :
                  System.exit(0);
                  break;
        default :
                  JOptionPane.showMessageDialog(null, "Maaf nomor yang anda masukkan tidak tersedia. Silahkan Coba Lagi");
               }
      }
               while (menuutama!=1-4);   
               
      
   }
  }