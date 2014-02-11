package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Biblioteca extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.library_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.library_icon;
	}

	@Override
	public int getString() {
		return R.string.Bibliotecas;
	}

}
