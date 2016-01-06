package com.chymtt.reactnativedropdown;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.bridge.ReadableArray;

public class DropdownManager extends SimpleViewManager<Dropdown> {
    public static final String REACT_CLASS = "DropdownAndroid";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected Dropdown createViewInstance(ThemedReactContext context) {
        return new Dropdown(context);
    }

    @ReactProp(name = "values")
    public void setValues(Dropdown view, ReadableArray values) {
        view.setValues(values);
    }

    @ReactProp(name = "selected")
    public void setSelected(Dropdown view, int selected) {
        view.setSelected(selected);
    }

    @ReactProp(name = "fontSize")
    public void setFontSize(Dropdown view, int fontSize) {
        view.setFontSize(fontSize);
    }

    @ReactProp(name = "fontColor")
    public void setFontColor(Dropdown view, String fontColor) {
        view.setFontColor(fontColor);
    }

    @ReactProp(name = "dropdownItemPadding")
    public void setDropdownItemPadding(Dropdown view, int dropdownItemPadding) {
        view.setDropdownItemPadding(dropdownItemPadding);
    }
}
