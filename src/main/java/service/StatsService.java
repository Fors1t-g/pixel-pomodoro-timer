package service;

import model.UserProgress;

public class StatsService {
    private final UserProgress userProgress;
    public StatsService(UserProgress userProgress) {
        this.userProgress = userProgress;
    }
}
