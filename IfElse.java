import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.printf ("Digite a sua nota\n");
        int nota = leitor.nextInt();
        if (nota >= 6){
            System.out.printf("A nota %d lhe garante aprovacao", nota);            
        }
        else{
            System.out.printf(
                "Com %d voce reprova, infelizmente\n", 
                nota
            );
        }
        leitor.close();
    }
}
