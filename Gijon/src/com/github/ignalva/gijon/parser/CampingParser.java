package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Camping;

public class CampingParser extends DirectorioParser<Camping> {

	public CampingParser() {
		super("http://datos.gijon.es/doc/turismo/camping.json");
	}

	@Override
	public Camping newModel() {
		return new Camping();
	}

}
