package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestAlgoritmoFactorial {

	@Test
    void factorial() {
        int multiplicacionEsperada = 10;
        int multiplicacionObtenida = Algoritmos.factorial(4);
        assertEquals(multiplicacionEsperada, multiplicacionObtenida);
    }

}
