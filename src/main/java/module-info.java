open module dev.secondsun.tm4e.core {
    requires java.logging;
    requires org.jruby.jcodings;
    requires org.jruby.joni;
    requires xml.apis.ext;
    requires jdk.xml.dom;
    requires gson;

    exports dev.secondsun.tm4e.core.grammar;

    exports dev.secondsun.tm4e.core.model;
    exports dev.secondsun.tm4e.core.registry;
    exports dev.secondsun.tm4e.core.theme;
    exports dev.secondsun.tm4e.core.theme.css;


}
