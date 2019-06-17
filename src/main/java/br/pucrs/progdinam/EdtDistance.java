package br.pucrs.progdinam;

public class EdtDistance {
	public long EDRecursive(String str1, String str2) {
		long res = 0;
		long para_nada = 0;
		
		res = EDRecursive(str1, str2, str1.length() - 1, str2.length() - 1);
		
		return res;
	}

	private long EDRecursive(String str1, String str2, int pos1, int pos2) {
//		
//		ED(S, T, i, j): int
//		// S: String inicial, T: String final, i: [1..m], j:[1..n]
//		// retorna o número mínimo de edições quando comparando
//		// S[i] com T[j]. m é o tamanho de S, n o tamanho de T
//		//
//		Caso Base:
//		Quando ficamos sem caracteres para comparer em S ou em T. Se em ambas, o
//		resultado é 0. Se uma das duas, retorna o restante dos caracteres da que não
//		está vazia;
//		Casos Recursivos
//		Se S[i] == T[i], chame recursivamente ED(S, T, i-1, j-1) (foi match, não
//		precisa fazer nada nesta posição, o custo é zero.
//		Se não, três chamadas recursivas são necessárias:
//		• Substituição: ED(S, T, i-1, j-1) + 1
//		• Inserção: ED(S, T, i, j-1) + 1
//		• Remoção: ED(S, T, i-1, j) + 1
//		• Retorne a que resultar em menor custo
		
		long res = 0;
		
		if (pos1 == -1)
			res = pos2 + 1;
		else if (pos2 == -1)
				res = pos1 + 1;
		else if (str1.charAt(pos1) == str2.charAt(pos2))
				res = EDRecursive(str1, str2, pos1-1, pos2-1);
		else {
			long aux1 = EDRecursive(str1, str2, pos1-1, pos2-1) + 1;
			long aux2 = EDRecursive(str1, str2, pos1, pos2-1) + 1;
			long aux3 = EDRecursive(str1, str2, pos1-1, pos2) +1;
			
			res = min(aux1, aux2, aux3);
		}
		
		return res;
	}
	
	public long min(long l1, long l2, long l3) {
		if (l1 < l2)
			if (l1 < l3)
				return l1;
			else
				return l3;
		else
			if (l2 < l3)
				return l2;
			else 
				return l3;
	}
	
	public long EDProgDinam(String str1, String str2) {
//		Custos: Remoção=R, Inserção=I , Substituição=S e Match=M=0;
//		
//		m = tamanho[A];
//		n = tamanho[B];
//		matriz[0][0] = 0;
//		Para i = 1 até m
//			matriz[i][0] = matriz[i-1][0] + 1 // soma uma I;
//		Para j = 1 até n
//			matriz[0][j] = matriz[0][j-1] + 1 // Soma uma R;
//		
//		Para i = 1 até m
//			Para j = 1 até n
//				Se A[i] == B[j]
//					custoExtra = 0 //Operação M;
//				Senão
//					custoExtra = 1 //Operação S;
//				matriz[i][j] = Mínimo(matriz[i-1][j] +1, matriz[i][j-1] +1,
//											matriz[i-1][j-1] + custoExtra);
//		
//		devolva matriz[m][n];
		
		long res = 0;
		long custoExtra = 0;
		int m = str1.length();
		int n = str2.length();
		long [][] matriz = new long[m+1][n+1];
		
		for (int i = 1; i <= m; i++)
			matriz[i][0] = matriz[i-1][0] + 1;
		
		for (int j = 1; j <= n; j++)
			matriz[0][j] = matriz[0][j-1] + 1;

		for (int i = 1; i <= m; i++)
			for (int j = 1; j <= n; j++) {
				if (str1.charAt(i-1) == str2.charAt(j-1))
					custoExtra = 0; //Operação M;
				else 
					custoExtra = 1; //Operação S;
			 	matriz[i][j] = min(matriz[i-1][j] + 1, 
											matriz[i][j-1] + 1,
											matriz[i-1][j-1] + custoExtra);
			}
		return matriz[m][n];
	}
}
