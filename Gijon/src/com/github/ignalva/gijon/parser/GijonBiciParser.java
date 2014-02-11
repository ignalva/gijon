package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.GijonBici;

public class GijonBiciParser extends DirectorioParser<GijonBici> {

	public GijonBiciParser() {
		super("http://datos.gijon.es/doc/transporte/gijonbici.json");
	}

	@Override
	public GijonBici newModel() {
		return new GijonBici();
	}

}
