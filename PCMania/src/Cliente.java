class Cliente {
    String nome;
    long matricula;
    Computador[] computadores = new Computador[3];
    int contador = 0;

    //construtor
    Cliente(String nome, long matricula) {
            this.nome = nome;
            this.matricula = matricula;
    }

    //limitador de compras (1 de cada)
    void comprar(Computador pc) {
        if (contador < computadores.length) {
            computadores[contador++] = pc;
        } else {
            System.out.println("Limite de compras atingido.");
        }
    }

    //exibe todos os itens adquiridos na compra
    void resumoCompra() {
        System.out.println("\nResumo da compra de " + nome + ":");
        float total = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("\nComputador " + (i + 1) + ":");
            computadores[i].mostraPC();
            total += computadores[i].preco;
        }
        System.out.printf("\nTotal da compra: R$%.2f\n", total);
    }
}


