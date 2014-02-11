package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AlquilerCoche;

public class AlquilerCocheParser extends DirectorioParser<AlquilerCoche> {

	public AlquilerCocheParser() {
		super("http://datos.gijon.es/doc/transporte/alquiler-coches.json");
	}

	@Override
	public AlquilerCoche newModel() {
		return new AlquilerCoche();
	}

}
