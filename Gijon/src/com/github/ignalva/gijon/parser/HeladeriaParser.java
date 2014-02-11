package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Heladeria;

public class HeladeriaParser extends DirectorioParser<Heladeria> {

	public HeladeriaParser() {
		super("http://datos.gijon.es/doc/informacion/heladerias.json");
	}

	@Override
	public Heladeria newModel() {
		return new Heladeria();
	}

}
