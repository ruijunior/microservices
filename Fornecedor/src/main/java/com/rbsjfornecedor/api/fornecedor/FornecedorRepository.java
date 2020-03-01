package com.rbsjfornecedor.api.fornecedor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
	
	Fornecedor findByEstado(String estado);

}
