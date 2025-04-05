import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite sua matrícula: ");
        long matriculaCliente = sc.nextLong();

        Cliente cliente = new Cliente(nomeCliente, matriculaCliente);

        Computador[] promocoes = new Computador[3];

                promocoes[0] = new Computador("Apple", matriculaCliente,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new SistemaOperacional("Linux Ubuntu", 32),
                new MemoriaUSB("Pen-drive", 16));

        promocoes[1] = new Computador("Samsung", matriculaCliente + 1234,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                },
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32));

        promocoes[2] = new Computador("Dell", matriculaCliente + 5678,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                },
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000));

        int opcao;
        do {
            System.out.println("\nEscolha uma promoção para comprar:");
            System.out.println("1 - Promoção Básica");
            System.out.println("2 - Promoção Intermediária");
            System.out.println("3 - Promoção Avançada");
            System.out.println("0 - Finalizar compra");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    Computador pcEscolhido = promocoes[opcao - 1];
                    pcEscolhido.mostraPC();
                    System.out.print("Deseja adicionar à sacola? (s/n): ");
                    sc.nextLine(); 
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("s")) {
                        cliente.comprar(pcEscolhido);
                    } else {
                        System.out.println("Computador não adicionado.");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        cliente.resumoCompra();
        sc.close();
    }
}
