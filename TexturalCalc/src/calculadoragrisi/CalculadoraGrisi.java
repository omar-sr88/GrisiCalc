
package calculadoragrisi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Omar S Ramalho
 *         Tecnólogo IFPB
 *         Bachalerando Computatção UFPB
 *         
 */
public class CalculadoraGrisi {

    public static ArrayList<ArrayList<Integer>> particoes = new ArrayList<ArrayList<Integer>>();

    //Receber - NUMERO DE INSTRUMENTOS
    //        - Complexidade
    public static ArrayList<TuplaMassaDistribuicao> complexidadeParaMassa(int numVozes, float complexidadeAlvo, float aprox) {

        particoes = new ArrayList<ArrayList<Integer>>();
        partition(numVozes);

        float massa;
        int perfectHit = 0;
        int indice;

        ArrayList<TuplaMassaDistribuicao> results = new ArrayList<TuplaMassaDistribuicao>();

        for (ArrayList<Integer> p : particoes) {

            massa = massaParaComplexidade(p);

            //Se o resultado esta dentro do erro esperado
            if ((massa >= (complexidadeAlvo - aprox)) && (massa <= (complexidadeAlvo + aprox))) {

                //Fazer adicao ordenada no array
                if (results.isEmpty()) {
                    results.add(new TuplaMassaDistribuicao(massa, p));
                    if (massa == complexidadeAlvo) {
                        perfectHit++;
                    }
                    continue;
                }

                indice = Math.min(perfectHit, results.size() - 1);

                //Preciso apenas analisar a distancia do 1o da fila par ao alvo
                if (Math.abs(complexidadeAlvo - results.get(indice).getMassa()) >= Math.abs(complexidadeAlvo - massa)) {
                    //se entrar a nova massa e mais proxiam da desejada                   

                    results.add(indice, new TuplaMassaDistribuicao(massa, p));
                    if (massa == complexidadeAlvo) {
                        perfectHit++;
                    }
                } else {
                    results.add(new TuplaMassaDistribuicao(massa, p));
                }
            }

        }

        return results;

    }

    public static float massaParaComplexidade(ArrayList<Integer> massa) {

        //Valor baseado no 1o (e maior) valor da massa)
        float baseCalculo;
        //Resto da massa em relação ao 1o valor
        int restanteDeMassa;
        // Valor da complexidade do restanteDeMassa
        float complexidadeRestante;
        //Fracao da complexidade pata cada unidade da massa
        float unidadeDeComplexidade;

        setUp(massa);
        int tamanhoMassa = massa.size();
        //tamanho da massa sem o valor da cabeca
        int tamanhoRestoDaMassa = tamanhoMassa - 1;

        if (massa.size() == 1) {
            return 0;
        }


        int head = massa.get(0);
        int second = massa.get(1);
        int total = total(massa);
        restanteDeMassa = total - head;

        baseCalculo = (float) restanteDeMassa / total + 0.00000002f;
        complexidadeRestante = 1 - baseCalculo;

        //Testando Caso A
        if (head < total / 2) {

            if (massa.size() == 2) {
                return baseCalculo;
            }

            //Achando Caso B
            //Caso do subgrupo
            if (second > 1) {

                //if massa.size == 2

                //Complexidade Total para caso Base ( X : 1, 1, 1, 1, 1)
                //Calculo do Caso B
                // total - head = 10 - 4 = 6 ---- 

                float complexidade = ((float) (total - head)) / (total - head + 1);

                float difComplexidade = complexidade - baseCalculo;
                float parcelaComplexidade = difComplexidade / restanteDeMassa;
                float result = 0;;
                for (int i = 1; i < massa.size(); i++) {
                    result += parcelaComplexidade / (float) massa.get(i);
                }

                //resultado de B é BASE + result
                return baseCalculo + result;

                /*if(second!=1)
                 return complexidade;
                 else{

                 return baseCalculo + calculaCasoC(complexidade-baseCalculo, restanteDeMassa, massa);

                 }
                 }

                 //Testar 2o valor da massa, como o array é ordenado, se for 1. cal-
                 //-cula-se como caso A, se não se transforma em caso C
                 if (second > 1){

                 //Calculo do restante da massa em complexidade 100%
                 //Ja adiciona a base e retorna
                 return baseCalculo + calculaCasoC(complexidadeRestante, restanteDeMassa, massa);

                 }*/

                //Calculo simples do CASO A           


            }
            return calculaCasoA(massa.size());
        } // CASO C
        else {
            // Achar complexidade do restante da massa
            //Exemplos 6 (1 1 1 1) ou 6 (2 1 1)
            //Encontrar a proporção do total que esse restante representa
            //Ambos os casos, eles são 40% da massa : restante/total
            //
            //multiplicar a complexidade com a proporção da massa
            //somar o resultado anterior ao baseCalculo
            return calculaCasoC(tamanhoRestoDaMassa, tamanhoMassa);
        
        }
        
        
        

    }

    public static void partition(int n) {
        ArrayList<Integer> nova = new ArrayList<Integer>();
        partition(n, n, nova);
    }

    public static void partition(int n, int max, ArrayList<Integer> parcial) {
        if (n == 0) {
            ArrayList<Integer> atual = new ArrayList<Integer>();
            for (int i = 0; i < parcial.size(); i++) {
                atual.add(parcial.get(i));
            }
            particoes.add(atual);
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            parcial.add(i);
            partition(n - i, i, parcial);
            parcial.remove(parcial.size() - 1);
        }
    }

    public static void inverter(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {

            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static int total(ArrayList<Integer> array) {

        int maior = 0;
        for (int i = 0; i < array.size(); i++) {
            maior += array.get(i);
        }

        return maior;
    }

    public static boolean setUp(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return false;
        }

        //Caso massa não venha organizada     
        Collections.sort(array);
        Collections.reverse(array);
        return true;
    }

    public static float calculaCasoA(int tamanho) {
        
        return ((tamanho-1)) / (float) tamanho;
        
        
    }

    public static float calculaCasoC(int tamanhoRestoDaMassa, int tamanhoMassa) {
        return (float) tamanhoRestoDaMassa / (float) tamanhoMassa;
    }
    
}
