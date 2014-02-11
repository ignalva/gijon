package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AsociacionVecinos;

public class AsociacionVecinosParser extends DirectorioParser<AsociacionVecinos> {

	public AsociacionVecinosParser() {
		super("http://datos.gijon.es/doc/sector-publico/asociaciones-vecinos.json");
	}

	@Override
	public AsociacionVecinos newModel() {
		return new AsociacionVecinos();
	}

}
