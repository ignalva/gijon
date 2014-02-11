package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AreaRecreativa;


public class AreaRecreativaParser extends DirectorioParser<AreaRecreativa> {

	public AreaRecreativaParser() {
		super("http://datos.gijon.es/doc/medio-ambiente/areas-recreativas.json");
	}

	@Override
	public AreaRecreativa newModel() {
		return new AreaRecreativa();
	}

}
