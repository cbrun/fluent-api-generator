package fr.obeo.dsl.viewpoint.tests.support;

public class SelectedViewpoint {

	private DesignerBotContextData ctx;

	public SelectedViewpoint(DesignerBotContextData ctx) {
		this.ctx = ctx;
	}

	public fr.obeo.dsl.viewpoint.tests.support.ViewpointSelection activate() {
		return ctx.createViewpointSelection();
	}

	public fr.obeo.dsl.viewpoint.tests.support.ViewpointSelection deactivate() {
		return ctx.createViewpointSelection();
	}

}
