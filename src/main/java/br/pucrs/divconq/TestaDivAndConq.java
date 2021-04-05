package br.pucrs.divconq;

import br.pucrs.util.ContagemRes;
import sort_algos.Sorts;

public class TestaDivAndConq {

	public static void main(String [] args) {
		int TAM_VET;
		int LIM_CONTENT_VET;
		ContagemRes res;
		Sorts srt = new Sorts();
		DivConqContagem divConq = new DivConqContagem();
		long [] vetor;

		TAM_VET = 32;
		LIM_CONTENT_VET = TAM_VET * 2;
		vetor = srt.geraVetor(TAM_VET, LIM_CONTENT_VET);
		res = divConq.testaMergeSort(vetor);
		System.out.println("*******************Merge Sort*******************");
		System.out.println("************************************************");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		

		TAM_VET = 2048;
		LIM_CONTENT_VET = TAM_VET * 2;
		vetor = srt.geraVetor(TAM_VET, LIM_CONTENT_VET);
		res = divConq.testaMergeSort(vetor);
		System.out.println("************************************************");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		

		TAM_VET = 1_048_576;
		LIM_CONTENT_VET = TAM_VET * 2;
		vetor = srt.geraVetor(TAM_VET, LIM_CONTENT_VET);
		res = divConq.testaMergeSort(vetor);
		System.out.println("************************************************");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		

		TAM_VET = 32;
		LIM_CONTENT_VET = TAM_VET * 2;
		vetor = srt.geraVetor(TAM_VET, LIM_CONTENT_VET);
		res = divConq.maxVal1(vetor);
		System.out.println("\n********************MaxVal*********************");
		System.out.println("************************************************");
		System.out.println("* MaxVal1:");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");
		res = divConq.maxVal2(vetor, 0, TAM_VET - 1);
		System.out.println("************************************************");
		System.out.println("* MaxVal2:");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");

		TAM_VET = 2048;
		LIM_CONTENT_VET = TAM_VET * 2;
		vetor = srt.geraVetor(TAM_VET, LIM_CONTENT_VET);
		res = divConq.maxVal1(vetor);
		System.out.println("************************************************");
		System.out.println("* MaxVal2:");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		
		res = divConq.maxVal2(vetor, 0, TAM_VET - 1);
		System.out.println("************************************************");
		System.out.println("* MaxVal2:");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		

		TAM_VET = 1_048_576;
		LIM_CONTENT_VET = TAM_VET * 2;
		vetor = srt.geraVetor(TAM_VET, LIM_CONTENT_VET);
		res = divConq.maxVal1(vetor);
		System.out.println("************************************************");
		System.out.println("* MaxVal1:");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		
		res = divConq.maxVal2(vetor, 0, TAM_VET - 1);
		System.out.println("************************************************");
		System.out.println("* MaxVal2:");
		System.out.println("* Tamanho do vetor: \t " + TAM_VET);
		System.out.println("* N�mero de Iterações:\t"+  res.getIteracoes());
		System.out.println("* N�mero de Instruções:\t"+  res.getInstrucoes());
		System.out.println("* Tempo (em seg.):\t"+  res.getTime());
		System.out.println("************************************************");		
	}

}
