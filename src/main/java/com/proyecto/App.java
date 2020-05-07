package com.proyecto;

import com.proyecto.model.Persona;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Alex");
        persona.setEdad(18);

        System.out.println("Persona: " + persona.getId()
                + " " + persona.getNombre() + " " + persona.getEdad());
    }
}
