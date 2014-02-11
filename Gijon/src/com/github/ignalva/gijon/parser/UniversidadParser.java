package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Universidad;

public class UniversidadParser extends DirectorioParser<Universidad> {

	public UniversidadParser() {
		super("http://datos.gijon.es/doc/educacion/universidad.json");
	}

	@Override
	public Universidad newModel() {
		return new Universidad();
	}

}
