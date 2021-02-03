package lambda.functionalinterfaces;

//Functional interface is treated as SAM inferface (single abstract method)

/*
Functional Interfaces

1. Predicate[InputType] - Accepts ONE argument and returns boolean result. Predicate<String> - input type String
2. Consumer[InputType] - Accepts ONE argument and does not returns the result
3. Supplier[OutputType] - does not accept arguments but produces one result
4. Function[InputType, OutputType] - Accept ONE argument and produces ONE result
5. UnaryOperator - single argument with a return value.
6. BinaryOperator - takes two argument and returns one. (param1, param2) -> expression
 */
public interface FunctionalInterface {
    void execute();
}
