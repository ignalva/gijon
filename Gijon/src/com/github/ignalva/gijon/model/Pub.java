package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Pub extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.pub_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.pub_icon;
	}

	@Override
	public int getString() {
		return R.string.Pub;
	}

}
