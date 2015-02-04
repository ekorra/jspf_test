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

        Collection<SomePlugin> somePlugins = pmu.getPlugins(SomePlugin.class);
        for(SomePlugin somePlugin : somePlugins){
            PluginInformation information = pm.getPlugin(PluginInformation.class);
            Collection<String> authors = information.getInformation(PluginInformation.Information.AUTHORS, somePlugin);
            Collection<String> versions = information.getInformation(PluginInformation.Information.VERSION, somePlugin);

            System.out.println(String.format("%s ;Version %s AuthoredBy %s", somePlugin.whoAmI(), getFirstOrDefault(versions), getFirstOrDefault(authors)));
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
