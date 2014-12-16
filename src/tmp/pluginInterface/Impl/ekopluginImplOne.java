package tmp.pluginInterface.Impl;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import tmp.pluginInterface.ekoPlugin;

/**
 * Created by eko on 10.12.2014.
 */
@PluginImplementation
public class ekopluginImplOne implements ekoPlugin {
    public String saySomething() {
        return "Something";
    }
}
