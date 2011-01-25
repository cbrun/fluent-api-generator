      package fr.obeo.dsl.viewpoint.tests.support;
      
      public class Palette{
            
            private DesignerBotContextData ctx;
            
            private java.lang.String partialName;
            
            
            public Palette(DesignerBotContextData ctx) {
            	this.ctx = ctx;
            }
            
                  
                  public fr.obeo.dsl.viewpoint.tests.support.SelectedPaletteTool tool( java.lang.String partialName ) {
                    	this.partialName = partialName; 
                  	    return ctx.createSelectedPaletteTool();
                  }      	
                  
            
            
            } 
