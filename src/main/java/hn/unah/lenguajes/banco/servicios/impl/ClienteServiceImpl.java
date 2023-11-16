package hn.unah.lenguajes.banco.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.banco.modelos.Clientes;
import hn.unah.lenguajes.banco.repositorios.ClienteRepository;
import hn.unah.lenguajes.banco.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Clientes guardarCliente(Clientes cliente) {
        // TODO Auto-generated method stub
        return clienteRepository.save(cliente);
        
    }

    @Override
    public String eliminarCliente(String id) {
        Clientes cteEliminar = this.clienteRepository.findById(id).get();

        if(cteEliminar != null){
            this.clienteRepository.delete(cteEliminar);
            return "Cliente eliminado " + cteEliminar.getDni();
        }

        return "No hay cliente que eliminar";
    }


    @Override
    public List<Clientes> obtenerTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public boolean validarTipoCuenta(char tipoCuenta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarTipoCuenta'");
    }

    @Override
    public String actualizarCliente(String dni, Clientes cliente) {
        Clientes cteActualizar = this.clienteRepository.findById(dni).get();

        if(cteActualizar != null){
            cteActualizar.setCorreo(cliente.getCorreo());
            cteActualizar.setTelefono(cliente.getTelefono());
            this.clienteRepository.save(cteActualizar);
            return "Cliente actualizado: " + cteActualizar.getDni();
        }

        return "Cliente no existe";
    }
    
}
