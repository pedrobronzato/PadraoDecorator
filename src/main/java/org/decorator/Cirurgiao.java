package org.decorator;

public class Cirurgiao extends MedicoDecorator {

    public Cirurgiao(Medico medico) { super(medico); }

    public float getTotalSalario() { return  4000; }

    public String getDescricaoTipo(){
        return "Cirurgião";
    }
}
