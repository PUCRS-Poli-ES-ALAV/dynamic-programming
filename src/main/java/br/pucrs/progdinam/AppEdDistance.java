package br.pucrs.progdinam;

public class AppEdDistance {

	public static void main(String[] args) {
		EdtDistance ed = new EdtDistance();
		 
		long res = 0;
	 
		res = ed.EDProgDinam("abcdefghijklmnop",  "rstuvwxyz");
		System.out.println("res Dinam = " + res);
		res = ed.EDRecursive("abcdefghijklmnop",  "rstuvwxyz");
		System.out.println("res Recursive= " + res);
		
//		res = ed.EDRecursive("Maven, a Yiddish word meaning accumulator of knowledge, began as an attempt to " +
//								"simplify the build processes in the Jakarta Turbine project. There were several" + 
//								" projects, each with their own Ant build files, that were all slightly different." +
//								"JARs were checked into CVS. We wanted a standard way to build the projects, a clear "+ 
//								"definition of what the project consisted of, an easy way to publish project information" +
//								"and a way to share JARs across several projects. The result is a tool that can now be" +
//								"used for building and managing any Java-based project. We hope that we have created " +
//								"something that will make the day-to-day work of Java developers easier and generally help " +
//								"with the comprehension of any Java-based project.", 
//							   "This post is not about deep learning. But it could be might as well. This is the power of " +
//								"kernels. They are universally applicable in any machine learning algorithm. Why you might" +
//								"ask? I am going to try to answer this question in this article.\r\n" + 
//							   "Go to the profile of Marin Vlastelica Pogančić" + 
//							   "Marin Vlastelica Pogančić Jun");
//		System.out.println("res = " + res);
		
		res = ed.EDProgDinam("Maven, a Yiddish word meaning",
				"This post is not about deep");
		System.out.println("res Dinam = " + res);	

		res = ed.EDRecursive("Maven, a Yiddish word meaning",
							"This post is not about deep");
		System.out.println("res Recursive = " + res);	
	}

}
