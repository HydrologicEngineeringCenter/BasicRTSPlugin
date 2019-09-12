/**
 * 
 */
package basicrtsplugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import rma.swing.RmaImage;
import rma.util.RMAIO;

import com.rma.io.FileManagerImpl;
import com.rma.model.Project;

import hec.heclib.util.HecTime;
import hec.watershed.model.Condition;

import hec2.map.GraphicElement;
import hec2.model.DataLocation;
import hec2.model.ProgramOrderItem;
import hec2.plugin.AbstractComputablePlugin;
import hec2.plugin.action.EditAction;
import hec2.plugin.action.OutputElement;
import hec2.plugin.lang.ModelLinkingException;
import hec2.plugin.lang.OutputException;
import hec2.plugin.model.ModelAlternative;
import hec2.rts.plugin.RtsPlugin;
import hec2.rts.plugin.RtsPluginManager;
import hec2.rts.ui.RtsTabType;

/**
 * @author RTS Poweruser
 *
 */
public class BasicRTSPlugin extends AbstractComputablePlugin
	implements RtsPlugin
{
	private static BasicRTSPlugin _plugin;
	private ImageIcon _icon;

	public BasicRTSPlugin()
	{
		super();
		_icon = RmaImage.getImageIcon("Images/RTS.gif");
		setProgramOrderItem(new ProgramOrderItem("BasicRTSPlugin",
				"", true, 3, "basicRTSPlugin","Images/RTS.gif"));

		setName("BasicRTSPlugin");
                System.out.println("BasicRTSPlugin:BasicRTSstarted");
                RtsPluginManager.register(this);
	}


	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#getGraphicElements(hec2.plugin.model.ModelAlternative)
	 */
	@Override
	public List<GraphicElement> getGraphicElements(ModelAlternative modelAlt)
	{
		// TODO Auto-generated method stub
		System.out.println("getGraphicElements TODO implement me");
		return new ArrayList<GraphicElement>();
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#getOutputReports(hec2.plugin.model.ModelAlternative)
	 */
	@Override
	public List<OutputElement> getOutputReports(ModelAlternative modelAlt)
	{
		// TODO Auto-generated method stub
		System.out.println("getOutputReports TODO implement me");
		return new ArrayList<OutputElement>();
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#displayEditor(hec2.map.GraphicElement)
	 */
	@Override
	public boolean displayEditor(GraphicElement element)
	{
		// TODO Auto-generated method stub
		System.out.println("displayEditor TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#displayOutput(hec2.plugin.action.OutputElement, java.util.List)
	 */
	@Override
	public boolean displayOutput(OutputElement element,
			List<ModelAlternative> otherAlts) throws OutputException
	{
		// TODO Auto-generated method stub
		System.out.println("displayOutput TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#getEditActions(hec2.plugin.model.ModelAlternative)
	 */
	@Override
	public List<EditAction> getEditActions(ModelAlternative modelAlt)
	{
		// TODO Auto-generated method stub
		System.out.println("getEditActions TODO implement me");
		return new ArrayList<EditAction>();
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#editAction(java.lang.String, hec2.plugin.model.ModelAlternative)
	 */
	@Override
	public void editAction(String action, ModelAlternative modelAlt)
	{
		// TODO Auto-generated method stub
		System.out.println("editAction TODO implement me");
		
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.ComputablePlugin#compute(hec2.plugin.model.ModelAlternative)
	 */
	@Override
	public boolean compute(ModelAlternative modelAlt)
	{
		//BasicRTSAlternative alt = ;
            
               // alt.compute();
		System.out.println("compute TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.ComputablePlugin#getDataLocations(hec2.plugin.model.ModelAlternative, int)
	 */
	@Override
	public List<DataLocation> getDataLocations(ModelAlternative modelAlt,
			int direction)
	{
		// TODO Auto-generated method stub
		System.out.println("getDataLocations TODO implement me");
		return new ArrayList<DataLocation>();
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.ComputablePlugin#setDataLocations(hec2.plugin.model.ModelAlternative, java.util.List)
	 */
	@Override
	public boolean setDataLocations(ModelAlternative modelAlt,
			List<DataLocation> dataLocations) throws ModelLinkingException
	{
		// TODO Auto-generated method stub
		System.out.println("setDataLocations TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#saveProject()
	 */
	@Override
	public boolean saveProject()
	{
		// TODO Auto-generated method stub
		System.out.println("saveProject TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#displayApplication()
	 */
	@Override
	public boolean displayApplication()
	{
		// TODO Auto-generated method stub
		System.out.println("displayApplication TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#getVersion()
	 */
	@Override
	public String getVersion()
	{
		// TODO Auto-generated method stub
		System.out.println("getVersion TODO implement me");
		return "1.0";
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.selfcontained.AbstractSelfContainedPlugin#editAlternative(hec2.plugin.selfcontained.SelfContainedPluginAlt)
	 */
	@Override
	public void editAlternative(ModelAlternative modelAlt)
	{
		// TODO Auto-generated method stub
		System.out.println("editAlternative TODO implement me");
		
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#createProject(com.rma.model.Project)
	 */
	@Override
	public boolean createProject(Project project)
	{
		// TODO Auto-generated method stub
		System.out.println("createProject TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#openProject(com.rma.model.Project)
	 */
	@Override
	public boolean openProject(Project project)
	{
		// TODO Auto-generated method stub
		System.out.println("openProject TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#close(boolean)
	 */
	@Override
	public boolean close(boolean appExiting)
	{
		// TODO Auto-generated method stub
		System.out.println("close TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#getProjectName()
	 */
	@Override
	public String getProjectName()
	{
		// TODO Auto-generated method stub
		System.out.println("getProjectName TODO implement me");
		return null;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#getLogfile()
	 */
	@Override
	public String getLogfile()
	{
		// TODO Auto-generated method stub
		System.out.println("getLogfile TODO implement me");
		return null;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.SimplePlugin#getDirectory()
	 */
	@Override
	public String getDirectory()
	{
		return "BasicRTSPlugin";
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.ComputablePlugin#getModelAlternatives(hec.watershed.model.Condition)
	 */
	@Override
	public List<ModelAlternative> getModelAlternatives(Condition schematic)
	{
		Project prj = Project.getCurrentProject();
		String rwFolder = RMAIO.concatPath(prj.getProjectDirectory(),getDirectory());
		List files = FileManagerImpl.getFileManager().getFileList(rwFolder, "*");
		String fname;
		File f;
		List<ModelAlternative>modelAlts = new ArrayList<ModelAlternative>();
		for (int i = 0;i < files.size(); i++ )
		{
			fname = (String) files.get(i);
			f = FileManagerImpl.getFileManager().getFile(fname);
			if ( !f.isDirectory() )
			{
				continue;
			}
			ModelAlternative malt = new ModelAlternative();
			malt.setName(f.getName());
			malt.setFilename(f.getAbsolutePath());
			modelAlts.add(malt);
		}
		
		return modelAlts;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.ComputablePlugin#cancelCompute()
	 */
	@Override
	public boolean cancelCompute()
	{
		// TODO Auto-generated method stub
		System.out.println("cancelCompute TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.ComputablePlugin#needToCompute(hec2.plugin.model.ModelAlternative, hec.heclib.util.HecTime)
	 */
	@Override
	public boolean needToCompute(ModelAlternative malt, HecTime lastComputeTime)
	{
		// TODO Auto-generated method stub
		System.out.println("needToCompute TODO implement me");
		return false;
	}

	

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#addMap(java.lang.String)
	 */
	@Override
	public void addMap(String mapPath)
	{
		// TODO Auto-generated method stub
		System.out.println("addMap TODO implement me");
		
	}

	/* (non-Javadoc)
	 * @see hec2.plugin.DisplayablePlugin#removeMap(java.lang.String)
	 */
	@Override
	public void removeMap(String mapPath)
	{
		// TODO Auto-generated method stub
		System.out.println("removeMap TODO implement me");
		
	}

	/* (non-Javadoc)
	 * @see hec2.rts.plugin.RtsPlugin#canImport()
	 */
	@Override
	public boolean canImport()
	{
		// TODO Auto-generated method stub
		System.out.println("canImport TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.rts.plugin.RtsPlugin#importData()
	 */
	@Override
	public void importData()
	{
		// TODO Auto-generated method stub
		System.out.println("importData TODO implement me");
		
	}

	/* (non-Javadoc)
	 * @see hec2.rts.plugin.RtsPlugin#displayApplication(hec2.plugin.model.ModelAlternative)
	 */
	@Override
	public boolean displayApplication(ModelAlternative modelAlt)
	{
		// TODO Auto-generated method stub
		System.out.println("displayApplication TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.rts.plugin.RtsPlugin#copyModelFiles(hec2.plugin.model.ModelAlternative, java.lang.String, boolean)
	 */
	@Override
	public boolean copyModelFiles(ModelAlternative modelAlt,
			String destDirectory, boolean toForecast)
	{
		// TODO Auto-generated method stub
		System.out.println("copyModelFiles TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see hec2.rts.plugin.RtsPlugin#getGlobalEditActions(hec2.rts.ui.RtsTabType)
	 */
	@Override
	public List<EditAction> getGlobalEditActions(RtsTabType tabType)
	{
		// TODO Auto-generated method stub
		System.out.println("getGlobalEditActions TODO implement me");
		return null;
	}

	/* (non-Javadoc)
	 * @see hec2.rts.plugin.RtsPlugin#closeForecast(java.lang.String)
	 */
	@Override
	public boolean closeForecast(String forecastFolder)
	{
		// TODO Auto-generated method stub
		System.out.println("closeForecast TODO implement me");
		return false;
	}
	/**
	 * get the RiverwarePlugin instance.
	 * @return
	 */
	public static BasicRTSPlugin getInstance()
	{
		return _plugin;
	}
	/**
	 * plugin entry point called by the CAVI
	 * @param args
	 */
	public static void main(String[] args)
	{
		_plugin = new BasicRTSPlugin();
	}

	
}
