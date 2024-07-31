/* single responsibility principal */
/* here the user Authentication class should always do what it is been instructed to do. not to do anything else. */
/* here , we should divide the functionality to the respective classes */

public class userAuthentication {
    public boolean authenticate(String username, String password) {
        // Authentication logic
        return true;
    }
}

class LogoutAttempt {
    public void logAuthenticationAttempt(String username, boolean success) {
        // Logging logic
    }
}

class sendNotification {
    public void sendAuthenticationNotification(String username) {
        // Notification logic
    }
}
