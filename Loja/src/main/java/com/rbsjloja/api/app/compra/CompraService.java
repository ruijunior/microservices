package com.rbsjloja.api.app.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbsjloja.api.app.compra.client.FornecedorClient;

@Service
public class CompraService {
	
	@Autowired
	private FornecedorClient fornecedorClient;
	
	public void realizaCompra(CompraDTO compra) {
		this.fornecedorClient.getPorEstado(compra.getEndereco().getEstado());
	}

}
