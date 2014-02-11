package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Asociacion;

public class AsociacionParser extends DirectorioParser<Asociacion> {

	public AsociacionParser() {
		super("http://datos.gijon.es/doc/sector-publico/asociaciones.json");
	}

	@Override
	public Asociacion newModel() {
		return new Asociacion();
	}

}
