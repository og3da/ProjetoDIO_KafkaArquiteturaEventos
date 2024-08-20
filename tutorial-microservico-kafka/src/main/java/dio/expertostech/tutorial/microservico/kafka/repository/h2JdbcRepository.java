package dio.expertostech.tutorial.microservico.kafka.repository;

import dio.expertostech.tutorial.microservico.kafka.data.PedidoData;
import dio.expertostech.tutorial.microservico.kafka.data.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class h2JdbcRepository implements h2Repository {

    private final JdbcTemplate jdbcTemplate;

    public h2JdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void gravarProdutos(PedidoData listaProduto) {

        String sql = "INSERT INTO Produtos (codigo, nomeProduto, valor) VALUES (?, ?, ?)";
        //jdbcTemplate.update(sql, codigo, nomeProduto, valor);
    }
}
