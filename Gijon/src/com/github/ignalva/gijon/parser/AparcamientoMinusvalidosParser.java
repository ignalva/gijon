package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AparcamientoMinusvalidos;

public class AparcamientoMinusvalidosParser extends DirectorioParser<AparcamientoMinusvalidos> {

	public AparcamientoMinusvalidosParser() {
		super("http://datos.gijon.es/doc/transporte/aparcamiento-minusvalidos.json");
	}

	@Override
	public AparcamientoMinusvalidos newModel() {
		return new AparcamientoMinusvalidos();
	}

}
