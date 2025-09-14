package LoggingSystem;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(LOGGER_TYPE logLevel,String message){
        if(logLevel == LOGGER_TYPE.INFO) {
            System.out.println("INFO: " + message);
        } else{
            super.log(logLevel, message);
        }
    }
}

