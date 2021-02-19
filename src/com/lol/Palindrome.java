package com.lol;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        //Массив слов для проверки на палиндромность
        String[] mass;
        mass = new String[8];
        mass[0] = "java";
        mass[1] = "Palindrome";
        mass[2] = "madam";
        mass[3] = "racecar";
        mass[4] = "apple";
        mass[5] = "kayak";
        mass[6] = "song";
        mass[7] = "noon";

        for (int i = 0; i<8; i++){
            if(isPalindrome(mass[i])) System.out.println("Слово " + mass[i] + " является палиндромом.");
            else System.out.println("Слово " + mass[i] + " не является палиндромом.");
        }
    }
    //Функция переворота слова
    public static String reverseString(String inp){
        String reversed = "";

        int len = inp.length();
        for(int i = 0; i<len; i++){
            reversed = inp.charAt(i) + reversed;
        }
        return reversed;
    }
    //Функция проверки ялвяется ли слово палиндромом
    public static boolean isPalindrome(String s){
        boolean eq = false;
        String reversed = reverseString(s);
        if(s.equals(reversed)) eq = true;
        return eq;
    }

}
