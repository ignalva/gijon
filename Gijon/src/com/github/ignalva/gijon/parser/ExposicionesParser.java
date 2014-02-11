package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Exposiciones;

public class ExposicionesParser extends DirectorioParser<Exposiciones> {

	public ExposicionesParser() {
		super("http://datos.gijon.es/doc/cultura-ocio/sala-exposiciones.json");
	}

	@Override
	public Exposiciones newModel() {
		return new Exposiciones();
	}

}
