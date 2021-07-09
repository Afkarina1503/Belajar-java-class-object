import java.util.Scanner;
public class barang {

    static String nama;
    static int hargaSatuan;
    static int jumlahBarang;
    static int hargaTotal;
    static int hargadiskon;
    static int hargaBayar;

    Scanner input = new Scanner(System.in);

    barang(String nama, int hargaSatuan, int jumlahBarang){
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahBarang = jumlahBarang;

    }
    int HargaTotal(int hargaSatuan, int jumlahBarang){
        hargaTotal = hargaSatuan * jumlahBarang;
        return hargaTotal;
    }
    int Diskon(int hargaTotal){
        if(hargaTotal >= 100000){
            hargadiskon = 10;
            return hargadiskon;
        }
        if(hargaTotal < 100000 && hargaTotal > 50000){
            hargadiskon = 5;
            return hargadiskon;
        }
        else{
            hargadiskon = 0;
            return hargadiskon;
        }

    }
    int HargaBayar(int hargaTotal, int diskon){
        hargaBayar = hargaTotal - (hargaTotal *diskon / 100);
        return hargaBayar;
    }
 
    public static void main(String[] args) {
        barang makanan = new barang("PIZZA", 30000 ,2);
        hargaTotal = makanan.HargaTotal(hargaSatuan, jumlahBarang);
        hargadiskon = makanan.Diskon(hargaTotal);
        hargaBayar = makanan.HargaBayar(hargaTotal, hargadiskon);
        System.out.println(nama);
        System.out.println(hargadiskon); 
        System.out.println(hargaTotal);
        System.out.println(hargaBayar);
        
        System.out.println("--------");
        
        barang minuman = new barang("JUS ALPUKAT", 6000 ,2);
        hargaTotal = minuman.HargaTotal(hargaSatuan, jumlahBarang);
        hargadiskon = minuman.Diskon(hargaTotal);
        hargaBayar = minuman.HargaBayar(hargaTotal, hargadiskon);
        System.out.println(nama);
        System.out.println(hargadiskon);
        System.out.println(hargaTotal);
        System.out.println(hargaBayar);      
        
        System.out.println("---------");
        
        

    }

}