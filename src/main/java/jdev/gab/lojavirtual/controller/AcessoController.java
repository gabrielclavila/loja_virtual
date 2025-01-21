package jdev.gab.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jdev.gab.lojavirtual.model.Acesso;
import jdev.gab.lojavirtual.service.AcessoService;

@Controller
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;

	@PostMapping("/salvarAcesso")
	public Acesso salvarAcesso(Acesso acesso) {
		return acessoService.save(acesso);
	}
}
