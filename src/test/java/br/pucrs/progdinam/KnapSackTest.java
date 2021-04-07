package br.pucrs.progdinam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.pucrs.progdinam.KnapSack.KnapSackPiece;
import br.pucrs.util.ContagemRes;

class KnapSackTest {
//
	@Test
	void KnapSackRecursiveTest1() {
		long capacidade = 15;
		KnapSackPiece[] pieces = new KnapSackPiece[5];
		
		pieces[0] = new KnapSack.KnapSackPiece(12,4);
		pieces[1] = new KnapSack.KnapSackPiece(4,10);
		pieces[2] = new KnapSack.KnapSackPiece(2,2);
		pieces[3] = new KnapSack.KnapSackPiece(1,2);
		pieces[4] = new KnapSack.KnapSackPiece(1,1);
		
		ContagemRes res = KnapSack.knapSackRecursive(capacidade, pieces);
		
		assertEquals(15, res.getResult()[0]);
	}

	@Test
	void KnapSackRecursiveTest2() {
		long capacidade = 165;
		KnapSack.KnapSackPiece[] pieces = new KnapSack.KnapSackPiece[10];
		
		pieces[0] = new KnapSack.KnapSackPiece(23,92);
		pieces[1] = new KnapSack.KnapSackPiece(31,57);
		pieces[2] = new KnapSack.KnapSackPiece(29,49);
		pieces[3] = new KnapSack.KnapSackPiece(44,68);
		pieces[4] = new KnapSack.KnapSackPiece(53,60);
		pieces[5] = new KnapSack.KnapSackPiece(38,43);
		pieces[6] = new KnapSack.KnapSackPiece(63,67);
		pieces[7] = new KnapSack.KnapSackPiece(85,84);
		pieces[8] = new KnapSack.KnapSackPiece(89,87);
		pieces[9] = new KnapSack.KnapSackPiece(82,72);

		ContagemRes res = KnapSack.knapSackRecursive(capacidade, pieces);
		
		assertEquals(309, res.getResult()[0]);
	}

	@Test
	void KnapSackRecursiveTest3() {
		long capacidade = 750;
		KnapSack.KnapSackPiece[] pieces = new KnapSack.KnapSackPiece[15];
		
		pieces[0] = new KnapSack.KnapSackPiece(70, 135);
		pieces[1] = new KnapSack.KnapSackPiece(73, 139);
		pieces[2] = new KnapSack.KnapSackPiece(77, 149);
		pieces[3] = new KnapSack.KnapSackPiece(80, 150);
		pieces[4] = new KnapSack.KnapSackPiece(82, 156);
		pieces[5] = new KnapSack.KnapSackPiece(87, 163);
		pieces[6] = new KnapSack.KnapSackPiece(90, 173);
		pieces[7] = new KnapSack.KnapSackPiece(94, 184);
		pieces[8] = new KnapSack.KnapSackPiece(98, 192);
		pieces[9] = new KnapSack.KnapSackPiece(106, 201);

		pieces[10] = new KnapSack.KnapSackPiece(110, 210);
		pieces[11] = new KnapSack.KnapSackPiece(113, 214);
		pieces[12] = new KnapSack.KnapSackPiece(115, 221);
		pieces[13] = new KnapSack.KnapSackPiece(118, 229);
		pieces[14] = new KnapSack.KnapSackPiece(120, 240);
		
		ContagemRes res = KnapSack.knapSackRecursive(capacidade, pieces);
		
		assertEquals(1458, res.getResult()[0]);
	}

}
