package hn.unah.lenguajes.banco.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {

    @Column(name="dni")
    private String dni;
    
}
