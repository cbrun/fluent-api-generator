      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class ViewpointSelection{
            
            private DesignerBotContextData ctx;
            
            private java.lang.String viewpointName;
            
            
            public ViewpointSelection(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SelectedViewpoint enable( java.lang.String viewpointName ) {
                    	this.viewpointName = viewpointName; 
                  	    return ctx.createSelectedViewpoint();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SelectedViewpoint disable( java.lang.String viewpointName ) {
                    	this.viewpointName = viewpointName; 
                  	    return ctx.createSelectedViewpoint();
                  }      	
                  
            
            
            } 
