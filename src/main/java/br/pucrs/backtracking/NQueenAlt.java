package br.pucrs.backtracking;

public class NQueenAlt {
    
    private int [] X;
    private boolean first;
    private int sol_counter;

    public NQueenAlt(int n){

        X = new int[n];
        first = false;
        sol_counter = 0; //contador de solucoes
    }

    public boolean Place(int k, int i) {

        for(int j=0; j<k; j++){

            if(((X[j])==i) || (Math.abs(X[j]-i) == Math.abs(j-k))) 
                return false;
        }

        return true;

    }

    public void NQueensBacktracking(int k, int n, boolean all) {

        for(int i=0; i<n; i++){

            if(Place(k, i)) {

                X[k] = i;
                if(k==(n-1) && first==false) {  
                        
                        sol_counter++;
                        // System.out.println("Solucao:" + (++sol_counter));
                        // for(int j=0; j<n; j++)
                        //     System.out.print(X[j] + " ");
                        // System.out.println("\n**********");
                        first = !all; //flag para controlar se mostra apenas a primeira ou todas as solucoes.
                }
                    else
                    NQueensBacktracking(k+1, n, all);
            }
        }
    }

    public static void main(String args[])
    {
        int n = 4;
        NQueenAlt Queens = new NQueenAlt(n);
        System.out.println("NQueensBacktracking");
        Queens.NQueensBacktracking(0, n, true);
        System.out.println("Solucoes: " + Queens.sol_counter);

        n = 6;
        Queens = new NQueenAlt(n);
        System.out.println("NQueensBacktracking");
        Queens.NQueensBacktracking(0, n, true);    
        System.out.println("Solucoes: " + Queens.sol_counter);

        n = 8;
        Queens = new NQueenAlt(n);
        System.out.println("NQueensBacktracking");
        Queens.NQueensBacktracking(0, n, true);
        System.out.println("Solucoes: " + Queens.sol_counter);

        n = 16;
        Queens = new NQueenAlt(n);
        System.out.println("NQueensBacktracking");
        Queens.NQueensBacktracking(0, n, true);
        System.out.println("Solucoes: " + Queens.sol_counter);
    }

}