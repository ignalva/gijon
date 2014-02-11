package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Casino;

public class CasinoParser extends DirectorioParser<Casino> {

	public CasinoParser() {
		super("http://datos.gijon.es/doc/turismo/casinos.json");
	}

	@Override
	public Casino newModel() {
		return new Casino();
	}

}
