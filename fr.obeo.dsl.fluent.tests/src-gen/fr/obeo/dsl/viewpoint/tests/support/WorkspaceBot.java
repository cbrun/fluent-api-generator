package fr.obeo.dsl.viewpoint.tests.support;

public class WorkspaceBot {

	private DesignerBotContextData ctx;

	private java.lang.String id;

	public WorkspaceBot(DesignerBotContextData ctx) {
		this.ctx = ctx;
	}

	public fr.obeo.dsl.viewpoint.tests.support.ProjectBot project(
			java.lang.String id) {
		this.id = id;
		return ctx.createProjectBot();
	}

}
