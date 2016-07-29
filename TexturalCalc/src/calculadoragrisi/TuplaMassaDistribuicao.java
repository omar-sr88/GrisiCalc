/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrisi;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author omar
 */
public class TuplaMassaDistribuicao {
    
    float massa;
    ArrayList<Integer> dist;
    
    public TuplaMassaDistribuicao(float massa, ArrayList<Integer> dist){
        this.massa = massa;
        this.dist = dist;
    }

    public float getMassa() {
        return massa;
    }

    public ArrayList<Integer> getDist() {
        return dist;
    }
    
    public String toString(){
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(3);
        df.setMaximumFractionDigits(3);
        
        String retorno = "Organização: " + dist.toString() + ". Massa: " +df.format(massa); 
        
        return retorno;
    }
    
    
    
}
