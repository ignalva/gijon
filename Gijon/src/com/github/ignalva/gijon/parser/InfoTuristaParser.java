package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.InfoTurista;

public class InfoTuristaParser extends DirectorioParser<InfoTurista> {

	public InfoTuristaParser() {
		super("http://datos.gijon.es/doc/turismo/puntos-inf-turistica.json");
	}

	@Override
	public InfoTurista newModel() {
		return new InfoTurista();
	}

}
