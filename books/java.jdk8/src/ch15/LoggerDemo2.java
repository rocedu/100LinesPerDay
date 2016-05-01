package ch15;

import java.util.logging.*;

public class LoggerDemo2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerDemo2.class.getName());
        logger.setLevel(Level.WARNING);
        for(Handler handler : logger.getParent().getHandlers()) {
            handler.setLevel(Level.FINE);
        }
        logger.log(Level.WARNING, "WARNING 信息");
        logger.log(Level.INFO, "INFO 信息");
        logger.log(Level.CONFIG, "CONFIG 信息");
        logger.log(Level.FINE, "FINE 信息");
    }
}
