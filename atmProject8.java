import java.util.Scanner;

class atmProject {
    public static void main(String[] args) {
        /*
        switch(değişken) : Parantez içine kontrol edilecek değişken girilir.
        case değer : eğer değişken değere eşitse bu case'e gir.
        break : eğer break yazılmazsa eşleşen durumlarda bile kod durmaz ve diğer case'leri de çalıştırır, buna faal-through denir.
        default : ELse ile benzer yapıdadır eğer hiç bir eşleşme olmazsa burası çalışır.

        Eğer iki case de de aynı işlemin yapılmasını istersek böyle yazarız:
           case 'k'
           case 'q'
                System.out.println("Kabul edildi");
                break;
         */
        /*

        int islem = 3;

        switch (islem) {
            case 1:
                System.out.println("Bakiye Sorguanıyor...");
                break;

            case 2:
                System.out.println("Para Yatırma Ekranı...");
                break;

            case 3:
                System.out.println("Para Çekme Ekranı...");
                break;

            case 4:
                System.out.println("Çıkış Yapılıyor...");
                break;

            default:
                System.out.println("Geçersiz Kart İşlemi!");
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Bakiye Belirleyin");
        double bakiye = sc.nextDouble();

        boolean devam = true;

        while (devam) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Hoşgeliniz! Yapmak İstediğiniz İşlemin Numarasını Seçiniz\n1:Bakiye Sorgulama\n2:Para Yatırma\n3:Para Çekme\n4:Çıkış");
            int islemSecimi = sc.nextInt();

            switch (islemSecimi) {
                case 1:
                    System.out.println("\nBakiyeniz: " + bakiye + "Tl\n");
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Ne Kadar Para Yatırmak İstersiniz?");
                    double paraYatirma = sc2.nextDouble();

                    bakiye = bakiye + paraYatirma;
                    System.out.println("\nYeni Bakiyeniz: " + bakiye + "Tl\n");
                    break;
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Ne Kadar Para Çekmek İstersiniz?");
                    double paraCekme = sc3.nextDouble();

                    if (paraCekme > bakiye) {
                        System.out.println("Yetersiz Bakiye!");
                    } else {
                        bakiye = bakiye - paraCekme;
                        System.out.println("\nYeni Bakiyeniz: " + bakiye + "Tl\n");
                    }
                    break;
                case 4:
                    System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler!");
                    devam = false;
                    break;
                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }
            if (devam) {
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Başka Bir İşlem Yapmak İster Misiniz?\nEvet\nHayır");
                String cevap = scan1.nextLine();

                if (cevap.equals("Hayır")) {
                    devam = false;
                    System.out.println("Sistemden Çıkılıyor. İyi Günler!");
                }
            }
        }


    }
}