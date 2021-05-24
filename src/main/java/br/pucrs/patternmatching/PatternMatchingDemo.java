package br.pucrs.patternmatching;
import br.pucrs.util.*;

public class PatternMatchingDemo {
	private static String geraString(int size, int rep) {
		StringBuilder res = new StringBuilder();;
		String charStr = "ABCDEFGHIJKLMOPQRSTWXYZ";
		int posCharStr = 0;
		
		if (size > 0 && rep > 0 && rep < charStr.length()) {
			for (int i = 0; i < size; i++) {
				res.append(charStr.charAt(posCharStr));
				posCharStr++;
				if (posCharStr == rep)
					posCharStr = 0;
			}
		}
		return res.toString();
	}
	
	public static void main(String[] args) {
		PatternMatching pm = new PatternMatching();
		TimeCounter timer = new TimeCounter();
		double segundos;
		long posicao;
		
		System.out.println("*******************************");
		System.out.println("*Pequenos testes de verifica��o");
		System.out.println("*******************************");
		
		String txt = "ABCDCBDCBDACBDABDCBADF"; 
		String pat = "ADF";
		System.out.println("txt = " + txt + "\npat = " + pat);
		System.out.println("\t       Brute Force -> " + pm.pmBruteForce(txt, pat));
		System.out.println("\t       Rabin-Karp -> " + pm.pmRabinKarp(txt, pat));
		System.out.println("\t       Rabin-KarpV2 -> " + pm.pmRabinKarpV2(txt, pat));
		System.out.println("\tKnuth-Morris-Prat -> " + pm.pmKnuthMorrisPratt(txt, pat));
		
		txt = "ABCDCBDCBDACBDABDCBADF"; 
		pat = "JJJ";
		System.out.println("\ntxt = " + txt + "\npat = " + pat);
		System.out.println("\t       Brute Force -> " + pm.pmBruteForce(txt, pat));
		System.out.println("\t       Rabin-Karp -> " + pm.pmRabinKarp(txt, pat));
		System.out.println("\t       Rabin-KarpV2 -> " + pm.pmRabinKarpV2(txt, pat));
		System.out.println("\tKnuth-Morris-Prat -> " + pm.pmKnuthMorrisPratt(txt, pat));
		
		System.out.println("\ntxt = " + pat + "\npat = " + txt);
		System.out.println("\t       Brute Force -> " + pm.pmBruteForce(txt, pat));
		System.out.println("\t       Rabin-Karp -> " + pm.pmRabinKarp(pat, txt));
		System.out.println("\t       Rabin-KarpV2 -> " + pm.pmRabinKarpV2(txt, pat));
		System.out.println("\tKnuth-Morris-Prat -> " + pm.pmKnuthMorrisPratt(pat, txt));
		
		txt = PatternMatchingDemo.geraString(50, 20); 
		pat = "TWABCDEFGHIJK";
		System.out.println("\ntxt = " + txt + "\npat = " + pat);
		System.out.println("\t       Brute Force -> " + pm.pmBruteForce(txt, pat));
		System.out.println("\t       Rabin-Karp -> " + pm.pmRabinKarp(txt, pat));
		System.out.println("\t       Rabin-KarpV2 -> " + pm.pmRabinKarpV2(txt, pat));
		System.out.println("\tKnuth-Morris-Prat -> " + pm.pmKnuthMorrisPratt(txt, pat));
		

		System.out.println("\n*******************************");
		System.out.println("*Testes comm grandes strings   ");
		System.out.println("*******************************");
		
		
		txt = PatternMatchingDemo.geraString(50_000, 2); 
		pat = PatternMatchingDemo.geraString(20_000, 2);
		pat = pat + "Z";
		System.out.println("txt com " + 50_000 + "\npat com " + 20_001);
		timer.initCounter();
		posicao = pm.pmBruteForce(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Brute Force -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmRabinKarp(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Rabin-Karp -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmRabinKarpV2(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Rabin-KarpV2 -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmKnuthMorrisPratt(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\tKnuth-Morris-Prat -> " + posicao + ". Tempo: " + segundos);
		
		txt = PatternMatchingDemo.geraString(500_000, 2); 
		pat = PatternMatchingDemo.geraString(20_000, 2);
		pat = pat + "Z";
		System.out.println("\ntxt com " + 500_000 + "\npat com " + 20_001);
		timer.initCounter();
		posicao = pm.pmBruteForce(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Brute Force -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmRabinKarp(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Rabin-Karp -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmRabinKarpV2(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Rabin-KarpV2 -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmKnuthMorrisPratt(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\tKnuth-Morris-Prat -> " + posicao + ". Tempo: " + segundos);
		
		txt = PatternMatchingDemo.geraString(500_000, 2); 
		pat = PatternMatchingDemo.geraString(20_000, 2);
		txt = txt + "Z";
		pat = pat + "Z";
		System.out.println("\ntxt com " + 500_001 + "\npat com " + 20_001);
		timer.initCounter();
		posicao = pm.pmBruteForce(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Brute Force -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmRabinKarp(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Rabin-Karp -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmRabinKarpV2(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\t       Rabin-KarpV2 -> " + posicao + ". Tempo: " + segundos);
		timer.initCounter();
		posicao = pm.pmKnuthMorrisPratt(txt, pat);
		segundos = timer.getCounter();
		System.out.println("\tKnuth-Morris-Prat -> " + posicao + ". Tempo: " + segundos);
	}
}
