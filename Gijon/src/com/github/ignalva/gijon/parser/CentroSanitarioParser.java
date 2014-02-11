package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.CentroSanitario;

public class CentroSanitarioParser extends DirectorioParser<CentroSanitario> {

	public CentroSanitarioParser() {
		super("http://datos.gijon.es/doc/salud/centros-sanitarios.json");
	}

	@Override
	public CentroSanitario newModel() {
		return new CentroSanitario();
	}


}
