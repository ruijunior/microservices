package com.rbsjfornecedor.api.fornecedor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	

	public Fornecedor getPorEstado(String estado) {
		return this.fornecedorRepository.findByEstado(estado);
	}

}
