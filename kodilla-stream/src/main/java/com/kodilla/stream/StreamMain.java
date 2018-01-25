package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        /**First example 7.1
         * System.out.println("Welcome to module 7 - Stream");
         *
         * //Second example 7.1
         * SaySomething saySomething = new SaySomething();
         * saySomething.say();
         *
         * //Third example 7.1
         * Processor processor = new Processor();
         * ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
         * processor.execute(executeSaySomething);
         *
         * //Fourth example 7.1
         * Processor processor = new Processor();
         * Executor codeToExecute = () -> System.out.println("This is an example text.");
         * processor.execute(codeToExecute);
         *
         * //Fifth example 7.1
         * Processor processor = new Processor();
         * processor.execute(() -> System.out.println("This is an example text."));
         *
         * //Sixth example 7.1
         * ExpressionExecutor expressionExecutor = new ExpressionExecutor();
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
         *
         * //Seventh example 7.1
         * ExpressionExecutor expressionExecutor = new ExpressionExecutor();
         * System.out.println("Calculating expressions with lambdas");
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
         * expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
         *
         * System.out.println("Calculating expressions with method references");
         * expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
         * expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
         * expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
         * expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
         */

        //Work 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String wife = "My beautiful JOANA";
        poemBeautifier.beautify(wife, text -> "***" + text + "***");
        poemBeautifier.beautify(wife, text -> "LOVE " + "\"" + toUpperCase(wife) + "\"" + " LOVE");
        poemBeautifier.beautify(wife, text -> "I Love my " + text.substring(13,18));
        poemBeautifier.beautify(wife, text -> text.startsWith("") + " " + text + " " + text.endsWith(""));









    }
}
