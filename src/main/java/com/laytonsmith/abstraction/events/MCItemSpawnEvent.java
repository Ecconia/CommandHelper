package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.entities.MCItem;
import com.laytonsmith.abstraction.MCLocation;
import com.laytonsmith.core.events.BindableEvent;

public interface MCItemSpawnEvent extends BindableEvent {

	MCItem getEntity();

	MCLocation getLocation();
}
