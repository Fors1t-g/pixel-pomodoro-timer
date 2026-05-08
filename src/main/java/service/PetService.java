package service;

import model.UserProgress;

public class PetService {
    private final UserProgress userProgress;
    public PetService(UserProgress userProgress) {
        this.userProgress = userProgress;
    }
}
