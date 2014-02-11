package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Teatro;

public class TeatroParser extends DirectorioParser<Teatro> {

	public TeatroParser() {
		super("http://datos.gijon.es/doc/cultura-ocio/teatro.json");
	}

	@Override
	public Teatro newModel() {
		return new Teatro();
	}

}
