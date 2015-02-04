import net.xeoh.plugins.base.Plugin;
import net.xeoh.plugins.base.PluginInformation;
import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.util.JSPFProperties;
import net.xeoh.plugins.base.util.PluginManagerUtil;
import pluginInterface.SomePlugin;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Collection;


public class Main {

    public static void main(String[] args) throws URISyntaxException {

        PluginManager pm = PluginManagerFactory.createPluginManager();
        pm.addPluginsFrom(new File("plugins/").toURI());

        PluginManagerUtil pmu = new PluginManagerUtil(pm);

        Collection<Plugin> plugins = pmu.getPlugins();
        System.out.println("Number of Plugins: " + plugins.size());
        for(Plugin plugin : plugins){
            if(plugin instanceof SomePlugin){
                System.out.println(((SomePlugin) plugin).whoAmI());
            }
            else{
                PluginInformation information = pm.getPlugin(PluginInformation.class);
                System.out.println(information.getInformation(PluginInformation.Information.CLASSPATH_ORIGIN, plugin));
            }
        }
    }

    private static String getFirstOrDefault(Collection<String> stringCollection)
    {
        String value = "";
        if(stringCollection.iterator().hasNext()){
            value = stringCollection.iterator().next();
        }
        return value;

    }


}
