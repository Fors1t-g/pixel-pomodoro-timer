package app;

// будет ли контроллер иметь доступ к AppContext
public interface AppContextAware {
    void setAppContext(AppContext appContext);
}
