package ru.nishpal.ithub.bridge;

// Наследование без потери гипкости
public abstract class Program {
    protected Dev dev;

    protected Program(Dev dev) {
        this.dev = dev;
    }

    public abstract void developProgram();
}
