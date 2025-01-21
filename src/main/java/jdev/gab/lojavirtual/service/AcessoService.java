package jdev.gab.lojavirtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdev.gab.lojavirtual.model.Acesso;
import jdev.gab.lojavirtual.repository.AcessoRepository;

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;
	
	/* Reescrevendo o método Save do Repository que é uma Interface
	 * Permite fazer validações antes de Salvar
	 */
	public Acesso save(Acesso acesso) {
		return acessoRepository.save(acesso);
	}
}
