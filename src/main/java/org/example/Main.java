package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int orgNumber=number;
        int rev=0;

        while (number > 0) {
            int lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number = number/10;
        }
        return orgNumber == rev;

    }
    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String result = "";
        String numberStr = String.valueOf(number);

        for (int i = 0; i < numberStr.length(); i++) {

            char digit = numberStr.charAt(i);

            switch (digit) {
                case '0': result += "Zero "; break;
                case '1': result += "One "; break;
                case '2': result += "Two "; break;
                case '3': result += "Three "; break;
                case '4': result += "Four "; break;
                case '5': result += "Five "; break;
                case '6': result += "Six "; break;
                case '7': result += "Seven "; break;
                case '8': result += "Eight "; break;
                case '9': result += "Nine "; break;
            }
        }

        return result.trim();
    }
}
