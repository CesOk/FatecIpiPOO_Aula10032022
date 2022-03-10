import java.util.Scanner;
public class IfSimples{
    public static void main(String[] args){
        //variável referência
        Scanner leitor;
        //isso constrói um objeto do tipo Scanner
        //new é semelhanteao malloc da linguagem C
        //temos em funcionamento o Garbage Collector
        leitor = new Scanner(System.in);
        double nota;
        System.out.println("Digite sua nota");
        nota = leitor.nextDouble();
        if (nota >= 6){
            System.out.println("Parabens");
            System.out.println("Aprovado");
        }
        leitor.close();
    }
}