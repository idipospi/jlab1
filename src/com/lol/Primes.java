package com.lol;

public class Primes {
    public static void main(String[] args) {
        for(int i = 2; i<=100; i++){
            // Если число простое - вывести его
         if (isPrime(i)) System.out.print(i + " ");
        }
    }
    public static boolean isPrime(int n){
        //Проверка простое ли число
        for(int i = 2; i<n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
