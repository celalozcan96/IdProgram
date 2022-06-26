package IdProgram;

import java.util.Scanner;

//Ödev
//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

public class IdProgram {
    public static void main(String[] args) {
        String userName,passWord,newPassWord;
        int passWordReset;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName = inp.nextLine();
        System.out.print("Şifrenizi Giriniz :");
        passWord = inp.nextLine();

        if(userName.equals("celalozcan") && passWord.equals("celal123456")){
            System.out.println("Başarılı Şekilde Giriş Yaptınız !");

        }else{
            System.out.println("Şifreniz Yanlış !");

            System.out.println("Yeni Şifre Oluşturmak İçin '1',İptal için '2' Basın");
            passWordReset = inp.nextInt();

            if(passWordReset == 1){
                System.out.println("Yeni Şifre Giriniz!:");
                inp.nextLine();
                newPassWord = inp.nextLine();
                if(newPassWord.equals("celal123456") || newPassWord.equals(passWord)){
                    System.out.println("Yeni Şifreniz Eski Şifreniz İle Aynı Olamaz!");

                }else{
                    System.out.println("Yeni Şifre Başarıyla Oluşturuldu!");
                    System.out.println("Yeni Şifreniz:"  + newPassWord);

                }
                
            }else{
                System.out.println("Yeni Şifre Oluşturma işlemi İptal Edildi!");
            }
        }
    }
    
}
