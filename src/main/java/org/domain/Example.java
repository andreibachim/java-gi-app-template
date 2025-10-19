package org.domain;

import org.javagi.base.GErrorException;
import org.javagi.util.Intl;
import org.gnome.gio.Resource;

/**
 * The "main" class, here we initialize gettext, register the compiled
 * gresource bundle and start an Application instance.
 */
public class Example {

    /**
     * Run the application
     * @param args passed to AdwApplication.run()
     * @throws GErrorException thrown while loading and registering the
     *                         compiled resource bundle
     */
    public static void main(String[] args) throws GErrorException {
        // Initialize gettext
        Intl.bindtextdomain("Example", "build/locale");
        Intl.textdomain("Example");
        
        // Load gresource
        var resource = Resource.load("build/gresource/example.gresource");
        resource.resourcesRegister();

        // Create and run the application
        var app = new ExampleApplication();
        app.run(args);
    }
}
