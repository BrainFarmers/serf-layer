package com.serflayer.serf.shell;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class SerfShell {

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }

}
