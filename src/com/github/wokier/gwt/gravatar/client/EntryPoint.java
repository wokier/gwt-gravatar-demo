package com.github.wokier.gwt.gravatar.client;

import com.github.wokier.gwt.client.Gravatar;
import com.google.gwt.user.client.ui.RootPanel;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {
    public void onModuleLoad() {
	RootPanel.get("loading").setVisible(false);
	RootPanel.get().add(new Gravatar("wokier@gmail.com"));
    }
}
