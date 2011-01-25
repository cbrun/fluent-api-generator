      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class ProjectBot{
            
            private DesignerBotContextData ctx;
            
            
            
            public ProjectBot(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SelectedProject create() {
                  	    return ctx.createSelectedProject();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SelectedProject select() {
                  	    return ctx.createSelectedProject();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.ProjectBot open() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.ProjectBot close() {
                  	return this;
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.WorkspaceBot delete() {
                  	    return ctx.createWorkspaceBot();
                  }      	
                  
            
            
            } 
