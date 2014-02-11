package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Comercio extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.comercio_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.comercio_icon;
	}

	@Override
	public int getString() {
		return R.string.Comercio;
	}

}
