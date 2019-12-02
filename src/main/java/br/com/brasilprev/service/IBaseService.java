package br.com.brasilprev.service;

import java.util.List;

import br.com.brasilprev.model.IBaseModel;

public interface IBaseService<T extends IBaseModel> {
	
	List<T> listar();
	
	T incluir(T entity);
    
	T alterar(T entity);
    
	T obter(Long id);
    
}
