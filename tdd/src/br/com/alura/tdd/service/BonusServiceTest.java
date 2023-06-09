package br.com.alura.tdd.service;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {
	
	@Test
    void bonusDeveriaSer0ParaSalarioAlto () {
        BonusService service = new BonusService();
        assertThrows (IllegalArgumentException.class, () -> service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000"))));
        
//        try {
//        	service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("25000")));
//        	fail("Não deu exception");
//		} catch (Exception e) {
//			
//		}
    }

    @Test
    void bonusDeveriaSer10PorcentoDoSalario () {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }
    
    @Test
    void bonusDeveriaSer10PorcentoParaSalarioDeExatos10000 () {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus (new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}