import java.util.*;

public final class AppConfig {
    private static final AppConfig INSTANCE=new AppConfig();
    private AppConfig(){}
    static AppConfig getInstance(){return INSTANCE;}
    String institution(){return "Example University";}
}
