import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta.");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome.");
        String sobrenome = scanner.next();
        
        System.out.println("Digite seu saldo.");
        float saldo = scanner.nextFloat();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        

    }
}
