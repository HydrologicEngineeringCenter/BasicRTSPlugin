/**
 * 
 */
package basicrtsplugin;

import com.rma.factories.NewObjectFactory;
import java.util.List;
import hec2.map.GraphicElement;
import hec2.model.DataLocation;
import hec2.model.ProgramOrderItem;
import hec2.plugin.selfcontained.AbstractSelfContainedPlugin;
import hec2.plugin.CreatablePlugin;
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
public class BasicRTSPlugin extends AbstractSelfContainedPlugin<BasicRTSAlternative> implements RtsPlugin, CreatablePlugin
{
	private BasicRTSAlternative _computingAlt;

	public BasicRTSPlugin()
	{
		super();
		String name = BasicRTSPluginI18n.getI18n(
				BasicRTSPluginMessages.PLUGIN_SHORTNAME)
				.getText();
		setProgramOrderItem(new ProgramOrderItem( name,
				BasicRTSPluginI18n .getI18n(
								BasicRTSPluginMessages.PLUGIN_DESCRIPTION)
						.getText(), false, 3,
				BasicRTSPluginI18n .getI18n(
								BasicRTSPluginMessages.PLUGIN_SHORTNAME)
						.getText(), BasicRTSPluginI18n.getI18n(
						BasicRTSPluginMessages.PLUGIN_ICON)
						.getText()));

		setName(name);

		RtsPluginManager.register(this);
	}
    @Override
    public void editAlternative(BasicRTSAlternative e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected BasicRTSAlternative newAlternative(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getAltFileExtension() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPluginDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected NewObjectFactory getAltObjectFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean saveProject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean displayApplication() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getVersion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GraphicElement> getGraphicElements(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OutputElement> getOutputReports(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean displayEditor(GraphicElement ge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean displayOutput(OutputElement oe, List<ModelAlternative> list) throws OutputException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EditAction> getEditActions(ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editAction(String string, ModelAlternative ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean compute(ModelAlternative ma) {
        BasicRTSAlternative alt = getAlt(ma);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DataLocation> getDataLocations(ModelAlternative ma, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setDataLocations(ModelAlternative ma, List<DataLocation> list) throws ModelLinkingException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean copyModelFiles(ModelAlternative ma, String string, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EditAction> getGlobalEditActions(RtsTabType rtt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean closeForecast(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
