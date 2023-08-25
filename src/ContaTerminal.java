import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    //desenvolvendo o scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu primeiro nome");
            String nome = scanner.next();

            System.out.println("Digite seu segundo nome");
            String segundonome = scanner.next();

            System.out.println("digite seu numero");
            int numero = scanner.nextInt();

            System.out.println("Digite seu saldo atual");
            double saldo = scanner.nextDouble();

            System.out.println("Digite sua agencia");
            String Agencia = scanner.next();

            System.out.println("Olá "+ nome +" " + segundonome + ",obrigado por criar uma conta em nosso banco,sua agência é " + Agencia + ", conta " + numero + " seu saldo " + saldo + " já está disponível!a");
        
        
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuário
        //Obter os valores digitados  no terminal
        //Exibir a mensagem final da conta criada
    }
}
