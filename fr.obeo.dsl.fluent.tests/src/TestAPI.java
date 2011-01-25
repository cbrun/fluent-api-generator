/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
import org.eclipse.emf.common.util.URI;

import fr.obeo.dsl.viewpoint.tests.support.DesignerBot;
import fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection;
import fr.obeo.dsl.viewpoint.tests.support.OpenedDiagram;
import fr.obeo.dsl.viewpoint.tests.support.SelectedProject;

public class TestAPI {

	public void test() {

		URI airdURI = null;
		URI semResource = null;

		DesignerBot workspace = new DesignerBot();
		SelectedProject prj = workspace.project("my").create();
		prj.file("test.aird").create();

		OpenedDiagram diag = prj.sessionFile("my.aird").create()
				.addSemanticResource(null).addSemanticResource(null)
				.selectSemanticResource("coucou.ecore").selectObject("machin")
				.createNewDiagram("myDiag");

		DiagramElementSelection diagElement = diag.findDiagramElement("my");

		diagElement.pin();
		diagElement.editLabel("nouveau nom");
		diagElement.delete();

		diagElement.dragTo(diag.findDiagramElement("e").editPart());
		diag.palette().tool("EClass").clickOn(diagElement.editPart());

	}
}
