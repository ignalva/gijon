package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Farmacia extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.farmacia_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.farmacia_icon;
	}

	@Override
	public int getString() {
		return R.string.Farmacia;
	}

}
