package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Ludoteca extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.package_toys_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.package_toys_icon;
	}

	@Override
	public int getString() {
		return R.string.Ludotecas;
	}

}
