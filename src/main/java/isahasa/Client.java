package isahasa;

import java.nio.charset.StandardCharsets;

public class Client {

    private Channel channel;

    public Client(Channel channel) {
        this.channel = channel;
    }

    public int writeToChannel(TextSource data) {
        return channel.writeByte(data.getPlainText().getBytes(StandardCharsets.UTF_8));
    }
}
