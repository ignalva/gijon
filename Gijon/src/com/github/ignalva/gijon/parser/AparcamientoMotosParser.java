package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AparcamientoMotos;

public class AparcamientoMotosParser extends DirectorioParser<AparcamientoMotos> {

	public AparcamientoMotosParser() {
		super("http://datos.gijon.es/doc/transporte/aparcamiento-motos.json");
	}

	@Override
	public AparcamientoMotos newModel() {
		return new AparcamientoMotos();
	}


}
