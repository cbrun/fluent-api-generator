package fr.obeo.dsl.viewpoint.tests.support;

import java.util.Collection;

public class DesignerBot {

	private DesignerBotContextData ctx = new DesignerBotContextData();

	private java.lang.String id;

	public fr.obeo.dsl.viewpoint.tests.support.ProjectBot project(
			java.lang.String id) {
		this.id = id;
		return ctx.createProjectBot();
	}

}
