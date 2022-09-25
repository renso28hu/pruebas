package ep1_inapp.personas.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Persona {
    Integer id;
    String nombre;
    String apellido;
    String dni;
    String curso;
}
