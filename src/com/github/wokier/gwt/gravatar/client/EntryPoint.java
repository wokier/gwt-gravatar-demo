package com.github.wokier.gwt.gravatar.client;

import com.github.wokier.gwt.client.GravatarColumn;
import com.github.wokier.gwt.client.GravatarImage;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.view.client.ListDataProvider;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

    public void onModuleLoad() {
	RootPanel.get("loading").setVisible(false);
	RootPanel.get().add(new GravatarImage("wokier@gmail.com"));
	CellTable<String> cellTable = new CellTable<String>();
	cellTable.addColumn(new GravatarColumn<String>() {
	    @Override
	    protected String getEmail(String email) {
		return email;
	    }
	}, "Gravatar");
	cellTable.addColumn(new TextColumn<String>() {
	    @Override
	    public String getValue(String email) {
		return email;
	    }
	}, "Email");
	ListDataProvider<String> dataProvider = new ListDataProvider<String>();
	dataProvider.addDataDisplay(cellTable);
	RootPanel.get().add(cellTable);
	dataProvider.getList().add("wokier@gmail.com");
    }
}
