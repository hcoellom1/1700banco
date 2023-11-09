package hn.unah.lenguajes.banco.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="movimientos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento {

    @Id
    @Column(name="idmovimiento")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMovimiento;

    @Column(name="fechamovimiento")
    private Date fechaMovimiento;

    private double monto;

    @Column(name="tipomovimiento")
    private char tipoMovimiento;

    @ManyToOne
    private Cuenta cuenta;
    
}
