package dio.expertostech.tutorial.rest.kafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;
}
