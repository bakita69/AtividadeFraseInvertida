
package frasecontrario;
import java.util.Scanner;

public class Inverso {
    
    String elementos[] = new String[100];
    int topo;
    
    public Inverso(){
        this.topo = -1; 
    }
    
    public boolean estaVazia(){
        return topo == -1;
    }
    
    public boolean estaCheia(){
        return topo == 99;
    }
    
    public int Empilhar(String elementos){
        if (estaCheia()){
            System.out.println("A filha está cheia");
        } else {
            topo = topo + 1;
            this.elementos[topo] = elementos;
        }
        return this.topo;
    }
    
    public String Desempilhar(){
        if (estaVazia()){
            System.out.println("Erro de pilha");
            return "";
        } else{
            String removido = elementos[topo];
            topo = topo -1;
            return removido;
        }
    }
}
