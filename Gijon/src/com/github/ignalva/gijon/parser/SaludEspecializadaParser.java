package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.SaludEspecializada;

public class SaludEspecializadaParser extends DirectorioParser<SaludEspecializada> {

	public SaludEspecializadaParser() {
		super("http://datos.gijon.es/doc/salud/centrossaludespecializada.json");
	}

	@Override
	public SaludEspecializada newModel() {
		return new SaludEspecializada();
	}

}
