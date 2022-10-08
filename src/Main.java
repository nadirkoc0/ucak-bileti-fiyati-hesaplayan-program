import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, normalTutar, yasIndirimOrani, gidisDonusIndirimi, indirimliTutar, yasIndirimi, toplamTutar ;
        int yas, yolculukTipi;
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen km türünden mesafeyi giriniz: ");
        km=inp.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz: ");
        yas=inp.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        yolculukTipi=inp.nextInt();

        normalTutar=km * 0.10;
        if ((km<1) && (yas<0) && (yolculukTipi!=1 || yolculukTipi!=2)){
            System.out.println("Hatalı veri girdiniz.");
        } else {
            if(yas<12){
                yasIndirimOrani=0.10;
            } else if ((yas>=12) && (yas<24)) {
                yasIndirimOrani=0.10;
            } else if (yas>65) {
                yasIndirimOrani=0.30;
            } else{
                yasIndirimOrani=0;
            }

            yasIndirimi=(normalTutar*yasIndirimOrani);
            indirimliTutar=normalTutar-yasIndirimi;

            switch (yolculukTipi){
                case 2:
                    gidisDonusIndirimi=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-gidisDonusIndirimi) *2;
                    break;
                default:
                    toplamTutar=indirimliTutar;
                    break;
            }
            System.out.println("Toplam Tutar :"+ toplamTutar + "TL");
            System.out.println("Gideceğiniz mesafe: " + km +" km");
            System.out.println("Yaşınız: " + yas);

        }
    }
}
