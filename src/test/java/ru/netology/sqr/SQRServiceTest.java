package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "1,98,0",
            "1,1000,22"
    })

    public void test(int minValue, int maxValue, int expected) {
        SQRService service = new SQRService();

        int actual = service.countSQR(minValue, maxValue);

        Assertions.assertEquals(expected, actual);

    }
}

