package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Albergue extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.albergue_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.albergue_icon;
	}

	@Override
	public int getString() {
		return R.string.Albergue;
	}

}
