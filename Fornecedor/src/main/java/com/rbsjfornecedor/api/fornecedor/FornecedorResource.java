package com.rbsjfornecedor.api.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorResource {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping("/info/{estado}")
	public Fornecedor getPorEstado(@PathVariable String estado) {
		return this.fornecedorService.getPorEstado(estado);
	}

}
