public class Settings {
    private boolean notificationsEnabled;
    
    private Settings(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    public void toggleNotifications(){
        notificationsEnabled = !notificationsEnabled;
    }

    
}
