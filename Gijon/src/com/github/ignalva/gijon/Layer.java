package com.github.ignalva.gijon;

import java.util.Iterator;
import java.util.List;

import android.os.AsyncTask;
import android.util.Log;

import com.github.ignalva.gijon.model.Model;
import com.github.ignalva.gijon.parser.Parser;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Layer<T extends Model> extends AsyncTask<Void,Void,Void>{

	private GoogleMap map;
	private List<T> list;
	private Parser<T> parser;
	
	public Layer(GoogleMap map, Parser<T> parser){
		this.map=map;
		this.parser=parser;
		execute();
	}
	
	public Parser<T> getParser() {
		return parser;
	}

	public void paint(){
		try{
			Iterator<T> iter = list.iterator();
			
			while (iter.hasNext()){
				T model = iter.next();
				
				MainActivity.ModelMarkers.put(map.addMarker(new MarkerOptions()
		        .position(new LatLng(model.getLatitud(), model.getLongitud()))
		        .icon(BitmapDescriptorFactory.fromResource((model.getSmallIcon())))), model);
			}		
		} 
		catch (Exception e) {
			Log.e(getClass()+".paint", e.toString(),e);
		}
	}
	
	@Override
	protected void onPostExecute(Void result) {
		super.onPostExecute(result);
		//Actualizar contador ...
		//paint();
	}

	@Override
	protected Void doInBackground(Void... params) {
		try {
			list=parser.parse();
		} catch (Exception e) {
			Log.e(getClass()+".doInBackground", e.toString(),e);
		}
		return null;
	}
	
}
