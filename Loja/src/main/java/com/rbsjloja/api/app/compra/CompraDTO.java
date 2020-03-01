package com.rbsjloja.api.app.compra;

import java.util.List;

import lombok.Data;

@Data
public class CompraDTO {
	
	private List<ItemCompraDTO> itens;
	private EnderecoDTO endereco;

}
