import java.util.Objects;

/**
 * Represents human.
 *
 * @author dagmarakitkowska@gmail.com
 * @since 07.12.2019
 */
public class Human {
    /* Utwórz klasę Human reprezentującą człowieka,
     musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć.
     Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale.
     Wygenerujcie do tego metodę toString i w klasie głównej utwórzcie jakiś obiekt tej klasy oraz wywołajcie metodę toString
     */

    private int age;
    private int weight;
    private int height;
    private String name;
    private boolean isMale;

    public void Human(String name, int age, int weight, int height, boolean isMale){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
    }

    public int getAge() {
        Objects.requireNonNull(age);
        return age;
    }

    public int getWeight() {
        Objects.requireNonNull(weight);
        return weight;
    }

    public int getHeight() {
        Objects.requireNonNull(height);
        return height;
    }

    public String getName() {
        Objects.requireNonNull(name);
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Human: " +
                "(name)'" + name +
                "(age)" + age +
                "(weight)" + weight +
                "(height)" + height +
                "(sex)" + isMale;
    }

}
