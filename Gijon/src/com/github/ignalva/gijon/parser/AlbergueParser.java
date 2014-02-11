package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Albergue;

public class AlbergueParser extends DirectorioParser<Albergue> {

	public AlbergueParser() {
		super("http://datos.gijon.es/doc/turismo/albergues.json");
	}

	@Override
	public Albergue newModel() {
		return new Albergue();
	}

}
