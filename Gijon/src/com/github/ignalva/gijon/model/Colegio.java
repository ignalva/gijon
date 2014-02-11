package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Colegio extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.colegio_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.colegio_icon;
	}

	@Override
	public int getString() {
		return R.string.Colegio;
	}

}
