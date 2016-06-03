package com.algaworks.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.erp.model.Empresa;
import com.algaworks.erp.repository.Empresas;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6937194987462157173L;

	@Inject
	private Empresas empresas;

	private List<Empresa> lstEmpresa;

	public void consultar(){
		lstEmpresa = empresas.todas();
	}

	public List<Empresa> getLstEmpresa() {
		return lstEmpresa;
	}
}
