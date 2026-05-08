package app;

import model.UserProgress;
import service.*;

public class AppContext {

    private final UserProgress userProgress;

    private final AchievementsService achievementsService;
    private final TimerService timerService;
    private final RewardService rewardService;
    private final ProgressService progressService;
    private final PetService petService;
    private final ShopService shopService;
    private final StatsService statsService;

    public AppContext() {
        this.userProgress = new UserProgress();

        this.achievementsService = new AchievementsService(userProgress);
        this.rewardService = new RewardService(userProgress);
        this.progressService = new ProgressService(userProgress);
        this.petService = new PetService(userProgress);
        this.timerService = new TimerService(userProgress);
        this.shopService = new ShopService(userProgress);
        this.statsService = new StatsService(userProgress);
    }

    public UserProgress getUserProgress() {
        return userProgress;
    }

    public TimerService getTimerService() {
        return timerService;
    }

    public RewardService getRewardService() {
        return rewardService;
    }

    public ProgressService getProgressService() {
        return progressService;
    }

    public PetService getPetService() {
        return petService;
    }

    public ShopService getShopService() {
        return shopService;
    }

    public StatsService getStatsService() {
        return statsService;
    }

    public AchievementsService getAchievementsService() {
        return achievementsService;
    }
}
