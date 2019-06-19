package br.pucrs.progdinam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnapsackTest {
//
	@Test
	void KnapSackRecursiveTest1() {
		long capacidade = 15;
		long [] pesos = {12, 4, 2, 1, 1};
		long [] valor = {4, 10, 2, 2, 1};
		long res = Knapsack.KnapSackRecursive(capacidade, pesos, valor);
		
		assertEquals(15, res);
	}

	void KnapSackRecursiveTest2() {
		long capacidade = 165;
		long [] pesos = { 23, 31, 29, 44, 53, 38, 63, 85, 89, 82 };
		long [] valor = { 92, 57, 49, 68, 60, 43, 67, 84, 87, 72};
		long res = Knapsack.KnapSackRecursive(capacidade, pesos, valor);
		
		assertEquals(309, res);
	}

}
