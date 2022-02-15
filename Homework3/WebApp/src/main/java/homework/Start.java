package homework;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.net.URL;
import java.security.ProtectionDomain;

public class Start {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8189);
        ProtectionDomain protectionDomain = Start.class.getProtectionDomain();
        URL location = protectionDomain.getCodeSource().getLocation();
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setWar(location.toExternalForm());
        server.setHandler(webAppContext);
        server.start();
        server.join();
    }
}
