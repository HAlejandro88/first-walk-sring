package mx.com.gm.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alejandro.soto
 */
@RestController
@Slf4j //para tarel la libreria de log
public class ControladoInicio {
    
    @GetMapping("/")
    public String inicio() { // Esto pata mapear la ruta inicial
        log.info("Ejecunatdo el controlador rest ");
        return "Hola mundo con spring 2";
    }
    
}
