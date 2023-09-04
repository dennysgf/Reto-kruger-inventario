package com.reto.inventario.util;

import com.reto.inventario.security.entity.Rol;
import com.reto.inventario.security.enums.RolNombre;
import com.reto.inventario.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    //desmarcar una vez ejecutado el programa
    @Override
    public void run(String... args) throws Exception {
       Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);
    }
}
