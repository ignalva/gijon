package com.github.ignalva.gijon;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.github.ignalva.gijon.model.Directorio;
import com.github.ignalva.gijon.R;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.model.Marker;

public class DirectorioInfoWindowAdapter implements InfoWindowAdapter {

	private View view;
	
	public DirectorioInfoWindowAdapter(View view){
		this.view=view;
	}
	
	@Override
	public View getInfoContents(Marker marker) {
		try{
			Directorio directorio = (Directorio) MainActivity.ModelMarkers.remove(marker);
			TextView title = (TextView) view.findViewById(R.id.textModelTitle);
			ImageView image = (ImageView) view.findViewById(R.id.imageModel);
			TableLayout table = (TableLayout) view.findViewById(R.id.tableModelDetails);
			
			image.setImageResource(directorio.getBigIcon());
			
			if (directorio.getUrl()!=null){
				title.setText(Html.fromHtml("<a href=\""+directorio.getUrl()+"\">"+html2String(directorio.getTitle())+"</a>"));
				title.setMovementMethod(LinkMovementMethod.getInstance());
			}
			else
				title.setText(html2String(directorio.getTitle()));
	       
			
			//Horario
			if (directorio.getHorario()!=null){
				TableRow horarioRow = new TableRow(table.getContext());
				TextView horarioValue = new TextView(horarioRow.getContext());
				horarioValue.setText(html2String(directorio.getHorario()));
				horarioValue.setTextAppearance(horarioRow.getContext(), android.R.style.TextAppearance_Small);
				horarioRow.addView(horarioValue);
				table.addView(horarioRow);
			}
			
			//Web 
			if (directorio.getWeb()!=null){
				TableRow webRow = new TableRow(table.getContext());
				TextView webValue = new TextView(webRow.getContext());
				webValue.setText(html2String(directorio.getWeb()));
				webValue.setTextAppearance(webRow.getContext(), android.R.style.TextAppearance_Small);
				Linkify.addLinks(webValue , Linkify.WEB_URLS);
				webRow.addView(webValue);
				table.addView(webRow);
			}
			
			//Email
			if (directorio.getEmail()!=null){
				TableRow emailRow = new TableRow(table.getContext());
				TextView emailValue = new TextView(emailRow.getContext());
				emailValue.setText(html2String(directorio.getEmail()));
				emailValue.setTextAppearance(emailRow.getContext(), android.R.style.TextAppearance_Small);
				Linkify.addLinks(emailValue , Linkify.EMAIL_ADDRESSES);
				emailRow.addView(emailValue);
				table.addView(emailRow);
			}
			
			//Telefono
			if (directorio.getTelefono()!=null){
				TableRow telefonoRow = new TableRow(table.getContext());
				TextView telefonoValue = new TextView(telefonoRow.getContext());
				telefonoValue.setText(html2String(directorio.getTelefono()));
				telefonoValue.setTextAppearance(telefonoRow.getContext(), android.R.style.TextAppearance_Small);
				Linkify.addLinks(telefonoValue , Linkify.PHONE_NUMBERS);
				telefonoRow.addView(telefonoValue);
				table.addView(telefonoRow);
			}
		}
		catch (Exception e) {
			Log.e(getClass()+".getInfoContents", e.toString(),e);
		}
		
        return view;	
    }

	private String html2String(String input){
		try{
			Document doc = new Cleaner(Whitelist.simpleText()).clean(Jsoup.parse(input));
			doc.outputSettings().escapeMode(EscapeMode.xhtml);
			return doc.body().html();
		} catch (Exception e) {
			Log.e(getClass()+".html2String", e.toString(),e);
			return e.getMessage();
		}
	}
	
	@Override
	public View getInfoWindow(Marker marker) {
		// TODO Auto-generated method stub
		return null;
	}

}
