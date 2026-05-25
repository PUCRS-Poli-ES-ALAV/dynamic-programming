// package br.pucrs.backtracking;

// import java.util.LinkedList;
// import java.util.Deque;

// public class NQueen {
// 	public Queen nQueenBackTrackRec(int dim) {
// 		List<Queen> res = new LinkedList<>();
// 		Deque<Queen>pilha = new LinkedList<>();

// 		Queen posInit = new Queen(0, 0);
		
// 		pilha.push(posInit);
// 		res = nQueenBackTrackRec(dim, 1, 0, res, pilha);

// 		return new int[1];  //DUMMY
// 	}

// 	private List<Queen> nQueenBackTrackRec(int dim, int linha, int coluna, int[][] res, Deque<Integer[]> pilha) {

// 		if (linha == dim)
// 			return res;
// 		else if (eValida(linha, coluna, res)) {
// 				Integer [] pos = new Integer[2];
// 				res[linha][coluna] = 0; //<<<<---- Só para compilar.
// 				pos[0] = 0;
// 				pos[1] = 0;
// 				pilha.push(pos);

// 		}


// 		return null;
// 	}

// 	private boolean eValida(int linha, int coluna, int[][] res) {
// 		// TODO Auto-generated method stub
// 		return false;
// 	}
// }
