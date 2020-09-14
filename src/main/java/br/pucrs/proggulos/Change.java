package br.pucrs.proggulos;

import java.util.ArrayList;
import java.util.Collections;

public class Change {
	public ArrayList<Integer> calcChange(ArrayList<Integer> lstMoedas, float valor) {
		ArrayList<Integer> res = new ArrayList<>();
		ArrayList<Integer> lstMoedasClone = ((ArrayList<Integer>)lstMoedas.clone()); 
		
		Collections.sort(lstMoedasClone, Collections.reverseOrder());
		
		
		
		return res;		
	}
}
