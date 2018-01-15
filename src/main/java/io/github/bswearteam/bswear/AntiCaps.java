package io.github.bswearteam.bswear;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.google.common.base.CharMatcher;

public class AntiCaps implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if (CharMatcher.javaUpperCase().or(CharMatcher.whitespace()).matchesAllOf(ChatColor.stripColor(e.getMessage()))) {
            e.setMessage(e.getMessage().toLowerCase());
        }
    }
}