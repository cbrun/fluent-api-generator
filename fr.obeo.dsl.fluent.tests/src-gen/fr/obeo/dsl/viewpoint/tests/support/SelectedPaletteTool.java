      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class SelectedPaletteTool{
            
            private DesignerBotContextData ctx;
            
            private org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart;
            private org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart source;
            private org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart target;
            
            
            public SelectedPaletteTool(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection clickOn( org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart ) {
                    	this.editPart = editPart; 
                  	    return ctx.createDiagramElementSelection();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection clickBetween( org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart source , org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart target ) {
                    	this.source = source; 
                    	this.target = target; 
                  	    return ctx.createDiagramElementSelection();
                  }      	
                  
            
            
            } 
