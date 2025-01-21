package jdev.gab.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jdev.gab.lojavirtual.controller.AcessoController;
import jdev.gab.lojavirtual.model.Acesso;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests {

	
	@Autowired
	private AcessoController acessoController;
	
	@Test
	public void testCadastrarAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		acessoController.salvarAcesso(acesso);
	}

}
