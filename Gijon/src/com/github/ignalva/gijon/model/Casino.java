package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Casino extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.casino_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.casino_icon;
	}

	@Override
	public int getString() {
		return R.string.Casino;
	}

}
