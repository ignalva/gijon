package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Llagar;

public class LlagarParser extends DirectorioParser<Llagar> {

	public LlagarParser() {
		super("http://datos.gijon.es/doc/turismo/llagares.json");
	}

	@Override
	public Llagar newModel() {
		return new Llagar();
	}

}
