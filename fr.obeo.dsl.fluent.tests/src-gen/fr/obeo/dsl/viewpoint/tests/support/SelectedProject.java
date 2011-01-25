      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class SelectedProject{
            
            private DesignerBotContextData ctx;
            
            private java.lang.String name;
            
            
            public SelectedProject(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.ProjectBot file( java.lang.String name ) {
                    	this.name = name; 
                  	    return ctx.createProjectBot();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SessionFile sessionFile( java.lang.String name ) {
                    	this.name = name; 
                  	    return ctx.createSessionFile();
                  }      	
                  
            
            
            } 
