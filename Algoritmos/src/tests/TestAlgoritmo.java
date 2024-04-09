package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;
import util.Algoritmos;
class TestAlgoritmo {

	 @Test
	    void sumatorio() {
	        int sumaEsperada = 10;
	        int sumaObtenida = Algoritmos.sumatorio(4);
	        assertEquals(sumaEsperada, sumaObtenida);
	    }

}
