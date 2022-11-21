package at.htl.control;

import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class InitBean {

    @Inject
    Logger LOG;

    void onStart(@Observes StartupEvent ev) {
        LOG.info("The application is starting...");
    }
}
