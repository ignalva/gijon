package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Lectura extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.books_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.books_icon;
	}

	@Override
	public int getString() {
		return R.string.Lectura;
	}

}
