package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.InfoTuristaAuto;

public class InfoTuristaAutoParser extends DirectorioParser<InfoTuristaAuto> {

	public InfoTuristaAutoParser() {
		super("http://datos.gijon.es/doc/turismo/puntos-info-automatica.json");
	}

	@Override
	public InfoTuristaAuto newModel() {
		return new InfoTuristaAuto();
	}

}
