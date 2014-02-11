package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Camping extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.camping_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.camping_icon;
	}

	@Override
	public int getString() {
		return R.string.Camping;
	}

}
