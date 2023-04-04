package org.decorator;

public class MedicoGeral implements Medico {

    public float salario;

    public MedicoGeral() {

    }

    public MedicoGeral(float salario){ this.salario = salario;}

    public float getSalario(){ return  salario;}

    public String getDescricao(){
        return "Medico";
    }
}
