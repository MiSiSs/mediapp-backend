package com.mitocode.service;

import java.util.List;

import com.mitocode.dto.ConsultaExamenDTO;
import com.mitocode.dto.ConsultaResumenDTO;
import com.mitocode.dto.FiltroConsultaDTO;
import com.mitocode.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta, Integer>{
	Consulta registrarTransaccional(ConsultaExamenDTO dto) throws Exception;
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);
	
	List<Consulta> buscarFecha(FiltroConsultaDTO filtro);
	
	List<ConsultaResumenDTO> listarResumen();
	
	byte[] generarReporte();
}
