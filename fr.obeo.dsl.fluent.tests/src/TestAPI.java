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
		workspace.project("my.project.od").select().file("myfile.data").delete();
		SelectedProject prj = workspace.project("my.project.tocreate").create();
		prj.file("test.aird").create();

		OpenedDiagram diag = prj.sessionFile("my.aird").create()
				.addSemanticResource(null).addSemanticResource(null)
				.selectSemanticResource("hello.ecore").selectObject("foo")
				.createNewDiagram("my foo diagram");

		DiagramElementSelection diagElement = diag.findDiagramElement("bar element");

		diagElement.pin();
		diagElement.editLabel("bar has been renamed");
		diagElement.delete();

		diag.palette().tool("EClass").clickOn(diagElement.editPart());

	}
}
