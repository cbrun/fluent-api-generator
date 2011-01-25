      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class DiagramElementSelection{
            
            private DesignerBotContextData ctx;
            
            private java.lang.String partialName;
            private org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart;
            
            
            public DiagramElementSelection(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection findBorderNode( java.lang.String partialName ) {
                    	this.partialName = partialName; 
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection editLabel( java.lang.String partialName ) {
                    	this.partialName = partialName; 
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection hide() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection reveal() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection pin() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection unpin() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection delete() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.DiagramElementSelection dragTo( org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart ) {
                    	this.editPart = editPart; 
                  	return this;
                  }      	
                  
                  	
                  	public 	org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart editPart() {
                  	   	org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart GraphicalEditPart = null; 
                  	   // TODO fill the code!
                  	   return GraphicalEditPart;
                  	}
                  	
                  	public 	org.eclipse.gmf.runtime.notation.View notationModel() {
                  	   	org.eclipse.gmf.runtime.notation.View View = null; 
                  	   // TODO fill the code!
                  	   return View;
                  	}
            
            
            } 
