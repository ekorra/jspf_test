package impl;


import net.xeoh.plugins.base.annotations.PluginImplementation;

/**
 * Created by eko on 04.02.2015.
 */
@PluginImplementation
public class SomeOtherPlugin implements pluginInterface.SomeOtherPlugin{
    @Override
    public String saySomething() {
        return "Something";
    }
}
