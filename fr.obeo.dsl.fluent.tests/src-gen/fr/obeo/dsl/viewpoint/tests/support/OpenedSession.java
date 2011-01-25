package fr.obeo.dsl.viewpoint.tests.support;

public class OpenedSession {

	private DesignerBotContextData ctx;

	private org.eclipse.emf.common.util.URI newResourceURI;
	private java.lang.String partialName;

	public OpenedSession(DesignerBotContextData ctx) {
		this.ctx = ctx;
	}

	public fr.obeo.dsl.viewpoint.tests.support.OpenedSession addSemanticResource(
			org.eclipse.emf.common.util.URI newResourceURI) {
		this.newResourceURI = newResourceURI;
		return this;
	}

	public fr.obeo.dsl.viewpoint.tests.support.SelectedSemanticResource selectSemanticResource(
			java.lang.String partialName) {
		this.partialName = partialName;
		org.eclipse.emf.common.util.URI nextId = null;
		// TODO find/compute Id
		return ctx.createSelectedSemanticResource(nextId);
	}

	public fr.obeo.dsl.viewpoint.tests.support.WorkspaceBot close() {
		return ctx.createWorkspaceBot();
	}

	public fr.obeo.dsl.viewpoint.tests.support.ViewpointSelection viewpoints() {
		return ctx.createViewpointSelection();
	}

	public org.eclipse.emf.ecore.EObject session() {
		org.eclipse.emf.ecore.EObject Session = null;
		// TODO fill the code!
		return Session;
	}

}
