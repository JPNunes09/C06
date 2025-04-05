class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardwareBasicos;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB memoriaUSB;

    Computador(String marca, float preco, HardwareBasico[] hbs, SistemaOperacional so, MemoriaUSB usb) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasicos = hbs;
        this.sistemaOperacional = so;
        this.memoriaUSB = usb;
    }

    void mostraPC() {
        System.out.println("Marca: " + marca);
        System.out.printf("Preço: R$%.2f\n", preco);
        for (HardwareBasico hb : hardwareBasicos) {
            System.out.println(hb.nome + ": " + hb.capacidade);
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");
        System.out.println("Brinde: " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "Gb");
    }
}

