package dio.expertostech.tutorial.microservico.kafka.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dio.expertostech.tutorial.microservico.kafka.data.PedidoData;
import dio.expertostech.tutorial.microservico.kafka.repository.h2Repository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SalvarPedidoService {

    private static final Logger logger = LoggerFactory.getLogger(SalvarPedidoService.class);

    @Autowired
    h2Repository repository;

    // nome do topico e container id
    @KafkaListener(topics = "SalvarPedido", groupId = "79e2ca26923c")
    public void executar(ConsumerRecord<String, String> record) {

        logger.info("Key = {}", record.key());
        logger.info("Value = {}", record.value());
        logger.info("Mensagem consumida: " + record);

        String dados = record.value();
        ObjectMapper mapper = new ObjectMapper();
        PedidoData pedido;

        try {
            pedido = mapper.readValue(dados, PedidoData.class);
        } catch (JsonProcessingException e) {
            logger.error("falha ao converter evento [dado={}]", dados, e);
            return;
        }

        logger.info("Evento recebido = {}", pedido);

        // TODO: gravar no banco
        // TODO: responder para a fila que o pedido foi salvo
        //repository.gravarProdutos(listaProduto);
    }
}
