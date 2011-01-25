	package fr.obeo.dsl.viewpoint.tests.support;
	import java.util.Collection;
    public class DesignerBotContextData {
        
        
    			 public ViewpointSelection createViewpointSelection() {
    	           ViewpointSelection built= new ViewpointSelection(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public SelectedViewpoint createSelectedViewpoint() {
    	           SelectedViewpoint built= new SelectedViewpoint(this);
    	           return built;
    	          }
    	               	
    		
        
    	         public SelectedSemanticResource createSelectedSemanticResource(org.eclipse.emf.common.util.URI id) {
    	           SelectedSemanticResource built= new SelectedSemanticResource(this,id);
    	           return built;
    	         }
    	         
    		      public SelectedSemanticResource getSelectedSemanticResourceById(org.eclipse.emf.common.util.URI id) {
    		      //TODO
    		      return null;
    		      }
    		
    		
        
    			 public SelectedSemanticObject createSelectedSemanticObject() {
    	           SelectedSemanticObject built= new SelectedSemanticObject(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public OpenedDiagram createOpenedDiagram() {
    	           OpenedDiagram built= new OpenedDiagram(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public DiagramElementSelection createDiagramElementSelection() {
    	           DiagramElementSelection built= new DiagramElementSelection(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public Palette createPalette() {
    	           Palette built= new Palette(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public SelectedPaletteTool createSelectedPaletteTool() {
    	           SelectedPaletteTool built= new SelectedPaletteTool(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public LayersManagement createLayersManagement() {
    	           LayersManagement built= new LayersManagement(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public SelectedLayer createSelectedLayer() {
    	           SelectedLayer built= new SelectedLayer(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public OpenedSession createOpenedSession() {
    	           OpenedSession built= new OpenedSession(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public ClosedSession createClosedSession() {
    	           ClosedSession built= new ClosedSession(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public WorkspaceBot createWorkspaceBot() {
    	           WorkspaceBot built= new WorkspaceBot(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public ProjectBot createProjectBot() {
    	           ProjectBot built= new ProjectBot(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public SelectedProject createSelectedProject() {
    	           SelectedProject built= new SelectedProject(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public FileBot createFileBot() {
    	           FileBot built= new FileBot(this);
    	           return built;
    	          }
    	               	
    		
        
    			 public SessionFile createSessionFile() {
    	           SessionFile built= new SessionFile(this);
    	           return built;
    	          }
    	               	
    		
        }
