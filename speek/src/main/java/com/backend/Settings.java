package com.backend;

/**
 * The Settings class represents application settings that can be configured by the user
 * It includes a setting for enabling or disabling notifications and a method to toggle this setting
 */
public class Settings {
    private boolean notificationsEnabled;
    
    /**
     * Constructs a Settings object with the specified notification setting
     * @param notificationsEnabled Initial state for notifications (enabled or disabled)
     */
    private Settings(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    // Toggles the notifications setting. If notifications are currently enabled, this method will disable them, and vice versa
    public void toggleNotifications(){
        notificationsEnabled = !notificationsEnabled;
    }

    
}
