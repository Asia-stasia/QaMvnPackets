package ru.netology.services.QaMvnPackets.sevices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.QaMvnPackets.services.CalcService;

public class CalcServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //     "3,10000,3000,20000",
    //    "2,100000,60000,150000"
    // })
    @CsvFileSource(files = "src/test/resources/VacationMonths.csv")
    public void testCalcVacationMonths(int expected, int income, int expenses, int threshold) {

        ru.netology.services.QaMvnPackets.services.CalcService service = new CalcService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
    //@Test
    //public void testCalcVacationMonthsHigherIncomes() {

    //CalcService service = new CalcService();

    // int expected = 2;
    // int actual = service.calculate(100_000, 60000, 150_000);

    // Assertions.assertEquals(expected, actual);
    // }
}
