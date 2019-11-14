package br.pucrs.progdinam;

public class AppDemo {

	public static void main(String[] args) {
		EdtDistance ed = new EdtDistance();
		String str1, str2;
		long res = 0;
		KnapSack.KnapSackPiece [] pieces;
		long [] pesos;
		long [] valor;
	 
		System.out.println("Edit Distance\n");
		str1 = "O dia da semana";
		str2 = "quinta ou";
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
		
		System.out.println("\n\nKnapsack\n");
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

		System.out.println("Pares: (peso, valor)");
		for (int i = 0; i < pieces.length; i ++) {
			System.out.print("(" + pieces[i].getPeso() + ", " + pieces[i].getValor() + ")");
		}
		System.out.println("");
		res = KnapSack.knapSackRecursive(165, pieces);
		System.out.println("Maior valor (Knapsack Recursivo) = " + res );
	}
}
