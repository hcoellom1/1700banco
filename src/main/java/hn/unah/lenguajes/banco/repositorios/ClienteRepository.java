package hn.unah.lenguajes.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.banco.modelos.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, String>{
        
}
