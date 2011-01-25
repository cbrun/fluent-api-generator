      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class FileBot{
            
            private DesignerBotContextData ctx;
            
            
            
            public FileBot(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.ProjectBot delete() {
                  	    return ctx.createProjectBot();
                  }      	
                  
            
            
            } 
