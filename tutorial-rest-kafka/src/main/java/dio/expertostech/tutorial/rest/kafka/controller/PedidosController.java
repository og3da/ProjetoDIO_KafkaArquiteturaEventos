package dio.expertostech.tutorial.rest.kafka.controller;

import dio.expertostech.tutorial.rest.kafka.data.PedidoData;
import dio.expertostech.tutorial.rest.kafka.services.RegistraEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidosController {

    @Autowired
    RegistraEventoService registraEventoService;

    @PostMapping("/salvar-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PedidoData pedidoData) {

        registraEventoService.adicionarEvento("SalvarPedido", pedidoData);
        return ResponseEntity.ok("ok");
    }
}
