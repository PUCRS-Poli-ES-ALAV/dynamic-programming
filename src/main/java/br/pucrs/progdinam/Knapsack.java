package br.pucrs.progdinam;

public class Knapsack {
	
//	Sendo w1,w2, ... ,wn inteiros para os pesos das peças, 
//        v1,v2, ... ,vn inteiros para os valores das peças,
//        W              inteiro para a capacidade da mochila
//	
//	m[i,w] 
//
//	m[0,w]=0
//	m[i,w]=m[i-1,w] if wi > w (the new item is more than the current weight limit)
//	m[i,w]=max(m[i-1,w],m[i-1,w-wi]+vi) if  wi <= w.
	
	public static long KnapSackRecursive(long capacidade, long[]pesos, long[]valores) {
		long res = 0;
		int nroItens = pesos.length;
		
		res = KnapSackRecursive(nroItens - 1, capacidade, pesos, valores);
		return res;
	}

	private static long KnapSackRecursive(int item, long capacidade, long[]pesos, long[]valores) {
		long res = 0;
		
		if (item == -1)
			res = 0;
		else if (pesos[item] > capacidade)
				res = KnapSackRecursive(item-1, capacidade, pesos, valores);
		else 
				res = Math.max(KnapSackRecursive(item-1, capacidade, pesos, valores), 
								KnapSackRecursive(item-1, capacidade - pesos[item], pesos, valores) + valores[item]);
		
		return res;
	}

}


