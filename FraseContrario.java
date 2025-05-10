
package frasecontrario;
import java.util.Scanner;


public class FraseContrario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a frase: ");
        String frase = ler.nextLine();
        
        Inverso pilha = new Inverso();
        String resultado = "";
        
        for(int i=0; i < frase.length(); i++){
            char c = frase.charAt(i);
        
        if(c != ' '){
            pilha.Empilhar(String.valueOf(c));
        } else{
            while (!pilha.estaVazia()){
                resultado += pilha.Desempilhar();
            }
            resultado += " ";    
        }
        }
        while (!pilha.estaVazia()){
                resultado += pilha.Desempilhar();
        }
        
        System.out.println("Frase invertida:");
        System.out.println(resultado);
           
    }
}
