package challenges;

import java.util.*;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê a quantidade de logs a serem analisados
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        // Cria um mapa para armazenar a quantidade de eventos por serviço
        Map<String, Long> eventosPorServico = new HashMap<>();
        
        // Loop para ler os logs e contar os eventos por serviço
        for (int i = 0; i < quantidadeLogs; i++) {
            // Lê uma linha de log e divide em partes usando a vírgula como separador
            String[] parts = scanner.nextLine().split(",");
            // Obtém o nome do serviço a partir da segunda parte da linha
            String servico = parts[1];
            
            // Adiciona o serviço ao mapa, incrementando a quantidade de eventos ou definindo como 1 se ainda não existir
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
        }

        // Encontra o serviço com a maior quantidade de eventos usando Collections.max()
        String servicoMaiorQuantidade = Collections.max(eventosPorServico.entrySet(), Map.Entry.comparingByValue()).getKey();
        // Encontra o serviço com a menor quantidade de eventos usando Collections.min()
        String servicoMenorQuantidade = Collections.min(eventosPorServico.entrySet(), Map.Entry.comparingByValue()).getKey();

        // Imprime os resultados da análise
        System.out.println("Eventos por servico:");
        // Itera sobre o mapa e imprime o nome do serviço e a quantidade de eventos
        eventosPorServico.forEach((servico, quantidade) -> System.out.println(servico + ":" + quantidade));

        // Imprime o serviço com a maior quantidade de eventos
        System.out.println("Maior:" + servicoMaiorQuantidade);
        // Imprime o serviço com a menor quantidade de eventos
        System.out.println("Menor:" + servicoMenorQuantidade);
    }
}


