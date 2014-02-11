package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Bomberos;

public class BomberosParser extends DirectorioParser<Bomberos> {

	public BomberosParser() {
		super("http://datos.gijon.es/doc/seguridad/bomberos.json");
	}

	@Override
	public Bomberos newModel() {
		return new Bomberos();
	}

}
