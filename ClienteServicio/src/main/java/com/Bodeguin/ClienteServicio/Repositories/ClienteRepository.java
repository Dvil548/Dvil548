package com.Bodeguin.ClienteServicio.Repositories;

import com.Bodeguin.ClienteServicio.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface ClienteRepository extends JpaRepository <Cliente,Long> {
}
