      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class SessionFile{
            
            private DesignerBotContextData ctx;
            
            
            
            public SessionFile(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.OpenedSession open() {
                  	    return ctx.createOpenedSession();
                  }      	
                  
                  public fr.obeo.dsl.viewpoint.tests.support.OpenedSession create() {
                  	    return ctx.createOpenedSession();
                  }      	
                  
            
            
            } 
