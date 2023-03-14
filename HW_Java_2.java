//1. Напишите метод, который принимает на вход строку (String) и определяет
//        является ли строка палиндромом (возвращает boolean значение).
//
//public class Palindrome {
//
//    public static void main(String [] args){
//        Palindrome pn = new Palindrome();
//
//        if(pn.isPalindrome("ABBA")){
//            System.out.println("Палиндром");
//        } else {
//            System.out.println("Не Палиндром");
//        }
//    }
//
//    public boolean isPalindrome(String original){
//        int i = original.length()-1;
//        int j=0;
//        while(i > j) {
//            if(original.charAt(i) != original.charAt(j)) {
//                return false;
//            }
//            i--;
//            j++;
//        }
//        return true;
//    }
//}

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова
//        TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ForkJoinTask;

public class HW_Java_2{
       public static void main (String [] args) {
        ForkJoinTask fourthTask = new FourthTask();
        fourthTask.writer();

        class FourthTask {

            public StringBuilder generateString() {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 100; i ++) {
                    stringBuilder.append("TEST ");
                }
                return stringBuilder;
            }

            public void writer() {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream ("test.txt");

                    fileOutputStream.write(generateString().toString().getBytes());

                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Проблема вывода!");
                    e.printStackTrace();
                }
            }
        }
    }
}