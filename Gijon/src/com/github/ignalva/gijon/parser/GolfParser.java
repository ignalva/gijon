package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Golf;

public class GolfParser extends DirectorioParser<Golf> {

	public GolfParser() {
		super("http://datos.gijon.es/doc/deporte/campos-golf.json");
	}

	@Override
	public Golf newModel() {
		return new Golf();
	}

}
