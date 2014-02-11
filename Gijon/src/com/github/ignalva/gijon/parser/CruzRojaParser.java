package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CruzRoja;

public class CruzRojaParser extends DirectorioParser<CruzRoja> {

	public CruzRojaParser() {
		super("http://datos.gijon.es/doc/salud/cruz-roja.json");
	}

	@Override
	public CruzRoja newModel() {
		return new CruzRoja();
	}

}
