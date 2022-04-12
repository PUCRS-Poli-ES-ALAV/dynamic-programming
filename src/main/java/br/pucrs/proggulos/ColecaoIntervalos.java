package br.pucrs.proggulos;

import br.pucrs.util.ContagemRes;

public class ColecaoIntervalos {
    public static class Intervalos {
        private int inicio;
        private int fim;

        public Intervalos(int inicio, int fim) {
            this.inicio = inicio;
            this.fim = fim;
        }

        public int getInicio() {
            return inicio;
        }

        public int getFim() {
            return fim;
        }

        public void setInicio(int inicio) {
            this.inicio = inicio;   
        }

        public void setFim(int fim) {
            this.fim = fim;
        }
    }

    public Intervalos[] escalonamentoIntervalos(Intervalos[] intervalos, ContagemRes resCont) {
        Intervalos[] aux = new Intervalos[intervalos.length], res;
        int qtd = 0;
        
        int i = 0;

        aux[0] = intervalos[0];
        qtd++;

        resCont.incrInstrucoes(9);
        for (int k = 1; k < intervalos.length; k++){
            resCont.incrIteracoes(1);
            resCont.incrInstrucoes(11);
            if (intervalos[k].getInicio() > intervalos[i].getFim()){
                resCont.incrInstrucoes(6);
                aux[qtd] = intervalos[k];
                qtd++;
                i = k;
            } 
        }

        resCont.incrInstrucoes(4);
        res = new Intervalos[qtd];
        for (int j = 0; j < qtd; j++){
            resCont.incrIteracoes(1);
            resCont.incrInstrucoes(6);
            res[j] = aux[j];
        }

        long [] resVet = new long[1];
        resVet[0] = -1;
        resCont.setResult(resVet);
        return res;
    }
}
