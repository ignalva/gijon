package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.EdificioTuristico;


public class EdificioTuristicoParser extends DirectorioParser<EdificioTuristico> {

	public EdificioTuristicoParser() {
		super("http://datos.gijon.es/doc/turismo/apartamento-turistico.json");
	}

	@Override
	public EdificioTuristico newModel() {
		return new EdificioTuristico();
	}

}
