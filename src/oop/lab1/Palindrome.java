package oop.lab1;

public class Palindrome {

    public static void main(String[] args) {

        args = new String[]{"madam", "racecar", "apple", "kayak", "song", "noon"};

        for(int i = 0; i < args.length; i++) {

            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    public static String reversString(String s) {
        String r = "";
        // переворачиваем строку последовательно считывая
        // символы исходной строки и записывая ее в строку r в обратном порядке
        for(int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
        return r;
    }

    public static boolean isPalindrome(String s) {
        // сравниваем полученную строку с исходной строкой и возвращаем результат
        return s.equals(reversString(s));
    }
}
