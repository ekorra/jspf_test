package Impl;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import pluginInterface.SomePlugin;

/**
 * Created by eko on 10.12.2014.
 */
@PluginImplementation
public class EkoPluginTwo implements SomePlugin {

    public String whoAmI() {
        return "I am EkoPlugin number two";
    }
}
