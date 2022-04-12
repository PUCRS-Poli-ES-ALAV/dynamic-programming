package br.pucrs.progdinam;

import br.pucrs.progdinam.KnapSack.KnapSackPiece;
import br.pucrs.proggulos.ColecaoIntervalos;
import br.pucrs.util.ContagemRes;

public class AppDemo {
	public static void printKnapSack(KnapSackPiece [] p, long c) {
		System.out.println("**********");
		System.out.println("Capacidade da Mochila = " + c);
		System.out.println("Pares: (peso, valor)");
		for (int i = 0; i < p.length; i ++) {
			System.out.print("(" + p[i].getPeso() + ", " + p[i].getValor() + ")");
		}
		System.out.println("\n");
	}
	
	public static void printEditDistance(String s1, String s2) {
		System.out.println("**********");
		System.out.println("Textos: \n" + "String 1: " + s1 + "\nString 2: " + s2);
		System.out.println("\n");
	}
	
	
	public static void printIntervalos(String s1, ColecaoIntervalos.Intervalos [] inter) {
		System.out.println("**********");
		System.out.println(s1 + ": ");

		for (int i = 0; i < inter.length; i ++) {
			System.out.print("(" + inter[i].getInicio() + ", " + inter[i].getFim() + ") ");
		}

		System.out.println("\n");
	}
	

	public static void printStats(String subtitle, ContagemRes resCont) {
		System.out.println("Maior valor (" + subtitle + ") = " + resCont.getResult()[0] );
		System.out.println("Número de Iterações (" + subtitle + ") = " + resCont.getIteracoes());
		System.out.println("Número de Instruções (" + subtitle + ") = " + resCont.getInstrucoes() + "\n");
	}
	
