package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.AseoPublico;

public class AseoPublicoParser extends DirectorioParser<AseoPublico> {

	public AseoPublicoParser() {
		super("http://datos.gijon.es/doc/turismo/aseos-publicos.json");
	}

	@Override
	public AseoPublico newModel() {
		return new AseoPublico();
	}

}
