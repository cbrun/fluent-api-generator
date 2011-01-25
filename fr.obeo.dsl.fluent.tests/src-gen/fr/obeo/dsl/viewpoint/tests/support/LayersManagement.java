      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class LayersManagement{
            
            private DesignerBotContextData ctx;
            
            private java.lang.String name;
            
            
            public LayersManagement(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.OpenedDiagram enable( java.lang.String name ) {
                    	this.name = name; 
                  	    return ctx.createOpenedDiagram();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.OpenedDiagram disable( java.lang.String name ) {
                    	this.name = name; 
                  	    return ctx.createOpenedDiagram();
                  }      	
                  
            
            
            } 
