package net.itinajero.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import net.itinajero.model.Solicitud;

public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

	

}
