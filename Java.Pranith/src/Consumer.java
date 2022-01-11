public class Consumer {

    public static void main(String args[]){


        String input="Pranith";
        Consumer<String>stringConsumer=s -> {
            System.out.println(input.substring(input.length() - 4));
        };
        stringConsumer.accept(input);

    }
}
