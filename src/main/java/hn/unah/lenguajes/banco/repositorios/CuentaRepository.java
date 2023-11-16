package hn.unah.lenguajes.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.banco.modelos.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
    
}
