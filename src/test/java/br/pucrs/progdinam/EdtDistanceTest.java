package br.pucrs.progdinam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EdtDistanceTest {
	private EdtDistance ed = new EdtDistance();
	private long paraNada = 0;

	@Test
	void minTestComb1() {
		assertEquals(1, ed.min(1L, 2L, 3L));
	}
	@Test
	void minTestComb2() {
		assertEquals(1, ed.min(1L, 3L, 2L));
	}
	@Test
	void minTestComb3() {
		assertEquals(1, ed.min(2L, 1L, 3L));
	}
	@Test
	void minTestComb4() {
		assertEquals(1, ed.min(2L, 3L, 1L));
	}
	@Test
	void minTestComb5() {
		assertEquals(1, ed.min(3L, 1L, 2L));
	}
	@Test
	void minTestComb6() {
		assertEquals(1, ed.min(3L, 2L, 1L));
	}
	
	@Test
	void EdRecursiveTest1() {
		assertEquals(3, ed.EDRecursive("casa", "pai"));
	}
	@Test
	void EdRecursiveTest2() {
		assertEquals(1, ed.EDRecursive("islander", "slander"));
	}
	@Test
	void EdRecursiveTest3() {
		assertEquals(3, ed.EDRecursive("mart", "karma"));
	}
	@Test
	void EdRecursiveTest4() {
		assertEquals(3, ed.EDRecursive("kitten", "sitting"));
	}
	@Test
	void EdRecursiveTest5() {
		assertEquals(5, ed.EDRecursive("intention", "execution"));
	}
	
	@Test
	void EdProgDinamTest1() {
		assertEquals(3, ed.EDProgDinam("casa", "pai"));
	}
	@Test
	void EdProgDinamTest2() {
		assertEquals(1, ed.EDProgDinam("islander", "slander"));
	}
	@Test
	void EdProgDinamTest3() {
		assertEquals(3, ed.EDProgDinam("mart", "karma"));
	}
	@Test
	void EdProgDinamTest4() {
		assertEquals(3, ed.EDProgDinam("kitten", "sitting"));
	}
	@Test
	void EdProgDinamTest5() {
		assertEquals(5, ed.EDProgDinam("intention", "execution"));
	}
	
	@Test
	void EdProgDinamTest6() {
		assertEquals(10, ed.EDProgDinam("Casablanca", "Portentoso"));
	}
}
