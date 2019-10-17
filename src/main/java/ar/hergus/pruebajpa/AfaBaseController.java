package ar.hergus.pruebajpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/afabase")
public class AfaBaseController {

    @GetMapping(path="/jugadores")
    public @ResponseBody List<Jugadores> getJugadores(@RequestParam String apellido) {

        List<Jugadores> salida = null;

        if (apellido.isEmpty()) {
            // mensaje de error
        } else {
//            salida = jugadoresRepository.findByApellidoContains(apellido);
        }

        return salida;
    }

    @GetMapping(path="/jugadores/{id}")
    public @ResponseBody Optional<Jugadores> getJugador(@PathVariable Long id) {
//        return jugadoresRepository.findById(id);
        return null;
    }

    @GetMapping(path="/puestos")
    public @ResponseBody Iterable<Puestos> getAllPuestos() {

        ArrayList<Puestos> salida = new ArrayList<>();

        Puestos arquero = new Puestos();
        arquero.setCodPuesto("AR");
        arquero.setdescPuesto("Arquero");
        salida.add(arquero);
        Puestos delantero = new Puestos();
        delantero.setCodPuesto("DL");
        delantero.setdescPuesto("Delantero");
        salida.add(delantero);

        return salida;
    }
}
