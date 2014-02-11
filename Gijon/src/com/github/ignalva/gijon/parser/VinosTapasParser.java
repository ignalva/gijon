package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.VinosTapas;

public class VinosTapasParser extends DirectorioParser<VinosTapas> {

	public VinosTapasParser() {
		super("http://datos.gijon.es/doc/turismo/vinos-tapas.json");
	}

	@Override
	public VinosTapas newModel() {
		return new VinosTapas();
	}

}
