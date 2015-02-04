import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;
import plugin.SomePlugin;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        PluginManager pm = PluginManagerFactory.createPluginManager();

        pm.addPluginsFrom(new URI("classpath://*"));
        SomePlugin plugin = pm.getPlugin(SomePlugin.class);
        System.out.println(plugin.saySomething());
    }
}
