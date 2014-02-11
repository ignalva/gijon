package com.github.ignalva.gijon.parser;

import com.github.ignalva.gijon.model.Banco;

public class BancosParser extends DirectorioParser<Banco>{
	
	public BancosParser(){
		super("http://datos.gijon.es/doc/informacion/bancos-cajeros.json");
	}

	@Override
	public Banco newModel() {
		return new Banco();
	}
	

}
