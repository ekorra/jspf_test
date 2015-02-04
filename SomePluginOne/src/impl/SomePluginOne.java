package impl;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import net.xeoh.plugins.base.annotations.events.Init;
import net.xeoh.plugins.base.annotations.meta.Author;
import net.xeoh.plugins.base.annotations.meta.Version;
import pluginInterface.SomePlugin;

/**
 * Created by eko on 10.12.2014.
 */
@Author(name = "John Doe")
@Version(version = 1032)
@PluginImplementation
public class SomePluginOne implements SomePlugin {

    public String whoAmI() {
        return "I am SomePlugin number one";
    }

    @Init
    public void startup(){
        System.out.println("SomePluginOne init");
    }

}
