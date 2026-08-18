import time
import bisect
    # retorna o índice no vetor onde está o alvo, -1 caso não encontrado
def busca_linear(vetor, alvo_buscado):
  for i in range(len(vetor)):
    if vetor[i] == alvo_buscado:
      return i
  return -1

    # retorna o índice no vetor onde está o alvoBuscado, -1 caso não encontrado
def busca_binaria(vetor, alvo_buscado):
  idx = bisect.bisect_left(vetor, alvo_buscado)
  if idx < len(vetor) and vetor[idx] == alvo_buscado:
    return idx
  else:
    return -1
if __name__ == "__main__":
  tamanho = 1000000
  vetor = [i * 2 for i in range(tamanho)]
  alvo_buscado = 999998

        # Medindo o tempo da busca linear
  inicio_busca_linear = time.perf_counter_ns()
  posicao_busca_linear = busca_linear(vetor, alvo_buscado)
  tempo_busca_linear = time.perf_counter_ns() - inicio_busca_linear

        # Medindo o tempo da busca binária
  inicio_busca_binaria = time.perf_counter_ns()
  posicao_busca_binaria = busca_binaria(vetor, alvo_buscado)
  tempo_busca_binaria = time.perf_counter_ns() - inicio_busca_binaria

        # Exibindo os resultados
  tempo_busca_linear_ms = tempo_busca_linear / 1_000_000
  tempo_busca_binaria_ms = tempo_busca_binaria / 1_000_000

  print(f"Linear: índice {posicao_busca_linear}, tempo {tempo_busca_linear_ms:.3f} milissegundos")
  print(f"Binária: índice {posicao_busca_binaria}, tempo {tempo_busca_binaria_ms:.3f} milissegundos")
