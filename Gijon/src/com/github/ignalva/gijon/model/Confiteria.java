package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Confiteria extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.confiteria_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.confiteria_icon;
	}

	@Override
	public int getString() {
		return R.string.Confiteria;
	}

}
