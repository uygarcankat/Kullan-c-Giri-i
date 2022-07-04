import java.util.Scanner;


public class UserAccount {

    public static void main(String[] args) {

        String password= "uygar1996.";

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen şifrenizi giriniz");

        password = input.nextLine();

        String answer = "";
        
        
        if (password.equals("uygar1996.")) {

            System.out.println("şifre doğru");}

        else{

            System.out.println("hatalı şifre!");
            System.out.println("şifreyi sıfırlamak ister misin");
            answer = input.nextLine();}



        if (answer.equals("evet") ) {

            System.out.println("Lütfen yeni şifre giriniz");

            String new_password = input.nextLine();


            if (new_password.equals ("uygar1996.")){

                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );}



                else {

                    System.out.println("şifre oluşturuldu"); }

        }


        else {
            System.out.println("Güncel şifrenizi tekrar deneyiniz");}


        }


    }




