import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeDeExcecao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o X: ");
            int x = sc.nextInt();

            System.out.println("Digite o valor de Y: ");
            int y = sc.nextInt();

            System.out.println("Resultado da divisão: "+ x / y);
            
        } catch (InputMismatchException e) {
            System.out.println("Formato inválido! \nDigite um valor inteiro.");

        }catch(ArithmeticException e){
            System.out.println("Não é possivel fazer essa divisão.");

        }finally{
            System.out.println("Sistema finalizado");
        }

    }
    
}