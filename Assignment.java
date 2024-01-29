// #Program to check if a vowel is present in the string


public class Assignment {
    public static void main(String[] args) {
        String str = "BrowserStack";
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No vowels found");
        } else {
            System.out.println("Total vowels are: " + count);
        }
    }
}

// #Program to check if the given number is Prime

public class Assignment {
    public static void main(String[] args) {
        int num = 200;
        boolean flag = false;
        if (num > 1) {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    System.out.println("Not a prime number");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Prime number");
            }
        } else {
            System.out.println("Not a prime number");
        }
    }
}

