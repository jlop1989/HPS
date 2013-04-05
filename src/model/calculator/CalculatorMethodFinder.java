
package model.calculator;

import java.lang.reflect.Method;
import java.util.HashMap;
import model.annotations.OperatorAnnotation;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class CalculatorMethodFinder {
    
    public static final HashMap<String, Method> calculatorMethods = new HashMap<>();
    
    static{
        Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
        addCalculatorsMethods(reflections);
    }
    
    public static Method getMethod(String signature){
        return calculatorMethods.get(signature);
    }
    
    private static String getMethodSignature(Method method) {
        String result = method.getAnnotation(OperatorAnnotation.class).value();
        for (Class<?> type : method.getParameterTypes())
            result += type.getSimpleName();
        return result;
    }

    private static void addCalculatorsMethods(Reflections ref) throws SecurityException {
        for (Class<?> calculatorClass : ref.getSubTypesOf(Calculator.class))
            addCalculatorMethods(calculatorClass);
    }
    private static void addCalculatorMethods(Class<?> calculatorClass) throws SecurityException {
        for (Method method : calculatorClass.getDeclaredMethods()) 
            addMethod(method);
    }

    private static void addMethod(Method method) {
        if (method.isAnnotationPresent(OperatorAnnotation.class))
            calculatorMethods.put(getMethodSignature(method), method);
    }

}
