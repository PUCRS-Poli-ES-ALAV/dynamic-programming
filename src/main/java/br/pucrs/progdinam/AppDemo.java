package br.pucrs.progdinam;

import br.pucrs.progdinam.KnapSack.KnapSackPiece;
import br.pucrs.util.ContagemRes;

public class AppDemo {
	public static void printKnapSack(KnapSackPiece [] p, long c) {
		System.out.println("\n**********");
		System.out.println("Capacidade da Mochila = " + c);
		System.out.println("Pares: (peso, valor)");
		for (int i = 0; i < p.length; i ++) {
			System.out.print("(" + p[i].getPeso() + ", " + p[i].getValor() + ")");
		}
		System.out.println("\n");
	}
	
	public static void printStatsKnapSack(String subtitle, ContagemRes resCont) {
		System.out.println("Maior valor " + subtitle + " = " + resCont.getResult()[0] );
		System.out.println("Número de Iterações = " + subtitle + " = " + resCont.getIteracoes());
		System.out.println("Número de Instruções = " + subtitle + " = " + resCont.getInstrucoes() + "\n");
	}
	
	public static void printEditDistance() {
		
	}
	
	public static void main(String[] args) {
		EdtDistance ed = new EdtDistance();
		String str1, str2;
		long res = 0;
		ContagemRes resCont;
		KnapSackPiece [] pieces;
	 
		System.out.println("\n\nEdit Distance");
		str1 = "Casablanca";
		str2 = "Portentoso";
		System.out.println("Textos: \n" + "String 1: " + str1 + "\nString 2: " + str2);
		res = ed.EDProgDinam(str1, str2);
		System.out.println("Distancia (Prog Dinam) = " + res);
		res = ed.EDRecursive(str1, str2);
		System.out.println("Distancia (Recursive) " + res);

		System.out.println("Edit Distance\n");
		str1 = "abcdefghijklmnop";
		str2 = "rstuvwxyz";
		System.out.println("Textos: \n" + "String 1: " + str1 + "\nString 2: " + str2);
		res = ed.EDProgDinam(str1, str2);
		System.out.println("Distancia (Prog Dinam) = " + res);
		res = ed.EDRecursive(str1, str2);
		System.out.println("Distancia (Recursive) " + res);

		
		str1 = "Maven, a Yiddish word meaning";
		str2 = "This post is not about deep";
		System.out.println("\nTextos: \n" + "String 1: " + str1 + "\nString 2: " + str2);
		res = ed.EDProgDinam(str1, str2);
		System.out.println("Distancia (Prog Dinam) = " + res);

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
		System.out.println("\nTextos: \n" + "String 1: " + str1 + "\nString 2: " + str2);
		res = ed.EDProgDinam(str1, str2);
		System.out.println("Distancia (Prog Dinam) = " + res);
		
		System.out.println("\n\n*******Knapsack Problem");
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
		printStatsKnapSack("Recursive", resCont);
		
		pieces = new KnapSack.KnapSackPiece[6];
		pieces[0] = new KnapSack.KnapSackPiece(56, 50);
		pieces[1] = new KnapSack.KnapSackPiece(59, 50);
		pieces[2] = new KnapSack.KnapSackPiece(80, 64);
		pieces[3] = new KnapSack.KnapSackPiece(64, 46);
		pieces[4] = new KnapSack.KnapSackPiece(75, 50);
		pieces[5] = new KnapSack.KnapSackPiece(17, 05);

		printKnapSack(pieces, 190);
		resCont = KnapSack.knapSackRecursive(190, pieces);
		printStatsKnapSack("Recursive", resCont);
	}
}
