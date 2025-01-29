package com.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EstadoTest {
    @Test
    public void testPaisGettersAndSetters() {
        Pais pais = new Pais("Colombia");  // Crear un pais con el constructor que solo asigna el nombre
        pais.setId(1L);  // Establecemos el ID para probar el setter

        // Verificamos que el ID se establece correctamente
        assertEquals(1L, pais.getId());

        // Verificamos que el nombre se establece correctamente
        assertEquals("Colombia", pais.getNombre());
    }
}
