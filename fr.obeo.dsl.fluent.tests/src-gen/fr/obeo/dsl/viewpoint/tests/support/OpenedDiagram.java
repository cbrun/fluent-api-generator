package fr.obeo.dsl.viewpoint.tests.support;

public class OpenedDiagram {

	private DesignerBotContextData ctx;

	private java.lang.String partialName;
	private org.eclipse.emf.common.util.URI targetElement;

	public OpenedDiagram(DesignerBotContextData ctx) {
		this.ctx = ctx;
	}

	public fr.obeo.dsl.viewpoint.tests.support.OpenedSession close() {
		return ctx.createOpenedSession();
	}

	public fr.obeo.dsl.viewpoint.tests.support.LayersManagement layers() {
		return ctx.createLayersManagement();
	}

	public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection findDiagramElement(
			java.lang.String partialName) {
		this.partialName = partialName;
		return ctx.createDiagramElementSelection();
	}

	public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection findDiagramElement(
			org.eclipse.emf.common.util.URI targetElement) {
		this.targetElement = targetElement;
		return ctx.createDiagramElementSelection();
	}

	public fr.obeo.dsl.viewpoint.tests.support.Palette palette() {
		return ctx.createPalette();
	}

	public org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart() {
		org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart GraphicalEditPart = null;
		// TODO fill the code!
		return GraphicalEditPart;
	}

}
