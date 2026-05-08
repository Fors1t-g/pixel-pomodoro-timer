package service;

import model.UserProgress;

public class TimerService {
    private final UserProgress userProgress;
    public TimerService(UserProgress userProgress) {
        this.userProgress = userProgress;
    }
}
