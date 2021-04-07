package br.pucrs.progdinam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.pucrs.util.ContagemRes;

class EdtDistanceTest {
	private EdtDistance ed = new EdtDistance();
	private long paraNada = 0;

	@Test
	void minTestComb1() {
		ContagemRes resCont = new ContagemRes();
		assertEquals(1, ed.min(1L, 2L, 3L, resCont));
	}
	@Test
	void minTestComb2() {
		ContagemRes resCont = new ContagemRes();
		assertEquals(1, ed.min(1L, 3L, 2L, resCont));
	}
	@Test
	void minTestComb3() {
		ContagemRes resCont = new ContagemRes();
		assertEquals(1, ed.min(2L, 1L, 3L, resCont));
	}
	@Test
	void minTestComb4() {
		ContagemRes resCont = new ContagemRes();
		assertEquals(1, ed.min(2L, 3L, 1L, resCont));
	}
	@Test
	void minTestComb5() {
		ContagemRes resCont = new ContagemRes();
		assertEquals(1, ed.min(3L, 1L, 2L, resCont));
	}
	@Test
	void minTestComb6() {
		ContagemRes resCont = new ContagemRes();
		assertEquals(1, ed.min(3L, 2L, 1L, resCont));
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
		ContagemRes resCont = ed.EDProgDinam("casa", "pai");
		assertEquals(3, resCont.getResult()[0]);
	}
	@Test
	void EdProgDinamTest2() {
		ContagemRes resCont = ed.EDProgDinam("islander", "slander");
		assertEquals(1, resCont.getResult()[0]);
	}
	@Test
	void EdProgDinamTest3() {
		ContagemRes resCont = ed.EDProgDinam("mart", "karma");
		assertEquals(3, resCont.getResult()[0]);
	}
	@Test
	void EdProgDinamTest4() {
		ContagemRes resCont = ed.EDProgDinam("kitten", "sitting");
		assertEquals(3, resCont.getResult()[0]);
	}
	@Test
	void EdProgDinamTest5() {
		ContagemRes resCont = ed.EDProgDinam("intention", "execution");
		assertEquals(5, resCont.getResult()[0]);
	}
	
	@Test
	void EdProgDinamTest6() {
		ContagemRes resCont = ed.EDProgDinam("Casablanca", "Portentoso");
		assertEquals(10, resCont.getResult()[0]);
	}
}
