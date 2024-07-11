/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesrevisao2;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaEstatica<Caminhoneiro> filaCaminhoneiros = new FilaEstatica<>(10);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar novo caminhoneiro");
            System.out.println("2. Atender caminhoneiro");
            System.out.println("3. Exibir fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            try {
                switch (opcao) {
                    case 1:
                        if (filaCaminhoneiros.estaCheia()) {
                            System.out.println("A fila está cheia. Não é possível cadastrar mais caminhoneiros.");
                        } else {
                            System.out.print("Nome: ");
                            String nome = scanner.nextLine();
                            System.out.print("Placa: ");
                            String placa = scanner.nextLine();
                            System.out.print("Horário de Chegada: ");
                            String horarioChegada = scanner.nextLine();
                            Caminhoneiro caminhoneiro = new Caminhoneiro(nome, placa, horarioChegada);
                            filaCaminhoneiros.enfileirar(caminhoneiro);
                            System.out.println("Caminhoneiro cadastrado com sucesso.");
                        }
                        break;

                    case 2:
                        if (filaCaminhoneiros.estaVazia()) {
                            System.out.println("A fila está vazia. Não há caminhoneiros para atender.");
                        } else {
                            Caminhoneiro atendido = filaCaminhoneiros.desenfileirar();
                            System.out.println("Caminhoneiro atendido: " + atendido.toString());
                        }
                        break;

                    case 3:
                        filaCaminhoneiros.exibirFila();
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

