package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CocheElectrico;

public class CocheElectricoParser extends DirectorioParser<CocheElectrico> {

	public CocheElectricoParser() {
		super("http://datos.gijon.es/doc/transporte/puntosvehiculoselectricos.json");
	}

	@Override
	public CocheElectrico newModel() {
		return new CocheElectrico();
	}

}
