import java.util.Scanner;

class atmProject9 {
    public static void main(String[] args) {
        String sysparola = "1234";
        int hak = 3;
        while (hak > 0 ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Şifreyi Giriniz: ");
            String parola1 = input.nextLine();

            if (parola1.equals(sysparola)) {
                System.out.println("Hoşgeldiniz!");
                break;
            }else {
                hak--;
                System.out.println("Yanlış Şifre! Kalan Hakkınız: " + hak);

                if (hak == 0) {
                    System.out.println("Kartınız Bloke Oldu. Çıkış Yapılıyor.");
                    return;
                    //Bu return komutunun özelliği sayesinde sonraki hiç bir kodu okumayacak ve kodu durduracaktır.
                }
            }
        }
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
                    bakiyeSorgulama(bakiye);
                    break;
                case 2:
                    bakiye = paraYatirma(bakiye);
                    break;
                case 3:
                    bakiye = paraCekme(bakiye);
                    break;
                case 4:
                    Cikis();
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
    public static void bakiyeSorgulama(double bakiye) {
        System.out.println("\nBakiyeniz: " + bakiye + "Tl\n");
    }
    public static double paraYatirma(double bakiye) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ne Kadar Para Yatırmak İstersiniz?");
        double paraYatirma = sc2.nextDouble();

        bakiye = bakiye + paraYatirma;

        System.out.println("\nYeni Bakiyeniz: " + bakiye + "Tl\n");
        return bakiye;
    }
    //(double bakiye) : Metodun işlemi yapacağı değer.
    //double paraCekme deki double ise çıkan sonucun değerini tanımlıyor.
    public static double paraCekme(double bakiye) {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ne Kadar Para Çekmek İstersiniz?");
        double paraCekme = sc3.nextDouble();

        if (paraCekme > bakiye) {
            System.out.println("Yetersiz Bakiye!");
        } else {
            bakiye = bakiye - paraCekme;
            System.out.println("\nYeni Bakiyeniz: " + bakiye + "Tl\n");
        }
        return bakiye;
    }
    public static void Cikis() {
        System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler!");
    }
}