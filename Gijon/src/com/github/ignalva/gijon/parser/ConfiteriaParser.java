package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Confiteria;

public class ConfiteriaParser extends DirectorioParser<Confiteria> {

	public ConfiteriaParser() {
		super("http://datos.gijon.es/doc/turismo/confiterias.json");
	}

	@Override
	public Confiteria newModel() {
		return new Confiteria();
	}

}
