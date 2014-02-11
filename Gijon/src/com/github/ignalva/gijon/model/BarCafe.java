package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class BarCafe extends Directorio{

	@Override
	public int getSmallIcon() {
		return R.drawable.coffee_cup_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.coffee_cup_icon;
	}

	@Override
	public int getString() {
		return R.string.BaresCafes;
	}

}
