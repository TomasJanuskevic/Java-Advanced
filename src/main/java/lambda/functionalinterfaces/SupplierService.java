package lambda.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierService implements FunctionalInterface {
    @Override
    public void execute() {
        // Supplier Functional interface - represent supplier of results.
        //Does not accept ane arguments
        //BUT - empty argument list is still mandatory () -> expression

        Supplier<String> supplier = () -> "[SUPPLIER] Java is fun but confusing";
        System.out.println(supplier.get()); // get tas pats kas test

        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();
        System.out.println(dateSupplier.get());
    }
}
