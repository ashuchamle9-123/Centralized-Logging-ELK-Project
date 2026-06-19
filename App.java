import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("ELK Project started successfully");
        logger.warning("This is a warning log");
        logger.severe("This is an error log");

        for (int i = 1; i <= 5; i++) {
            logger.info("Processing request number: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.severe("Thread interrupted");
            }
        }

        logger.info("Application finished");
    }
}
