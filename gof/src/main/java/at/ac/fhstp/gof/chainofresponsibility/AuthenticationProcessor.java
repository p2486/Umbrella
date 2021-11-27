package at.ac.fhstp.gof.chainofresponsibility;

public abstract class AuthenticationProcessor {

    public AuthenticationProcessor nextProcessor;
    
    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
