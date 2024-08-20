package dio.expertostech.tutorial.rest.kafka.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistraEventoService {

    private KafkaTemplate<Object, Object> template;

    public <T> void adicionarEvento(String topico, T dados) {
        template.send(topico, dados);
    }
}
