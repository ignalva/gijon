package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class TiendaGastro extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.tiendagastronomica_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.tiendagastronomica_icon;
	}

	@Override
	public int getString() {
		return R.string.TiendaGastro;
	}

}
