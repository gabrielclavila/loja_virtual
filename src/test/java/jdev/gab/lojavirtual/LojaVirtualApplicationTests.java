package jdev.gab.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jdev.gab.lojavirtual.model.Acesso;
import jdev.gab.lojavirtual.repository.AcessoRepository;
import jdev.gab.lojavirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests {

	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	@Test
	public void testCadastrarAcesso() {
		
		Acesso acesso = new Acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		acessoRepository.save(acesso);
	}

}
