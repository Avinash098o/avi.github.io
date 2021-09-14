package com.avi;

public class geekcount {
    public static void main(String[] args) {

        int count = 0, num = 1834;

        while (num != 0) {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);

}
}
