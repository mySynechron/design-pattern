package com.synechron.Decorator;

public abstract class Decorator implements Component {
	private Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	public Component getComponent() {
		return component;
	}

}
