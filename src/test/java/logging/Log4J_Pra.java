package logging;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4J_Pra {
    //static
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Log4J_Pra.class);
        PropertyConfigurator.configure("log4j.properties");
        logger.info("this test is passed");
        logger.error("this is failed");
    }
}
