package com.fibermc.essentialcommands.commands.suggestions;

import com.fibermc.essentialcommands.ManagerLocator;
import com.fibermc.essentialcommands.PlayerDataManager;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.server.command.ServerCommandSource;

import java.util.ArrayList;

public class HomeSuggestion {
    //Brigader Suggestions
    public static SuggestionProvider<ServerCommandSource> suggestedStrings() {
        return (context, builder) -> ListSuggestion.getSuggestionsBuilder(builder,
                new ArrayList<String>(ManagerLocator.INSTANCE.getPlayerDataManager().getOrCreate(context.getSource().getPlayer()).getHomeNames()));
    }
}
