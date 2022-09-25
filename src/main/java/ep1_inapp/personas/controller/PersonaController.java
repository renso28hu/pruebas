package ep1_inapp.personas.controller;

import ep1_inapp.personas.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll") //localhost:8080/persona/getAll

       public List<Persona> getPersona(){
        Persona persona = new Persona(1,"Eduardo","Gomez","dni","Matematica");
        Persona persona2 = new Persona(2,"Lisa","Martinez","dni","Ingles");
        Persona persona3 = new Persona(3,"Omar","Rios","dni","Historia");

        return List.of(persona,persona2,persona3);
    }
}

