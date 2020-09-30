package br.sp.gov.portalweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.sp.gov.portalweb.dto.EscolaDto;

@Controller
@RequestMapping("escola")
public class EscolaController {
	@RequestMapping("/cadastro")
	public String cadastroEscola() {
		return "escola/formCadastroEscola";
	}
	
	@RequestMapping("/cadastroConfirmar")
	public String cadastroConfirmar(EscolaDto dto) {	
		System.out.println(dto.toString());
		return "escola/formCadastroEscola";
	}
}
