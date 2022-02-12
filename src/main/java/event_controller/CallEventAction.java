package event_controller;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import responses.EmbedResponse;
import responses.TextResponse;

public class CallEventAction {

    public static void callAction(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");

        switch (args[0]) {
            case ".text":
                TextResponse.textResponse(event);
                break;
            case ".embed":
                EmbedResponse.embedResponse(event);
                break;
        }
    }
}
