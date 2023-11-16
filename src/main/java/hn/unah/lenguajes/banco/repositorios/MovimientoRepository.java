package hn.unah.lenguajes.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.banco.modelos.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{
    
}
