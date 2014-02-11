package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CasaAldea;

public class CasaAldeaParser extends DirectorioParser<CasaAldea> {

	public CasaAldeaParser() {
		super("http://datos.gijon.es/doc/turismo/casas-aldea.json");
	}

	@Override
	public CasaAldea newModel() {
		return new CasaAldea();
	}

}
