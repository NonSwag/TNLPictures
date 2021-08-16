package net.nonswag.tnl.pictures;

import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Pictures extends JavaPlugin {

    @Nullable
    private static Pictures instance = null;

    @Override
    public void onEnable() {
        setInstance(this);
    }

    private static void setInstance(@Nonnull Pictures instance) {
        Pictures.instance = instance;
    }

    @Nonnull
    public static Pictures getInstance() {
        assert instance != null;
        return instance;
    }
}
