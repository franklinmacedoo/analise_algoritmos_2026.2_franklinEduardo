

    // retorna o índice no vetor onde está o alvo, -1 caso não encontrado
def busca_linear(vetor, alvo_buscado):
    for i in range(len(vetor)):
        if vetor[i] == alvo_buscado:
            return i
    return -1

    // retorna o índice no vetor onde está o alvoBuscado, -1 caso não encontrado
def busca_binaria(vetor, alvo_buscado):
    esquerda, direita = 0, len(vetor) - 1
    while esquerda <= direita:
        meio = (esquerda + direita) // 2  # Divisão inteira
        if vetor[meio] == alvo_buscado:
            return meio
        elif vetor[meio] < alvo_buscado:
            esquerda = meio + 1
        else:
            direita = meio - 1
    return -1

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

