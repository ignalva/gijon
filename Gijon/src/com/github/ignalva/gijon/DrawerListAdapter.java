package com.github.ignalva.gijon;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerListAdapter extends BaseAdapter {

	private Context context;
    private ArrayList<Layer> drawerItems;
    
    public DrawerListAdapter(Context context, ArrayList<Layer> navDrawerItems){
        this.context = context;
        this.drawerItems = navDrawerItems;
    }
    
	@Override
	public int getCount() {
		return drawerItems.size();
	}

	@Override
	public Object getItem(int position) {
		return drawerItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		try{
			if (convertView == null) {
	            LayoutInflater mInflater = (LayoutInflater)
	                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
	            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
	        }
	          
	        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
	        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
	        TextView txtCount = (TextView) convertView.findViewById(R.id.counter);
	          
	        imgIcon.setImageResource(drawerItems.get(position).getParser().newModel().getSmallIcon());        
	        txtTitle.setText(context.getString(drawerItems.get(position).getParser().newModel().getString()));
	        txtCount.setText(String.valueOf(drawerItems.get(position).getParser().count()));
		} 
		catch (Exception e) {
			Log.e(getClass()+".getView", e.toString(),e);
		}
         
        return convertView;
	}

}
