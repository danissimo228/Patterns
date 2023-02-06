package ru.nishpal.ithub.factoryMethod;

public class DevideOperation implements OperationsCalculation{
    @Override
    public Calculate createOperation() {
        return new Divide();
    }
}
