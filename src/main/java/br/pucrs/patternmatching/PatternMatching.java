package br.pucrs.patternmatching;


public class PatternMatching {
	private final int TAM_ALFABETO = 128;
	private final int NRO_PRIMO_GRANDE = 15487457;
	
	public long pmBruteForce(String txt, String pat) {
		long res = -1;
		boolean achou = false;
		int iniStr1, posStr1, posStr2;
		
		iniStr1 = posStr1 = 0;
		while (!achou && posStr1 < txt.length()) {
			posStr1 = iniStr1;
			posStr2 = 0;
			while (posStr1 < txt.length() && posStr2 < pat.length() && 
			       txt.charAt(posStr1) == pat.charAt(posStr2)) {
				posStr1++;
				posStr2++;
			}
			if (pat.length() == posStr2) {
				achou = true;
				res = iniStr1;
			}
			else
				iniStr1++;
		}
		return res;
	}
	
//
//	Notação: o padrão tem M caracteres, o texto tem N caracteres, o alfabeto tem TAM_ALFABETO 
//	                                                                   caracteres  (0 … TAM_ALFABETO−1) 
//	              Q é o módulo para o cálculo do Hash.
//	              Qual o valor de Q?  Escolha Q igual a um primo grande para minimizar a chance de colisões.
//	                       Por exemplo: o maior primo que possa ser representado com um int

	private int hash(String s, int M) {
	   int h = 0;
	   for (int j = 0; j < M; j++)
	      h = (h * TAM_ALFABETO + s.charAt(j)) % NRO_PRIMO_GRANDE;
	   return h;
	}
	
	public long pmRabinKarp(String txt, String pat) {
		   int M = pat.length();
		   int N = txt.length();
		   int patHash = hash(pat, M);
		   
		   for (int i = 0; i <= N - M; i++) {
		      long txtHash = hash(txt.substring(i, i+M), M);
		      if (patHash == txtHash)
		         return i; // ocorrência? colisão?
		   }
//		   return N; // nenhuma ocorrência
		   return -1;
		}
	
	private int hash(String s, int ini, int fim) {
		   int h = 0;
		   for (int j = ini; j <= fim; j++)
		      h = (h * TAM_ALFABETO + s.charAt(j)) % NRO_PRIMO_GRANDE;
		   return h;
		}
	
	public long pmRabinKarpV2(String txt, String pat) {
		   int M = pat.length();
		   int N = txt.length();
		   int patHash = hash(pat, M);
		   
		   for (int i = 0; i <= N - M; i++) {
		      long txtHash = hash(txt, i, i+(M-1));
		      if (patHash == txtHash)
		         return i; // ocorrência? colisão?
		   }
//		   return N; // nenhuma ocorrência
		   return -1;
		}

//
//	Knuth-Morris-Pratt Algorithm
//
	private void computeLPSArray(String pat, int M, int lps[]) 
	{ 
		// tamanho do maior prefixo sufixo anterior 
		int len = 0; 
		int i = 1; 
		lps[0] = 0; // lps[0] is always 0 

		// loop calcula lps[i] for i = 1 to M-1 
		while (i < M) { 
			if (pat.charAt(i) == pat.charAt(len)) { 
				len++; 
				lps[i] = len; 
				i++; 
			} 
			else // (pat[i] != pat[len]) 
			{ 
				if (len != 0) { 
					len = lps[len - 1]; 
				} 
				else // if (len == 0) 
				{ 
					lps[i] = len; 
					i++; 
				} 
			} 
		} 
	}
	
	
	public int pmKnuthMorrisPratt(String txt, String pat) 
	{ 
		int M = pat.length(); 
		int N = txt.length(); 

		// cria lps[] que vai guardar o maior 
		// valor prefixo sufixo para o padrão 
		int lps[] = new int[M]; 
		int j = 0; // index for pat[] 

		// Calcula lps[] 
		computeLPSArray(pat, M, lps); 

		int i = 0; // index for txt[] 
		while (i < N) { 
			if (pat.charAt(j) == txt.charAt(i)) { 
				j++; 
				i++; 
			} 
			if (j == M) { 
//				System.out.println("Found pattern "
//								+ "at index " + (i - j)); 
//				j = lps[j - 1]; 
				return (i-j);
			} 
			// mismatch após j matches 
			else if (i < N && pat.charAt(j) != txt.charAt(i)) { 
				// Não faz match dos caracteres lps[0..lps[j-1]], 
				// não é necesssário, eles combinarão 
				if (j != 0) 
					j = lps[j - 1]; 
				else
					i = i + 1; 
			} 
		} 
		return -1;
	} 
}
