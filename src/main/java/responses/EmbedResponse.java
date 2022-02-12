package responses;

import constants.BotConstants;
import embeds.JefferyEmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class EmbedResponse {

    public static void embedResponse(GuildMessageReceivedEvent event) {
        event.getChannel().sendTyping().queue();

        MessageEmbed embed = JefferyEmbedBuilder.responseEmbedBuilder(
                "This is an embed",
                BotConstants.PURPLE
        );

        event.getChannel().sendMessage(embed).queue();
    }
}
