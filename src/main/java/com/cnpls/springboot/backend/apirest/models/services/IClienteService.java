package com.cnpls.springboot.backend.apirest.models.services;

import java.util.List;

import com.cnpls.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente Save(Cliente cliente);
	
	public void delete(Long id);

}
