package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Playa extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.playa_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.playa_icon;
	}

	@Override
	public int getString() {
		return R.string.Playa;
	}

}
