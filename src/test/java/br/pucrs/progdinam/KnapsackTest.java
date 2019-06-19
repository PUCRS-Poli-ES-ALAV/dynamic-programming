package br.pucrs.progdinam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnapsackTest {
//
	@Test
	void KnapSackRecursiveTest1() {
		long [] pesos = {12, 4, 2, 1, 1};
		long [] valor = {4, 10, 2, 2, 1};
		long res = Knapsack.KnapSackRecursive(15, pesos, valor);
		long para = 0;
		
		assertEquals(14, res);
	}
}
