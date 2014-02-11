package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AtencionCiudadana;

public class AtencionCiudadanaParser extends DirectorioParser<AtencionCiudadana> {

	public AtencionCiudadanaParser() {
		super("http://datos.gijon.es/doc/sector-publico/atencion-ciudadana.json");
	}

	@Override
	public AtencionCiudadana newModel() {
		return new AtencionCiudadana();
	}

}
