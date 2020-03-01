package com.rbsjloja.api.app.compra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rbsjloja.api.app.info.InfoFornecedorDTO;
 


@FeignClient("fornecedor")
public interface FornecedorClient {

	@GetMapping("/fornecedores/info/{estado}")
	InfoFornecedorDTO getPorEstado(@PathVariable String estado);
	
}
