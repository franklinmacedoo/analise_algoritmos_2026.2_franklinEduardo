

    // retorna o índice no vetor onde está o alvo, -1 caso não encontrado
    public static int buscaLinear(int[] vetor, int alvoBuscado) {
        return -1;
    }

    // retorna o índice no vetor onde está o alvoBuscado, -1 caso não encontrado
    public static int buscaBinaria(int[] vetor, int alvoBuscado) {
        return -1;
    }

if __name__ == "__main__":
    tamanho = 1000000
    vetor = [i * 2 for i in range(tamanho)]  # O vetor só tem números pares e já está ordenado
    alvo_buscado = 999998

        // Medindo o tempo da busca linear
        long inicioBuscaLinear = System.nanoTime();
        int posicaoBuscaLinear = buscaLinear(vetor, alvoBuscado);
        long tempoBuscaLinear = System.nanoTime() - inicioBuscaLinear;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria = System.nanoTime();
        int posicaoBuscaBinaria = buscaBinaria(vetor, alvoBuscado);
        long tempoBuscaBinaria = System.nanoTime() - inicioBuscaBinaria;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos\n", posicaoBuscaLinear, tempoBuscaLinear);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos\n", posicaoBuscaBinaria, tempoBuscaBinaria);
    }

