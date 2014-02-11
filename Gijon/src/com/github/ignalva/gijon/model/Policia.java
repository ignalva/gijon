package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Policia extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.policia_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.policia_icon;
	}

	@Override
	public int getString() {
		return R.string.Policia;
	}

}
