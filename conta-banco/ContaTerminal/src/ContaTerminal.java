import java.util.Scanner;

    public class ContaTerminal {
        //TODO: conhecer e importar a classe scanner
        // exibir mensagem para usuario
        //obter pelo scanner os valores digitados
        //exibir mensagem de conat criada
    public static void main(String[] args) {
        
        double saldo = 237.48;
        
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt(); 
        
      
        System.out.print("Por favor, digite o número da Agência: ");
        scanner.nextLine();  
        String agencia = scanner.nextLine();  
        
        
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();  
       
       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                           + "sua agência é " + agencia + ", conta " + numero + " e seu saldo "
                           + saldo + " já está disponível para saque.");
        
        
        scanner.close();
    }
}

    

