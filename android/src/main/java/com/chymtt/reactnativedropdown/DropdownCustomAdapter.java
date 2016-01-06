package com.chymtt.reactnativedropdown;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.util.TypedValue;
import android.graphics.Color;

public class DropdownCustomAdapter extends ArrayAdapter implements SpinnerAdapter {
    Context context;
    int textViewResourceId;
    ArrayList<String> arrayList;
    int fontSize;
    int dropdownItemPadding;
    String fontColor;

    public DropdownCustomAdapter(Context context, int textViewResourceId,  ArrayList<String> arrayList, int fontSize, String fontColor, int dropdownItemPadding) {
        super(context, textViewResourceId, arrayList);
        this.context = context;
        this.textViewResourceId = textViewResourceId;
        this.arrayList = arrayList;
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.dropdownItemPadding = dropdownItemPadding;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView lbl = (TextView) super.getView(position, convertView, parent);
        lbl.setText(arrayList.get(position).toString());
        lbl.setTextSize(TypedValue.COMPLEX_UNIT_SP, this.fontSize);
        lbl.setTextColor(Color.parseColor(this.fontColor));
        return lbl;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView lbl = (TextView) super.getView(position, convertView, parent);
        lbl.setText(arrayList.get(position).toString());
        lbl.setTextSize(TypedValue.COMPLEX_UNIT_SP, this.fontSize);
        lbl.setTextColor(Color.parseColor(this.fontColor));
        lbl.setPaddingRelative(this.dropdownItemPadding, this.dropdownItemPadding, this.dropdownItemPadding, this.dropdownItemPadding);
        return lbl;
    }

}
