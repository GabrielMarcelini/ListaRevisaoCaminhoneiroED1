/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadesrevisao2;

/**
 *
 * @author Gabriel
 */
public class FilaEstatica<T> {
    private T[] fila;
    private int frente;
    private int traseira;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public FilaEstatica(int capacidade) {
        fila = (T[]) new Object[capacidade];
        frente = 0;
        traseira = 0;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == fila.length;
    }

    public void enfileirar(T item) throws Exception {
        if (estaCheia()) {
            throw new Exception("A fila está cheia.");
        }
        fila[traseira] = item;
        traseira = (traseira + 1) % fila.length;
        tamanho++;
    }

    public T desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A fila está vazia.");
        }
        T item = fila[frente];
        frente = (frente + 1) % fila.length;
        tamanho--;
        return item;
    }

    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }
        int i = frente;
        for (int count = 0; count < tamanho; count++) {
            System.out.println(fila[i].toString());
            i = (i + 1) % fila.length;
        }
    }
}
