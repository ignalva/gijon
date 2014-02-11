package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Bomberos extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.bombero_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.bombero_icon;
	}

	@Override
	public int getString() {
		return R.string.Bomberos;
	}

}
