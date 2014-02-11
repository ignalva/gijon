package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CentroCultural;

public class CentroCulturalParser extends DirectorioParser<CentroCultural> {

	public CentroCulturalParser() {
		super("http://datos.gijon.es/doc/turismo/centros-culturales.json");
	}

	@Override
	public CentroCultural newModel() {
		return new CentroCultural();
	}

}
