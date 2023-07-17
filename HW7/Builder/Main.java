package HW7.Builder;

import HW7.Builder.Message;
import HW7.Builder.MessageBuilder;

public class Main {
    public static void main(String[] args) {
        Message message = new MessageBuilder()
                .setParam1("par1")
                .setParam2("par2")
                .setParam3("par3")
                .build();
    }
}