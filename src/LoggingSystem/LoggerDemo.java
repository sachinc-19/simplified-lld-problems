package LoggingSystem;

public class LoggerDemo {
    public static void main(String[] args) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LOGGER_TYPE.INFO,"Info message");
        logProcessor.log(LOGGER_TYPE.ERROR,"Error message");
        logProcessor.log(LOGGER_TYPE.DEBUG,"Debug message");

    }
}
