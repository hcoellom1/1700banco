package hn.unah.lenguajes.banco.servicios;


import java.util.List;

import hn.unah.lenguajes.banco.modelos.Clientes;

public interface ClienteService {

    public Clientes guardarCliente(Clientes cliente);

    public String eliminarCliente(String id);

    public List<Clientes> obtenerTodos();

    public boolean validarTipoCuenta(char tipoCuenta);

    public String actualizarCliente(String dni, Clientes cliente );
    
    
}
