package dio.expertostech.tutorial.microservico.kafka.repository;

import dio.expertostech.tutorial.microservico.kafka.data.PedidoData;

public interface h2Repository {

    void gravarProdutos(PedidoData listaProduto);
}
