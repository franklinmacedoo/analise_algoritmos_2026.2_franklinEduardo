import time
import bisect
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
    inicio_busca_linear = time.perf_counter_ns()
    posicao_busca_linear = busca_linear(vetor, alvo_buscado)
    tempo_busca_linear = time.perf_counter_ns() - inicio_busca_linear

        // Medindo o tempo da busca binária
    inicio_busca_binaria = time.perf_counter_ns()
    posicao_busca_binaria = busca_binaria(vetor, alvo_buscado)
    tempo_busca_binaria = time.perf_counter_ns() - inicio_busca_binaria

        // Exibindo os resultados
    print(f"Linear: índice {posicao_busca_linear}, tempo {tempo_busca_linear} nanosegundos")
    print(f"Binária: índice {posicao_busca_binaria}, tempo {tempo_busca_binaria} nanosegundos")
