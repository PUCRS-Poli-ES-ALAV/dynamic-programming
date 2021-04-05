package br.pucrs.progdinam;

import br.pucrs.util.ContagemRes;
import br.pucrs.util.TimeCounter;

public class KnapSack {
	public static class KnapSackPiece {
		private long peso;
		private long valor;
		
		public KnapSackPiece(long p, long v) {
			peso = p;
			valor = v;
		}

		public long getPeso() {
			return peso;
		}

		public long getValor() {
			return valor;
		}
		
	}
	
//	Sendo w1,w2, ... ,wn inteiros para os pesos das peças, 
//        v1,v2, ... ,vn inteiros para os valores das peças,
//        W              inteiro para a capacidade da mochila
//	
//	m[i,w] 
//
//	m[0,w]=0
//	m[i,w]=m[i-1,w] if wi > w (the new item is more than the current weight limit)
//	m[i,w]=max(m[i-1,w],m[i-1,w-wi]+vi) if  wi <= w.
	
	public static ContagemRes knapSackRecursive(long capacidade, KnapSackPiece[] pieces)  {
		ContagemRes  res = new ContagemRes();
		int nroItens = pieces.length;
		long [] resVet = new long[1];
		
		res.setIteracoes(0);
		res.setInstrucoes(0);
		resVet[0] = knapSackRecursive(nroItens - 1, capacidade, pieces, res);
		res.setResult(resVet);
		
		return res;
	}

	private static long knapSackRecursive(int item, long capacidade, KnapSackPiece [] pieces, ContagemRes resCont) {
		long res = 0;
		
		resCont.incrIteracoes(1);
		resCont.incrInstrucoes(1);
		if (item == -1) {
			resCont.incrInstrucoes(1);
			res = 0;
		}
		else {
				resCont.incrInstrucoes(4);
				if (pieces[item].getPeso() > capacidade) {
					resCont.incrInstrucoes(3);
					res = knapSackRecursive(item-1, capacidade, pieces, resCont);
				}
				else {
						resCont.incrInstrucoes(14);
						res = Math.max(knapSackRecursive(item-1, capacidade, pieces, resCont), 
										knapSackRecursive(item-1, capacidade - pieces[item].getPeso(), pieces, resCont) 
															+ pieces[item].getValor());
				}
		}
		
		resCont.incrInstrucoes(1);
		return res;
	}

	public static long knapsackProgDinam(long capacidade, KnapSackPiece[] pieces) {
//			N = número de produtos;
//			C = capacidade real da mochila
//		
//			itens[N +1]; (O índice 0 guarda null)
//			maxTab[N+1][C+1];
//			
//			Inicialize com 0 toda a linha 0 e também a coluna 0;
//			
//			Para i = 1 até N
//				Para j = 1 até C
//					Se item itens[i].peso <= j // se o item cabe na mochila atual
//						maxTab[i][j] = Max(maxTab[i-1][j], itens[i].valor + maxTab[i-1][j – itens[i].peso]);
//					Senão
//						maxTab[i][j] = maxTab[i-1][j];
//			
//			Retorne maxTab[N][C] 
		long res = 0;
		long maxTab[][] = new long[pieces.length+1][(int) (capacidade + 1)];
		
		for (int linha = 0; linha < pieces.length + 1; linha++)
			for (int coluna = 0; coluna < capacidade + 1; coluna ++)
				maxTab[linha][coluna] = 0;
		
		
		return res;
	}
	
	public static long knapsackGreedy(long capacidade, KnapSackPiece[] pieces) {
		long res = 0;
		
		
		return res;
	}
}