	public static void main(String[] args) {
		EdtDistance ed = new EdtDistance();
		ColecaoIntervalos colIntervalos = new ColecaoIntervalos();
		String str1, str2;
		ContagemRes resCont;
		KnapSackPiece [] pieces;
		ColecaoIntervalos.Intervalos [] intervalos, resIntervalos;
	 
		System.out.println("\n\n----> Knapsack Problem");
		pieces = new KnapSack.KnapSackPiece[10];
		pieces[0] = new KnapSack.KnapSackPiece(23, 92);
		pieces[1] = new KnapSack.KnapSackPiece(31, 57);
		pieces[2] = new KnapSack.KnapSackPiece(29, 49);
		pieces[3] = new KnapSack.KnapSackPiece(44, 68);
		pieces[4] = new KnapSack.KnapSackPiece(53, 60);
		pieces[5] = new KnapSack.KnapSackPiece(38, 43);
		pieces[6] = new KnapSack.KnapSackPiece(63, 67);
		pieces[7] = new KnapSack.KnapSackPiece(85, 84);
		pieces[8] = new KnapSack.KnapSackPiece(89, 87);
		pieces[9] = new KnapSack.KnapSackPiece(82, 72);

		printKnapSack(pieces, 165);
		resCont = KnapSack.knapSackRecursive(165, pieces);
		printStats("Recursive", resCont);
		resCont = KnapSack.knapSackProgDinam(165, pieces);
		printStats("Prog. Dinâmica", resCont);

		pieces = new KnapSack.KnapSackPiece[6];
		pieces[0] = new KnapSack.KnapSackPiece(56, 50);
		pieces[1] = new KnapSack.KnapSackPiece(59, 50);
		pieces[2] = new KnapSack.KnapSackPiece(80, 64);
		pieces[3] = new KnapSack.KnapSackPiece(64, 46);
		pieces[4] = new KnapSack.KnapSackPiece(75, 50);
		pieces[5] = new KnapSack.KnapSackPiece(17, 05);

		printKnapSack(pieces, 190);
		resCont = KnapSack.knapSackRecursive(190, pieces);
		printStats("Recursive", resCont);
		resCont = KnapSack.knapSackProgDinam(190, pieces);
		printStats("Prog. Dinâmica", resCont);

		pieces = new KnapSack.KnapSackPiece[30];
		for (int i = 0; i < 30; i ++) {
			pieces[i] = new KnapSack.KnapSackPiece(1, i % 20);
		}
		
		printKnapSack(pieces, 190);
		resCont = KnapSack.knapSackRecursive(190, pieces);
		printStats("Recursive", resCont);
		resCont = KnapSack.knapSackProgDinam(190, pieces);
		printStats("Prog. Dinâmica", resCont);
		


		System.out.println("\n\n----> Edit Distance");
		str1 = "casa";
		str2 = "pai";
		printEditDistance(str1, str2);
		resCont = ed.EDRecursive(str1, str2);
		printStats("Recursive", resCont);
		resCont = ed.EDProgDinam(str1, str2);
		printStats("ProgDin", resCont);


		str1 = "Casablanca";
		str2 = "Portentoso";
		printEditDistance(str1, str2);
		resCont = ed.EDRecursive(str1, str2);
		printStats("Recursive", resCont);
		resCont = ed.EDProgDinam(str1, str2);
		printStats("ProgDin", resCont);

		str1 = "abcdefghijklmnop";
		str2 = "rstuvwxyz";
		printEditDistance(str1, str2);
		resCont = ed.EDRecursive(str1, str2);
		printStats("Recursive", resCont);
		resCont = ed.EDProgDinam(str1, str2);
		printStats("ProgDin", resCont);
		
		str1 = "Maven, a Yiddish word meaning";
		str2 = "This post is not about deep";
		printEditDistance(str1, str2);
//		resCont = ed.EDRecursive(str1, str2);
//		printStats("Recursive", resCont);
		resCont = ed.EDProgDinam(str1, str2);
		printStats("ProgDin", resCont);
		
		str1 = "Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
				"simplify the build processes in the Jakarta Turbine project. There were several" + 
				" projects, each with their own Ant build files, that were all slightly different." +
				"JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
				"definition of what the project consisted of, an easy way to publish project information" +
				"and a way to share JARs across several projects. The result is a tool that can now be" +
				"used for building and managing any Java-based project. We hope that we have created " +
				"something that will make the day-to-day work of Java developers easier and generally help " +
				"with the comprehension of any Java-based project.";
		str2 = "This post is not about deep learning. But it could be might as well. This is the power of " +
				"kernels. They are universally applicable in any machine learning algorithm. Why you might" +
				"ask? I am going to try to answer this question in this article.\r\n" + 
			   "Go to the profile of Marin Vlastelica Pogančić" + 
			   "Marin Vlastelica Pogančić Jun";
		printEditDistance(str1, str2);
//		resCont = ed.EDRecursive(str1, str2);
//		printStats("Recursive", resCont);
		resCont = ed.EDProgDinam(str1, str2);
		printStats("ProgDin", resCont);


		System.out.println("\n\n----> Escalonamento de Intervalos");
		intervalos = new ColecaoIntervalos.Intervalos[11];	

		intervalos[0] = new ColecaoIntervalos.Intervalos(2, 4);
		intervalos[1] = new ColecaoIntervalos.Intervalos(4, 5);
		intervalos[2] = new ColecaoIntervalos.Intervalos(1, 6);
		intervalos[3] = new ColecaoIntervalos.Intervalos(6, 7);
		intervalos[4] = new ColecaoIntervalos.Intervalos(4, 8);
		intervalos[5] = new ColecaoIntervalos.Intervalos(6, 9);
		intervalos[6] = new ColecaoIntervalos.Intervalos(7, 10);
		intervalos[7] = new ColecaoIntervalos.Intervalos(9, 11);
		intervalos[8] = new ColecaoIntervalos.Intervalos(9, 12);
		intervalos[9] = new ColecaoIntervalos.Intervalos(3, 13);
		intervalos[10] = new ColecaoIntervalos.Intervalos(13, 14);

		printIntervalos("Intervalos de Entrada", intervalos);
		ContagemRes resContInter = new ContagemRes();
		resIntervalos = colIntervalos.escalonamentoIntervalos(intervalos, resContInter);
		printIntervalos("Intervalos Resultantes", resIntervalos);
		printStats("Escalonamento", resContInter);
		

		intervalos = new ColecaoIntervalos.Intervalos[15];	

		intervalos[0] = new ColecaoIntervalos.Intervalos(2, 4);
		intervalos[1] = new ColecaoIntervalos.Intervalos(4, 8);
		intervalos[2] = new ColecaoIntervalos.Intervalos(8, 12);
		intervalos[3] = new ColecaoIntervalos.Intervalos(12, 16);
		intervalos[4] = new ColecaoIntervalos.Intervalos(16, 20);
		intervalos[5] = new ColecaoIntervalos.Intervalos(20, 24);
		intervalos[6] = new ColecaoIntervalos.Intervalos(25, 30);
		intervalos[7] = new ColecaoIntervalos.Intervalos(30, 34);
		intervalos[8] = new ColecaoIntervalos.Intervalos(34, 38);
		intervalos[9] = new ColecaoIntervalos.Intervalos(38, 42);
		intervalos[10] = new ColecaoIntervalos.Intervalos(42, 56);
		intervalos[11] = new ColecaoIntervalos.Intervalos(42, 56);
		intervalos[12] = new ColecaoIntervalos.Intervalos(42, 56);
		intervalos[13] = new ColecaoIntervalos.Intervalos(42, 56);
		intervalos[14] = new ColecaoIntervalos.Intervalos(42, 56);

		printIntervalos("Intervalos de Entrada", intervalos);
		resContInter = new ContagemRes();
		resIntervalos = colIntervalos.escalonamentoIntervalos(intervalos, resContInter);
		printIntervalos("Intervalos Resultantes", resIntervalos);
		printStats("Escalonamento", resContInter);
		
	}
}
