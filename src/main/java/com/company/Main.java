package com.company;

import com.company.controller.MainController;
import com.company.servises.DevisesServise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Computer c1 = new Computer();
//        Computer c2 = new Computer("c2",999,999,999,999);
//        Laptop l1 = new Laptop();
//        Laptop l2 = new Laptop(1239,91239,239);
//        Laptop l3 = new Laptop("l3",999,999,999,999,999,999,999);
//        System.out.println('\n');
//
//        Class l3class = l3.getClass();
//        Method[] methods = l3class.getMethods();
//        System.out.println("CANONACAL: " + l3class.getCanonicalName());
//        System.out.println("SIMPLE: " + l3class.getSimpleName());
//        System.out.println("Methodts with MyAnnotation:");
//        int i = 0;
//
//        for (Method method : methods) {
//            if (method.isAnnotationPresent(MyAnnotation.class)) {
//                System.out.print("\t" + ++i + ")" + method.getName());
//                if(method.getParameterTypes().length == 0) {
//                    System.out.print("()\n");
//                    System.out.println("\t\t" + method.invoke(l3));
//                } else {
//                    for (Class paramType : method.getParameterTypes()) {
//                        System.out.print("(" + paramType.getName() + ")\n");
//                        method.invoke(l3,555);
//                    }
//                }
//            }
//        }
//        System.out.println(l3);
//        ClassLoader classLoader = c1.getClass().getClassLoader();
//        Class<?>[] interfaces = c1.getClass().getInterfaces();
//        Handler invocationHandler = new Handler(c1);
//        Device d = (Device) Proxy.newProxyInstance(c2.getClass().getClassLoader(), c2.getClass().getInterfaces(), new Handler(c2));
//        try {
//            d.setName("hello");
//        } catch (Exception e) {
//            System.out.println("error");
//        }
//        System.out.println(c2.getName());

        DevisesServise s = new DevisesServise();
        MainController c = new MainController(s);
        c.menu();

    }


}

