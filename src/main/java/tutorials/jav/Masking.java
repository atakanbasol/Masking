package tutorials.jav.examples;
// kullanıcıdan aldığımız isim soyisim (boşluk var)
// ilk karakter göstersin sonraki kelimeleri masking (maskeleme yapsın)
// eğer kullanıcı isim ve soyisimi ilk karakteri küçük girmişse büyük olsun mutlaka
// Atakan Başol
// A**** BAŞ***

import java.util.Scanner;

public class Masking {
    public static void usernameAndSurnameMasking(){
        String username,surname;
        Scanner klavye=new Scanner(System.in);
        System.out.println("Adınız ve Soyadınız");
        String usernameAndSurname=klavye.nextLine();

        username = usernameAndSurname.substring(0, usernameAndSurname.indexOf(" "));
        for (int i = 1; i < username.length(); i++) {
            username = username.replace(username.charAt(i), '*');
        }
        System.out.println(username.toUpperCase());

        surname = usernameAndSurname.substring(usernameAndSurname.indexOf(" ") + 1, usernameAndSurname.length());
        for (int i = 3; i < surname.length(); i++) {
            surname = surname.replace(surname.charAt(i), '*');
        }
        System.out.println(surname.toUpperCase());
    }

    public static void main(String[] args) {
        usernameAndSurnameMasking();
    }
}