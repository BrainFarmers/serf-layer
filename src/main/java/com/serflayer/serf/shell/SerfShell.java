package com.serflayer.serf.shell;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class SerfShell {

    @ShellMethod(value = "Polite ping method.", key = "Hello de la g")
    public String hello() {
        return "Hello!";
    }

}
