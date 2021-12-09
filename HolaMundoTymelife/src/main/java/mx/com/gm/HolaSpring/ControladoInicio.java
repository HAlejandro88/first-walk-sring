package mx.com.gm.HolaSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.HolaSpring.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author alejandro.soto
 */
@Controller
@Slf4j //para tarel la libreria de log
public class ControladoInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")// Esto pata mapear la ruta inicial
    public String inicio(Model model) { // Model es pata conectar con tymeleaf 
        var mensaje = "Hola Mundo con tymeleaf";
        
        var persona = new Persona();
        persona.setNombre("Juan");;
        persona.setApellido("Perez");
        persona.setEmail("jperez@gmail.com");
        persona.setTelefono("554567890");
        
        var persona2 = new Persona();
        persona2.setNombre("Alejandro");;
        persona2.setApellido("Soto");
        persona2.setEmail("asoto@gmail.com");
        persona2.setTelefono("556789056");
        
        //forma 1
//        List<Persona> personas = new ArrayList();
//      Foma 2
//        var personas = new ArrayList();
//        personas.add(persona);
        

        //var personas = Arrays.asList(persona,persona2);
        var personas = new ArrayList();

        log.info("Ejecunatdo el controlador Spring MVC ");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
    
}
