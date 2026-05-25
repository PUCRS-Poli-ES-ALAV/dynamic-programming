package br.pucrs.proggulos;

import br.pucrs.util.ContagemRes;
import java.util.Arrays;
import java.util.Comparator;

public class TestaColecaoIntervalos {

    public static ColecaoIntervalos.Intervalos[] escalona(ColecaoIntervalos.Intervalos[] intervalos, ContagemRes resCont) {
         Arrays.sort(intervalos, new Comparator<ColecaoIntervalos.Intervalos>() {
            @Override
            public int compare(ColecaoIntervalos.Intervalos o1, ColecaoIntervalos.Intervalos o2) {
                return o1.getFim() - o2.getFim();
            }
        });

        ColecaoIntervalos colecao = new ColecaoIntervalos();
        return colecao.escalonamentoIntervalos(intervalos, resCont);
    }
    public static void main(String[] args) {
        ColecaoIntervalos.Intervalos[] intervalos = new ColecaoIntervalos.Intervalos[11];
        intervalos[0] = new ColecaoIntervalos.Intervalos(4,8);
        intervalos[1] = new ColecaoIntervalos.Intervalos(6,7);
        intervalos[2] = new ColecaoIntervalos.Intervalos(13,14);
        intervalos[3] = new ColecaoIntervalos.Intervalos(4,5);
        intervalos[4] = new ColecaoIntervalos.Intervalos(2,4);
        intervalos[5] = new ColecaoIntervalos.Intervalos(6,9);
        intervalos[6] = new ColecaoIntervalos.Intervalos(7,10);
        intervalos[7] = new ColecaoIntervalos.Intervalos(9,11);
        intervalos[8] = new ColecaoIntervalos.Intervalos(1,6);
        intervalos[9] = new ColecaoIntervalos.Intervalos(3,13);
        intervalos[10] = new ColecaoIntervalos.Intervalos(9,12);

        ContagemRes resCont = new ContagemRes();
        ColecaoIntervalos.Intervalos[] res = escalona(intervalos, resCont);

        System.out.println("*****Teste 1");
        for (ColecaoIntervalos.Intervalos i : res) {
            System.out.println("[" + i.getInicio() + ", " + i.getFim() + "]");
        }


        intervalos = new ColecaoIntervalos.Intervalos[8];
        intervalos[0] = new ColecaoIntervalos.Intervalos(6,15);
        intervalos[1] = new ColecaoIntervalos.Intervalos(7,16);
        intervalos[2] = new ColecaoIntervalos.Intervalos(1,26);
        intervalos[3] = new ColecaoIntervalos.Intervalos(25,30);
        intervalos[4] = new ColecaoIntervalos.Intervalos(30,34);
        intervalos[5] = new ColecaoIntervalos.Intervalos(23,28);
        intervalos[6] = new ColecaoIntervalos.Intervalos(18,24);
        intervalos[7] = new ColecaoIntervalos.Intervalos(9,15);

        resCont = new ContagemRes();
        res = escalona(intervalos, resCont);

        System.out.println("*****Teste 2");
        for (ColecaoIntervalos.Intervalos i : res) {
            System.out.println("[" + i.getInicio() + ", " + i.getFim() + "]");
        }
    }
}
