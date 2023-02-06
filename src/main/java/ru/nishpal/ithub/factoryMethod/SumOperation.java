package ru.nishpal.ithub.factoryMethod;

public class SumOperation implements OperationsCalculation{
    @Override
    public Calculate createOperation() {
        return new Sum();
    }
}
