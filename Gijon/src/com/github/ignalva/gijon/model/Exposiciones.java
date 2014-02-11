package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Exposiciones extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.exposiciones_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.exposiciones_icon;
	}

	@Override
	public int getString() {
		return R.string.Exposiciones;
	}

}
