package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Cine extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.cine_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.cine_icon;
	}

	@Override
	public int getString() {
		return R.string.Cine;
	}

}
