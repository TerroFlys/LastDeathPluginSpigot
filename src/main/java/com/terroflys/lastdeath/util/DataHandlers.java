package com.terroflys.lastdeath.util;

import java.util.HashMap;
import java.util.UUID;

public class DataHandlers {
    public static HashMap<UUID, String> lastDeath = new HashMap<>();
    public static void saveLastDeath(UUID uuid, String text) {
        lastDeath.put(uuid, text);
    }
    public static String getLastDeath(UUID uuid) {
        return lastDeath.get(uuid);
    }



}
