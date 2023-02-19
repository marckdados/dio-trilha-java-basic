import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua conta: ");
        int numberAccount = sc.nextInt();
        System.out.println("Agora, digite o número da sua agência: ");
        String agency = sc.next();
        System.out.println("Agora, digite seu nome: ");
        String name = sc.next();
        System.out.println("Agora, digite seu saldo: ");
        double balance = sc.nextDouble();


        System.out.println("Olá "+ name +", obrigado por criar uma conta em nosso banco, sua agência é "+agency+", conta "+numberAccount+" e seu saldo "+balance+" já está disponível para saque");
        sc.close();
    }
}
