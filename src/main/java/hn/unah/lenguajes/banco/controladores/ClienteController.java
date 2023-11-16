package hn.unah.lenguajes.banco.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.banco.modelos.Clientes;
import hn.unah.lenguajes.banco.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/guardar")
    public Clientes guardarCliente(@RequestBody Clientes nvoCliente){
        if(nvoCliente.getDireccion() != null){
            nvoCliente.getDireccion().setCliente(nvoCliente);
        }
        return this.clienteServiceImpl.guardarCliente(nvoCliente);
    }

    @GetMapping("/todos")
    public List<Clientes> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodos();
    }
    

    @DeleteMapping("/eliminar/{dni}")
    public String eliminarCliente(@PathVariable(name="dni") String dni){
        return this.clienteServiceImpl.eliminarCliente(dni);
    }


    @PutMapping("/actualizar")
    public String actualizarCliente(@RequestParam(name="dni") String dni, 
                                    @RequestBody Clientes cliente){
        return this.clienteServiceImpl.actualizarCliente(dni, cliente);
    }
    
}
