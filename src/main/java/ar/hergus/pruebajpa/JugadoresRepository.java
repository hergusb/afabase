package ar.hergus.pruebajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JugadoresRepository extends CrudRepository<Jugadores, Long> {

    List<Jugadores> findByApellidoContains(String apellido);

}
