package ru.netology.javaqa.qamonthjava.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.qamonthjava.services.MonthService;

public class MonthServiceTest {

    @Test
    void calculate() {
        MonthService service = new MonthService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
