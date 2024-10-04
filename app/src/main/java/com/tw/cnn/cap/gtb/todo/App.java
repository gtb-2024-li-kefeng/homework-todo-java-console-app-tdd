package com.tw.cnn.cap.gtb.todo;

import java.util.List;

public class App {


    public static void main(String[] args) {
        new App().run().forEach(System.out::println);
    }

    public List<String> run() {
        return ListCommand.run();
    }
}

