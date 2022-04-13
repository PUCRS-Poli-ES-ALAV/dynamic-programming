package br.pucrs.proggulos;

import java.util.ArrayList;
import java.util.Collections;

import br.pucrs.util.ContagemRes;

public class Change {
	public ContagemRes calcChange(ArrayList<Long> lstMoedas, long valor){
		ContagemRes resCont = new ContagemRes();
		ArrayList<Long> resMoedas = new ArrayList<>();

		resCont.setIteracoes(0);
		resCont.setInstrucoes(0);
		resMoedas = calcChange(lstMoedas, valor, resCont);

		int i = 0;
		long [] resMoedasArr = new long[resMoedas.size()];	
		for(Long l: resMoedas)
			resMoedasArr[i++] = l;
		resCont.setResult(resMoedasArr);

		return resCont;
	}

	private ArrayList<Long> calcChange(ArrayList<Long> lstMoedas, long valor, ContagemRes contRes) {
		ArrayList<Long> res = new ArrayList<>();
		ArrayList<Long> lstMoedasClone = ((ArrayList<Long>) lstMoedas.clone());
		int posMoedas = 0;
		long nValor = valor;
		Collections.sort(lstMoedasClone, Collections.reverseOrder());

		contRes.incrInstrucoes(15);
		while (nValor > 0 && posMoedas < lstMoedasClone.size()) {
			contRes.incrIteracoes(1);
			contRes.incrInstrucoes(4);
			if (nValor - lstMoedasClone.get(posMoedas) >= 0) {
				contRes.incrInstrucoes(8);
				res.add(lstMoedasClone.get(posMoedas));
				nValor = nValor - lstMoedasClone.get(posMoedas);
			} else {
				contRes.incrInstrucoes(2);
				posMoedas++;
			}
			contRes.incrInstrucoes(5);
		}

		contRes.incrInstrucoes(3);
		if (posMoedas == lstMoedasClone.size()) {
			contRes.incrInstrucoes(2);
			throw new RuntimeException("Não é possível dar troco para o valor informado: " + valor);
		}

		return res;
	}
}
