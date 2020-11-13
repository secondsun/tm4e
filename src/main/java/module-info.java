open module dev.secondsun.tm4e.core {
    requires java.logging;
    requires transitive org.jruby.jcodings;
    requires transitive org.jruby.joni;
    requires jdk.xml.dom;
    requires com.google.gson;
    requires xml.apis.ext;

    exports dev.secondsun.tm4e.core.grammar;
    exports dev.secondsun.tm4e.core.model;
    exports dev.secondsun.tm4e.core.registry;
    exports dev.secondsun.tm4e.core.theme;
    exports dev.secondsun.tm4e.core.theme.css;

}
