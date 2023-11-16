package hn.unah.lenguajes.banco.modelos;

import java.util.Date;
import java.util.List;


import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clientes {

    @Id
    @Column(name="dni")
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

    @Column(name="fechaingreso")
    private Date fechaIngreso; 

    @OneToOne(mappedBy = "cliente",  cascade =  CascadeType.ALL)    
    private Direcciones direccion;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cuenta> cuentas;
     
}
