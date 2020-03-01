package com.rbsjloja.api.app.compra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rbsjloja.api.app.info.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private RestTemplate client;
	
	private static final String URL_FORNECEDOR = "http://fornecedor/fornecedores/";
	
	public void realizaCompra(CompraDTO compra) {
		
		client.exchange(URL_FORNECEDOR.concat(compra.getEndereco().getEstado()), 
				HttpMethod.GET, null, InfoFornecedorDTO.class );
	}

}
