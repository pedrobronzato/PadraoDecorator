package org.decorator;

public class Pediatra extends MedicoDecorator {

    public Pediatra(Medico medico) { super(medico); }

    public float getTotalSalario() { return  1000; }

    public String getDescricaoTipo(){
        return "Pediatra";
    }
}
