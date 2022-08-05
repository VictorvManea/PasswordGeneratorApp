package PassGenerator;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String chars = "qwertyuiopasdfghjklzxcvbnm";
    public static String nr = "1234567890";
    public static String symbols = "!@#$%^&*()_+}{:?>";
    public static String upperCase = chars.toUpperCase();


    public static ArrayList<String> charPass = new ArrayList<>();
    public static ArrayList<String> nrPass = new ArrayList<>();
    public static ArrayList<String> symbPass = new ArrayList<>();
    public static ArrayList<String> upperCasePass = new ArrayList<>();



    public static Random rnd = new Random();
    public static Scanner scan = new Scanner(System.in);




    public static void main(String[] args) {

        System.out.println("Introdu marimea parolei: ");
        System.out.println(finalPassGenerator());
    }

    public static String alphaGenerator() {

        int size = chars.length();

        for (int i = 0; i < size; i++){
            charPass.add(String.valueOf(chars.charAt(rnd.nextInt(chars.length()))));
        }
        String password = String.join("", charPass);
        return password;

    }
    public static String nrGenerator() {

        int size = nr.length();

        for (int i = 0; i < size; i++){
            nrPass.add(String.valueOf(nr.charAt(rnd.nextInt(nr.length()))));
        }
        String password = String.join("", nrPass);
        return password;

    }
    public static String symbGenerator() {

        int size = 5;

        for (int i = 0; i < size; i++){
            symbPass.add(String.valueOf(symbols.charAt(rnd.nextInt(symbols.length()))));
        }
        String password1 = String.join("", symbPass);
        return password1;
    }
    public static String upperCaseGenerator() {

        int size = upperCase.length();

        for (int i = 0; i < size; i++){
            upperCasePass.add(String.valueOf(upperCase.charAt(rnd.nextInt(upperCase.length()))));
        }
        String password2 = String.join("", upperCasePass);
        return password2;
    }

    public static String finalPassGenerator() {
        String finalPass = alphaGenerator() + nrGenerator() + symbGenerator() + upperCaseGenerator();
        ArrayList<String> finalPassArr = new ArrayList<>();
        int passSize = scan.nextInt();
        for (int i = 0; i < passSize; i++){
            finalPassArr.add(String.valueOf(finalPass.charAt(rnd.nextInt(finalPass.length()))));
        }
        return String.join("", finalPassArr);
    }
}
