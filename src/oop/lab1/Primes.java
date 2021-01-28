package oop.lab1;

public class Primes {

    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (InPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean InPrime(int n) {

        // проверка на деления числа n с остатком, исключая само число n
        for(int j = 2; j < n; j++) if (n%j == 0) return false;
        return true;
    }
}
