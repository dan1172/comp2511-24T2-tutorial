package example;

import java.util.*;

public class GenericsExamples {
    public static void main(String[] args) {
        /**
         * public class A {}
         * public class B extends A{}
         * public class C extends B{}
         */
        // List<? super B> foo1 = new ArrayList<>();
        // foo1.add(new A());
        // foo1.add(new B());
        // foo1.add(new C());
        // foo1 = new ArrayList<A>();
        // foo1 = new ArrayList<B>();
        // foo1 = new ArrayList<C>();


        // https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java
        // ? super B has pretty much NOTHING to do with what types the array itself holds, just what type it can be initialised with

        // when do we use <? super T> then?
        // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        // filter(Predicate<? super T> predicate)

        // imagine we have a list of strings we want to filter
        // what types of predicates do we want to accept?


        // List<? extends Number> foo2 = new ArrayList<Number>();
        // foo2.add(5); // why can't we add to the list?
        // foo2 could be a list of numbers, ints, floats
        // when would we use <? extends Number> then?
    }
}

/**
 * Can we have wildcards in classes?
 * class GenericsExamples <?> {}
 * class GenericsExamples <? extends A> {}
 * class GenericsExamples <? super A> {}
 * 
 * class GenericsExamples <E> {}
 * class GenericsExamples <E extends A> {}
 * class GenericsExamples <E super A> {}
 * 
 */