package fr.obeo.dsl.viewpoint.tests.support;

public class SelectedSemanticObject {

	private DesignerBotContextData ctx;

	private java.lang.String diagramName;

	public SelectedSemanticObject(DesignerBotContextData ctx) {
		this.ctx = ctx;
	}

	public fr.obeo.dsl.viewpoint.tests.support.OpenedDiagram createNewDiagram(
			java.lang.String diagramName) {
		this.diagramName = diagramName;
		return ctx.createOpenedDiagram();
	}

}
