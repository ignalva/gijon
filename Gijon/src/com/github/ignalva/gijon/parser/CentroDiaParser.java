package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CentroDia;

public class CentroDiaParser extends DirectorioParser<CentroDia> {

	public CentroDiaParser() {
		super("http://datos.gijon.es/doc/sociedad-bienestar/centros-de-dia.json");
	}

	@Override
	public CentroDia newModel() {
		return new CentroDia();
	}

}
