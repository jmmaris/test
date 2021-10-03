package com.example.ProyectoIntegradorClinica.service.imp;

import com.example.ProyectoIntegradorClinica.dto.OdontologoDto;
import com.example.ProyectoIntegradorClinica.persistence.entities.Odontologo;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    OdontologoService odontologoService;

    private OdontologoDto odontologo;
    private OdontologoDto odontologoCreado;

    @BeforeEach
    void setUp() {
        odontologo = new OdontologoDto();
        odontologo.setNombre("Lisandro");
        odontologo.setApellido("Albornoz");
        odontologo.setMatricula("AAA999");

    }

    @Test
    void crear() {
        odontologoCreado = odontologoService.crear(odontologo);
        Assert.assertTrue(odontologoCreado.getId() != null);
    }

    /*@Test
    void buscar() {
        odontologoCreado = odontologoService.crear(odontologo);
        OdontologoDto odontologoEncontrado = odontologoService.buscar(1);
        Assert.assertTrue(odontologoEncontrado != null);
    } */

    @Test
    void actualizar() {
    }

    @Test
    void eliminar() {
    }

    @Test
    void consultarTodos() {
    }
}