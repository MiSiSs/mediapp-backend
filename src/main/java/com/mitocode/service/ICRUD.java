package com.mitocode.service;

import java.util.List;


public interface ICRUD<T, ID> {
	T registrar(T enti) throws Exception;
	T modificar(T enti) throws Exception;
	List<T>listar() throws Exception;
	T listarPorId(ID id) throws Exception;
	void eliminar(ID id) throws Exception;
}
