package lambda.functionalinterfaces;

public class Main {

    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new PredicateService();
        functionalInterface.execute();

        functionalInterface = new SupplierService();
        functionalInterface.execute();

        functionalInterface = new FunctionService();
        functionalInterface.execute();
    }
}
