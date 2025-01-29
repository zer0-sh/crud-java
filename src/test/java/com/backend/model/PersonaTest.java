package com.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    
    @Test
    public void testPersonaGettersAndSetters() {
        Estado estado = new Estado(null, "Cundinamarca"); // No tenemos condicion de no nulo en pais

        Persona persona = new Persona("Juan", "Pérez", 30, new Pais("Colombia"), estado);
        
        persona.setId(1L);  // Asignamos un ID
        persona.setNombre("Carlos");
        persona.setApellido("Gómez");
        persona.setEdad(25);
        
        // Verificamos que el ID se establece correctamente
        assertEquals(1L, persona.getId());
        
        // Verificamos que los demás atributos también se establecen correctamente
        assertEquals("Carlos", persona.getNombre());
        assertEquals("Gómez", persona.getApellido());
        assertEquals(25, persona.getEdad());
    }

}
