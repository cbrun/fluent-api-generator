      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class SelectedSemanticResource{
            
            private DesignerBotContextData ctx;
            
            private  org.eclipse.emf.common.util.URI id;
            
            private java.lang.String partialName;
            
            
            public SelectedSemanticResource(DesignerBotContextData ctx,org.eclipse.emf.common.util.URI id) {
            	this.ctx = ctx;
            	this.id = id;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.OpenedSession remove() {
                  	    return ctx.createOpenedSession();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SelectedSemanticObject selectObject( java.lang.String partialName ) {
                    	this.partialName = partialName; 
                  	    return ctx.createSelectedSemanticObject();
                  }      	
                  
            
            
            } 
