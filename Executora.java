package TrabalhoJava;

import java.util.Scanner;

public class Executora {

    public static void criarCarro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço do carro:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o número de portas do carro:");
        int numeroPortas = scanner.nextInt();
        System.out.println("O carro tem ar condicionado? (True/False):");
        boolean arCondicionado = scanner.nextBoolean();

        Carro carro = new Carro(marca, modelo, preco, numeroPortas, arCondicionado);

        System.out.println("\nCarro criado com sucesso!");
        System.out.println("Informações do carro:");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Preço: " + carro.getPreco());
        System.out.println("Numero de Portas:" + carro.getNumeroPortas());
        System.out.println("Possui Ar Condicionado:" + carro.getArCondicionado());
        carro.realizarAcao();
    }


    public static void criarMoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca da moto:");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo da moto:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço da moto:");
        double preco = scanner.nextDouble();
        System.out.println("A moto tem partida elétrica? (True/False):");
        boolean partidaEletrica = scanner.nextBoolean();

        Moto moto = new Moto(marca, modelo, preco, partidaEletrica);

        System.out.println("\nMoto criada com sucesso!");
        System.out.println("Informações da moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Preço: " + moto.getPreco());
        System.out.println("A moto tem partida elétrica:" + moto.getPartidaEletrica());
        moto.realizarAcao();
    }


    public static void criarCaminhao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do caminhão:");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do caminhão:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço do caminhão:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a capacidade de carga do caminhão:");
        double capacidadeCarga = scanner.nextDouble();

        Caminhao caminhao = new Caminhao(marca, modelo, preco, capacidadeCarga);

        System.out.println("\nCaminhão criado com sucesso!");
        System.out.println("Informações do caminhão:");
        System.out.println("Marca: " + caminhao.getMarca());
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Preço: " + caminhao.getPreco());
        System.out.println("Capacidade de Carga:" + caminhao.getCapacidadeCarga());
        caminhao.realizarAcao();
    }


    public static void criarOnibus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a marca do ônibus:");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo do ônibus:");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço do ônibus:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a capacidade de passageiros do ônibus:");
        int capacidadePassageiros = scanner.nextInt();

        Onibus onibus = new Onibus(marca, modelo, preco, capacidadePassageiros);

        System.out.println("\nÔnibus criado com sucesso!");
        System.out.println("Informações do ônibus:");
        System.out.println("Marca: " + onibus.getMarca());
        System.out.println("Modelo: " + onibus.getModelo());
        System.out.println("Preço: " + onibus.getPreco());
        System.out.println("Capacidade de Passageiros:" + onibus.getCapacidadePassageiros());
        onibus.realizarAcao();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento de Veículos!");

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar Carro");
            System.out.println("2. Criar Moto");
            System.out.println("3. Criar Caminhão");
            System.out.println("4. Criar Ônibus");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    criarCarro();
                    break;
                case 2:
                    criarMoto();
                    break;
                case 3:
                    criarCaminhao();
                    break;
                case 4:
                    criarOnibus();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}




