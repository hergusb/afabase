package ar.hergus.pruebajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping(path="/afabase")
public class AfaBaseController {

    @Autowired JugadoresRepository jugadoresRepository;
    @Autowired PuestosRepository puestosRepository;

    @GetMapping(path="/jugador")
    public @ResponseBody Optional<Jugadores> getJugador(Long id) {
        return jugadoresRepository.findById(id);
    }

    @GetMapping(path="/puestos")
    public @ResponseBody Iterable<Puestos> getAllPuestos() {
        return puestosRepository.findAll();
    }
}
