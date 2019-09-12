/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basicrtsplugin;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 *
 * @author WatPowerUser
 */
public class BasicRTSPluginMessages {
    public static final String Bundle_Name = BasicRTSPluginI18n.BUNDLE_NAME;
    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(Bundle_Name);
    public static final String PLUGIN_NAME = "BasicPlugin.Name";
    public static final String PLUGIN_DESCRIPTION = "BasicPlugin.Description";
    public static final String PLUGIN_SHORTNAME = "BasicPlugin.ShortName";
    public static final String PLUGIN_ICON = "UNKNOWN";
    private BasicRTSPluginMessages(){
        super();
    }
    public static String getString(String key){
        try
        {
            return RESOURCE_BUNDLE.getString(key);
        }
        catch(MissingResourceException e)
        {
            return '!' + key + '!';
        }
    }
}
