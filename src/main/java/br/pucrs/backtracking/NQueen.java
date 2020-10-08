package br.pucrs.backtracking;

import java.util.LinkedList;
import java.util.Deque;

public class NQueen {
	public int [][] nQueenBackTrackRec(int dim) {
		int [][] res = new int[2][dim];
		Deque<Integer[]>pilha = new LinkedList<Integer[]>();
		
		Integer [] posInit = new Integer[2];
		posInit[0] = 0;
		posInit[1] = 0;
		pilha.push(posInit);
		res = nQueenBackTrackRec(dim, 1, 0, res, pilha);
		
		return res;
	}

	private int[][] nQueenBackTrackRec(int dim, int linha, int coluna, int[][] res, Deque<Integer[]> pilha) {
		
		if (linha == dim)
			return res;
		else if (eValida(linha, coluna, res)) {
			
			
			
		}
		
		
		return null;
	}

	private boolean eValida(int linha, int coluna, int[][] res) {
		// TODO Auto-generated method stub
		return false;
	}
}
