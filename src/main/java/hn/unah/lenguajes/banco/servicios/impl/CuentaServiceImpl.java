package hn.unah.lenguajes.banco.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.banco.modelos.Clientes;
import hn.unah.lenguajes.banco.modelos.Cuenta;
import hn.unah.lenguajes.banco.repositorios.ClienteRepository;
import hn.unah.lenguajes.banco.repositorios.CuentaRepository;
import hn.unah.lenguajes.banco.servicios.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService{

    @Autowired
    private CuentaRepository cuentaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Clientes agregarCuentaCliente(String dni, Cuenta cuenta) {
        Clientes cte = this.obtenerCliente(dni);
        if( cte != null){
            //cte.getCuentas().add(cuenta);
            cuenta.setCliente(cte);
            this.cuentaRepository.save(cuenta);            
        }

        return cte;
        
        
    }

    private Clientes obtenerCliente(String dni){
    //        Clientes cliente = this.clienteRepository.findById(dni).get();
        return this.clienteRepository.findById(dni).get();
    }
    
}
