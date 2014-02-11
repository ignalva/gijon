package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Mirador extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.mirador_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.mirador_icon;
	}

	@Override
	public int getString() {
		return R.string.Mirador;
	}

}
