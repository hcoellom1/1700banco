package hn.unah.lenguajes.banco.modelos;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cuentas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {

    @Id
    @Column(name="idcuenta")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idCuenta;

    @Column(name="fechaapertura")
    private Date fechaApertura;
    
    @Column(name="montominimo")
    private double montoMinimo;

    private double saldo;

    @Column(name="tipocuenta")
    private char tipoCuenta;

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Clientes cliente;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Movimiento> movimientos;

}
