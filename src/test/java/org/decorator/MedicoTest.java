package org.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    void deveRetornarSalarioMedicoGeral() {
        Medico medico = new MedicoGeral(1000);

        assertEquals(1000, medico.getSalario());
    }

    @Test
    void deveRetornarSalarioMedicoPediatra() {
        Medico medico = new Pediatra(new MedicoGeral(1000));

        assertEquals(2000, medico.getSalario());
    }

    @Test
    void deveRetornarSalarioMedicoCirurgiao() {
        Medico medico = new Cirurgiao(new MedicoGeral(1000));

        assertEquals(5000, medico.getSalario());
    }

    @Test
    void deveRetornarSalarioMedicoPediatraCirurgiao() {
        Medico medico = new Cirurgiao(new Pediatra(new MedicoGeral(1000)));

        assertEquals(6000, medico.getSalario());
    }

    @Test
    void deveRetornarDescricaoMedico() {
        Medico medico = new MedicoGeral();

        assertEquals("Medico", medico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoMedicoPediatra() {
        Medico medico = new Pediatra(new MedicoGeral());

        assertEquals("Medico/Pediatra", medico.getDescricao());
    }

    @Test
    void deveRetornarDescricaoMedicoPediatraCirurgiao() {
        Medico medico = new Cirurgiao(new Pediatra(new MedicoGeral()));

        assertEquals("Medico/Pediatra/Cirurgião", medico.getDescricao());
    }

}