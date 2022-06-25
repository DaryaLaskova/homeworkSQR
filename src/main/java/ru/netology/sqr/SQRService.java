package ru.netology.sqr;

public class SQRService {

    public int countSQR(int minValue, int maxValue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue) {
                if (i * i <= maxValue) {
                    count++;
                }
            }
        }
        return count;
    }
}
