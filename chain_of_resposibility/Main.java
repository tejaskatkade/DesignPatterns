package chain_of_resposibility;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR,"Error Occurs");
        logProcessor.log(LogProcessor.INFO,"Information");
        logProcessor.log(LogProcessor.DEBUG,"Debugging");
    }
    
}
