package edu.ucsd.cs.palmscom.client.events;

import com.google.gwt.event.shared.EventHandler;

public interface OnlineUsersChangeHandler extends EventHandler  {
	void onOnlineUsersChange(OnlineUsersChangeEvent event);
}