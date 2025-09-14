package LoggingSystem;

public abstract class LogProcessor {

    LogProcessor nextLoggerProcessor;
    LogProcessor(LogProcessor loggerProcessor) {
        this.nextLoggerProcessor = loggerProcessor;
    }

    public void log(LOGGER_TYPE logLevel, String message) {
        if (nextLoggerProcessor != null) {
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}