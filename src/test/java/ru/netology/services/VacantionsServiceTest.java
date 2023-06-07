package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacantionsServiceTest {

    @Test

    public void RestOrWork1() {
        VacantionsService service = new VacantionsService();
        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void RestOrWork2() {
        VacantionsService service = new VacantionsService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

}