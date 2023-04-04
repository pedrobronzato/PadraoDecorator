package org.decorator;

public abstract class MedicoDecorator implements Medico {
    private Medico medico;
    private String descricao;

    public MedicoDecorator(Medico medico) {
        this.medico = medico;
    }

    public Medico getMedico() { return medico;}

    public void setMedico(Medico medico) {
            this.medico = medico;
    }

    public abstract float getTotalSalario();

    public float getSalario(){
        return this.medico.getSalario() + getTotalSalario();
    }

    public abstract String getDescricaoTipo();

    public String getDescricao() {
        return  this.medico.getDescricao() + "/" + this.getDescricaoTipo();
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }



}
