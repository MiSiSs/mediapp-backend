package com.mitocode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Menu;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IMenuRepo;
import com.mitocode.service.IMenuService;

@Service
public class MenuServiceImpl extends CRUDimpl<Menu, Integer> implements IMenuService{

	@Autowired
	private IMenuRepo repo;
	
	@Override
	public List<Menu> listarMenuPorUsuario(String nombre) {
		return repo.listarMenuPorUsuario(nombre);
	}

	@Override
	protected IGenericRepo<Menu, Integer> getRepo() {
		return repo;
	}
	
}
