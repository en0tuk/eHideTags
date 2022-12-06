package ru.enis.ehidetags.commands;

import net.kyori.adventure.audience.Audience;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.enis.ehidetags.misc.configs.Data;

import static ru.enis.ehidetags.Core.adventure;
import static ru.enis.ehidetags.misc.Format.colorize;

public class HelpSubCommand implements ISubCommand {
  @Override
  public Boolean execute(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String commandLabel, @Nullable String[] args) {
    final Audience audience = adventure().sender(sender);
    if (sender.hasPermission("eht.reload")) {
      audience.sendMessage(colorize(Data.MESSAGE.PREFIX + Data.MESSAGE.HELP.RELOAD));
      return true;
    }
    audience.sendMessage(colorize(Data.MESSAGE.PREFIX + Data.MESSAGE.ERROR.PERMISSION));
    return true;
  }
}