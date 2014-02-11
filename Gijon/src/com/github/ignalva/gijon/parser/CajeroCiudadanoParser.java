package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CajeroCiudadano;

public class CajeroCiudadanoParser extends DirectorioParser<CajeroCiudadano> {

	public CajeroCiudadanoParser() {
		super("http://datos.gijon.es/doc/informacion/cajeros.json");
	}

	@Override
	public CajeroCiudadano newModel() {
		return new CajeroCiudadano();
	}


}
