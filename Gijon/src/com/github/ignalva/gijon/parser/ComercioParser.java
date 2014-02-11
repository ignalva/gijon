package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Comercio;

public class ComercioParser extends DirectorioParser<Comercio> {

	public ComercioParser() {
		super("http://datos.gijon.es/doc/turismo/comercios.json");
	}

	@Override
	public Comercio newModel() {
		return new Comercio();
	}

}
