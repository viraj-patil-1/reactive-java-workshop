package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        System.out.println("\nPrint all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(no -> System.out.println(no));

        System.out.println("\nPrint numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(n -> n < 5).forEach(no -> System.out.println(no));

        System.out.println("\nPrint the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream().filter(n -> n < 5);

        System.out.println("Print the first number in intNumbersStream that's greater than 5.");
        //  If nothing is found, print -1
//        StreamSources.intNumbersStream().filter(n -> n > 5).findFirst().ifPresent(System.out.println());

        System.out.println("\nPrint first names of all users in userStream");
        StreamSources.userStream().forEach(u -> System.out.println(u.getFirstName()));

        System.out.println("\nPrint first names in userStream for users that have IDs from number stream");
        StreamSources.intNumbersStream().forEach(n -> StreamSources.userStream().filter(u -> u.getId() == n).forEach(user -> user.getFirstName()));

    }

}
