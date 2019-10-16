package ar.hergus.pruebajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/afabase")
public class AfaBaseController {

    @Autowired JugadoresRepository jugadoresRepository;
    @Autowired PuestosRepository puestosRepository;

    @GetMapping(path="/jugadores")
    public @ResponseBody List<Jugadores> getJugadores(@RequestParam String apellido) {

        List<Jugadores> salida = null;

        if (apellido.isEmpty()) {
            // mensaje de error
        } else {
            salida = jugadoresRepository.findByApellidoContains(apellido);
        }

        return salida;
    }

    @GetMapping(path="/jugadores/{id}")
    public @ResponseBody Optional<Jugadores> getJugador(@PathVariable Long id) {
        return jugadoresRepository.findById(id);
    }

    @GetMapping(path="/puestos")
    public @ResponseBody Iterable<Puestos> getAllPuestos() {
        return puestosRepository.findAll();
    }
}
