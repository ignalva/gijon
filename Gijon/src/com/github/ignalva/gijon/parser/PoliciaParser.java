package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Policia;

public class PoliciaParser extends DirectorioParser<Policia> {

	public PoliciaParser() {
		super("http://datos.gijon.es/doc/informacion/seguridad.json");
	}

	@Override
	public Policia newModel() {
		return new Policia();
	}

}
