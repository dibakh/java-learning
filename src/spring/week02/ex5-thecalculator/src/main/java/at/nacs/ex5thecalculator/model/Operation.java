package at.nacs.ex5thecalculator.controller.operation;


import org.springframework.stereotype.Component;

@Component
public interface Operation {

    boolean matches(Expression expression);

    double apply(Expression expression);

}
