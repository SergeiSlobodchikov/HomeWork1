package lesson1.sample;

import lesson1.regular.Decorator;
import lesson1.regular.OtherClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 *
 *  https://www.docker.com/products/docker-desktop/
 *   https://hub.docker.com/
 *
 * PS C:\sources\gb\core\group1\lesson1\out\artifacts\lesson1_jar> cd C:\sources\gb\core\group1\lesson1\src\main
 * PS C:\sources\gb\core\group1\lesson1\src\main> javac -sourcepath ./java -d out java/ru/geekbrains/lesson1/sample/Main.java
 * PS C:\sources\gb\core\group1\lesson1\src\main> javadoc -encoding utf8  -d docs -sourcepath ./java -cp ./out -subpackages ru
 * PS C:\sources\gb\core\group1\lesson1\src\main> java -classpath ./out ru.geekbrains.lesson1.sample.Main
 *
 *
 *
 * FROM bellsoft/liberica-openjdk-alpine:11.0.16
 * COPY ./java ./src
 * RUN mkdir ./out
 * RUN javac -sourcepath ./src -d out src/ru/geekbrains/lesson1/sample/Main.java
 * CMD java -classpath ./out ru.geekbrains.lesson1.sample.Main
 *
 *
 *C:\sources\gb\core\group1\lesson1\src\main> docker build . -t calcapp:v1.1
 *
 *
 *
 */
public class Main {

    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(4, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(4, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(4, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(4, 2);
        System.out.println(Decorator.decorate(result));
    }

}
