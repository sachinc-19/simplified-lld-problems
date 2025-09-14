package LoggingSystem;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(LOGGER_TYPE logLevel,String message){

        if(logLevel == LOGGER_TYPE.ERROR) {
            System.out.println("ERROR: " + message);
        } else{

            super.log(logLevel, message);
        }

    }
}

