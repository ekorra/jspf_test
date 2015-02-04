package plugin.Impl;

import net.xeoh.plugins.base.annotations.PluginImplementation;
import plugin.SomePlugin;

/**
 * Created by eko on 10.12.2014.
 */
@PluginImplementation
public class SomepluginImplOne implements SomePlugin {
    public String saySomething() {
        return "Something";
    }
}
