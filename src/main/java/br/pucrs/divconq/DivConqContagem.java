package br.pucrs.divconq;

import br.pucrs.sorts.Sorts;
import br.pucrs.util.ContagemRes;


public class DivConqContagem {


	public ContagemRes testaMergeSort(long [] vetor) {
		Sorts srt = new Sorts();
		ContagemRes sRes;

		sRes = srt.mergeSort(vetor);

		return sRes;
	}

	public ContagemRes maxVal1(long []vetor) {
		long max = vetor[0];
		long [] result = new long[1];
		
		ContagemRes sRes = new ContagemRes();
		sRes.resetCounters();
		
		sRes.incrInstrucoes(1);
		for (int i = 1; i < vetor.length; i++) {
			sRes.incrIteracoes(1);
			sRes.incrInstrucoes(6);
			if( vetor[i] > max ) {
				sRes.incrInstrucoes(2);
				max = vetor[i];
			}
		}
		
		result[0] = max;
		sRes.getClockSec();
		sRes.setResult(result);
		return sRes;
	}
	
	public ContagemRes maxVal2(long A[], int init, int end) {  
		long [] result = new long[1];
		
		ContagemRes sRes = new ContagemRes();
		sRes.resetCounters();
		sRes.incrIteracoes(1);

		sRes.incrInstrucoes(2);
	    if (end - init <= 1) {
	    	sRes.incrInstrucoes(6);
	        result[0] = Math.max(A[init], A[end]);
	        sRes.getClockSec();
	    }
	    else {
	    	  sRes.incrInstrucoes(14);
	          int m = (init + end)/2;
	          ContagemRes v1 = maxVal2(A,init,m);   
	          ContagemRes v2 = maxVal2(A,m+1,end);  
	          
	          result[0] = Math.max(v1.getResult()[0],v2.getResult()[0]); 
	          sRes.incrInstrucoes(v1.getInstrucoes());
	          sRes.incrInstrucoes(v2.getInstrucoes());
	          sRes.incrIteracoes(v1.getIteracoes());
	          sRes.incrIteracoes(v2.getIteracoes());
	          sRes.getClockSec();
	          sRes.setTime(sRes.getTime() + v1.getTime() + v2.getTime());
	    }
	    
	    sRes.setResult(result);
	    return sRes;
	}
}
