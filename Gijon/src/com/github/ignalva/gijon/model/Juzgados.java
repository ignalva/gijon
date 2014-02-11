package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Juzgados extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.justice_balance_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.justice_balance_icon;
	}

	@Override
	public int getString() {
		return R.string.Juzgados;
	}

}
