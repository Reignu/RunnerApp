package app;
import controllers.Controller;

/**
 * Runner Class
 *
 * @author Martin Gallacher
 * @author Bobby Law
 */
public class RunnersApp {
    /**
     * Creates a Controller object and
     * sends it a run message
     */
    private static void run() {
        final Controller controller = new Controller();
        controller.run();
    }

    /**
     * Starts the application by invoking the class method run
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        RunnersApp.run();
    }
}
