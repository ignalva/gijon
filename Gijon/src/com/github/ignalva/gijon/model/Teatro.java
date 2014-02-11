package com.github.ignalva.gijon.model;

import com.github.ignalva.gijon.R;

public class Teatro extends Directorio {

	@Override
	public int getSmallIcon() {
		return R.drawable.teatro_icon_peque;
	}

	@Override
	public int getBigIcon() {
		return R.drawable.teatro_icon;
	}

	@Override
	public int getString() {
		return R.string.Teatro;
	}

}
