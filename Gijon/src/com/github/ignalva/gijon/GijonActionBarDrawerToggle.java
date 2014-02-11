package com.github.ignalva.gijon;

import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class GijonActionBarDrawerToggle extends ActionBarDrawerToggle {

	private ActionBarActivity activity;
	
	public GijonActionBarDrawerToggle(ActionBarActivity activity,
			DrawerLayout drawerLayout, int drawerImageRes,
			int openDrawerContentDescRes, int closeDrawerContentDescRes) {
		super(activity, drawerLayout, drawerImageRes, openDrawerContentDescRes,
				closeDrawerContentDescRes);
		this.activity=activity;
	}

	@Override
	public void onDrawerClosed(View drawerView) {
		activity.supportInvalidateOptionsMenu();
	}

	@Override
	public void onDrawerOpened(View drawerView) {
		activity.supportInvalidateOptionsMenu();
	}

}
