package at.ac.fhstp.gof.chainofresponsibility;

public class App {
    
    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }
    public static void main(String[] args) {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        // True
        System.out.println(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
        // False
        System.out.println(authProcessorChain.isAuthorized(new SamlAuthenticationProvider()));
    }
}
