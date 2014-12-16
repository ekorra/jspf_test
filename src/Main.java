import net.xeoh.plugins.base.Plugin;
import net.xeoh.plugins.base.PluginInformation;
import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.annotations.PluginImplementation;
import net.xeoh.plugins.base.impl.PluginInformationImpl;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import net.xeoh.plugins.base.util.JSPFProperties;
import net.xeoh.plugins.base.util.PluginManagerUtil;
import pluginInterface.SomePlugin;
import tmp.pluginInterface.ekoPlugin;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Iterator;
import net.xeoh.plugins.base.annotations.meta.Author;

//public class Collection<String>{
//
//}


public class Main {

    public static void main(String[] args) throws URISyntaxException {

        final JSPFProperties props = new JSPFProperties();
        //props.setProperty();
        PluginManager pm = PluginManagerFactory.createPluginManager();

//        pm.addPluginsFrom(new URI("classpath://*"));
//        ekoPlugin plugin = pm.getPlugin(ekoPlugin.class);
//        System.out.println(plugin.saySomething());

        pm.addPluginsFrom(new File("plugins/").toURI());
        SomePlugin somePlugin = pm.getPlugin(SomePlugin.class);
        if(somePlugin != null) {
            System.out.println(somePlugin.whoAmI());
        }

//        PluginManagerUtil pmu = new PluginManagerUtil(pm);
//        Collection<Plugin> plugins = pmu.getPlugins();

//        for(Plugin pl : plugins){
//            if(pl instanceof SomePlugin){
//                System.out.println(((SomePlugin) pl).whoAmI());
//            }
//        }

//        Collection<SomePlugin> somePlugins = pmu.getPlugins(SomePlugin.class);
//        for(SomePlugin sp : somePlugins){
//            PluginInformation information = pm.getPlugin(PluginInformation.class);
//            Collection<String> authors = information.getInformation(PluginInformation.Information.AUTHORS, sp);
//            Collection<String> versions = information.getInformation(PluginInformation.Information.VERSION, sp);
//            System.out.println(String.format("%s ;Version %s AuthoredBy %s", sp.whoAmI(), GetFirstOrDefault(versions), GetFirstOrDefault(authors)));

//        }


    }

    private static String GetFirstOrDefault(Collection<String> stringCollection)
    {
        String value = "";
        if(stringCollection.iterator().hasNext()){
            value = stringCollection.iterator().next();
        }
        return value;

    }


}
