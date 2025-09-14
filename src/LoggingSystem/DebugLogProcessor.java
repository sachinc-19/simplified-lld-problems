package LoggingSystem;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(LOGGER_TYPE logLevel,String message){

        if(logLevel == LOGGER_TYPE.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else{
            super.log(logLevel, message);
        }

    }
}


