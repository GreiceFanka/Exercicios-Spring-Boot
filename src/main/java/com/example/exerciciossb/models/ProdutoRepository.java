package com.example.exerciciossb.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer>{
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
