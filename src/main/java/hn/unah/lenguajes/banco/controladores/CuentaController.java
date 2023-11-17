package hn.unah.lenguajes.banco.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.banco.modelos.Cuenta;
import hn.unah.lenguajes.banco.servicios.impl.CuentaServiceImpl;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {
    
    @Autowired
    private CuentaServiceImpl cuentaServiceImpl;

    @PostMapping("/add")
    public String agregarCuentaCliente(@RequestParam(name="dni") String dni,
                                       @RequestBody Cuenta cuenta){
        if(this.cuentaServiceImpl.agregarCuentaCliente(dni, cuenta) != null){
            return "Se ha agregado la cuenta al cliente: " + dni;
        }

        return "No existe el cliente";
    }

}
