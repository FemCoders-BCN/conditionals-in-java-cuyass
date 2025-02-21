import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        Scanner scanner = new Scanner(System.in);

        System.out.println("Te damos la bienvenida a la mini trivia de F5.\nEl juego consta de 4 preguntas de mútliple respuesta.\nPara responder, solo tienes que escribir la letra de la respuesta correcta.\n¿Empezamos?");

        int score = 0;

        System.out.println("Pregunta 1\n¿Quién fue la hacker que escribió en 1994 'Hacking the Wetware'?");
        System.out.println("\ta. Ada Lovelace\n\tb. Jude Milhon\n\tc. Martha Ackelsberg\n\td. Jane Jacobs");

        String q1 = scanner.nextLine();
        String q1Ok = "b";

        if(q1.equals(q1Ok)) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("Pregunta 2\n¿Quién es Fuencisla Clemares?");
        System.out.println("\ta. La directora general de IBM Europa, Oriente Medio y África\n\tb. La vicepresidenta de Microsoft Western Europe\n\tc. La directora general de Google en España y Portugal\n\td. Fundadora y CEO de Marsi Bionics");

        String q2 = scanner.nextLine();
        String q2Ok = "c";

        if(q2.equals(q2Ok)) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("Pregunta 3\n¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr? (tienes que escoger dos respuestas correctas)");
        System.out.println("\ta. Primera programadora de software\n\tb. Una actriz de cine\n\tc. Inventora del procesador de datos\n\td. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");

        String q3 = scanner.nextLine();
        String q3Ok = "b y d";

        if(q3.equals(q3Ok)) {
            score += 5;
        } else {
            score += 0;
        }

        System.out.println("Pregunta 4\n¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("\ta. Katherine Johnson, Dorothy Vaughan y Mary Jackson\n\tb. Jessica Miller, Emily Johnson, Sarah Davis\n\tc. Bell Hooks, Toni Morrison y Alice Walker\n\td. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");

        String q4 = scanner.nextLine();
        String q4Ok = "a";

        if(q4.equals(q4Ok)) {
            score += 5;
        } else {
            score += 0;
        }

        if(score >= 15) {
            System.out.println("Tú sí que sabes mucho");
        } else if((score < 15) && (score >= 5)) {
            System.out.println("No lo has hecho mal");
        } else if(score < 5) {
            System.out.println("Buena suerte la próxima vez");
        }
        //Preguntas:
        /* 1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?
                a. Ada Lovelace
                b. Jude Milhon
                c. Martha Ackelsberg
                d. Jane Jacobs
            
            2. ¿Quién es Fuencisla Clemares?
                a. La directora general de IBM Europa, Oriente Medio y África
                b. La vicepresidenta de Microsoft Western Europe
                c. La directora general de Google en España y Portugal
                d. Fundadora y CEO de Marsi Bionics
            
            3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?
                a. Primera programadora de software
                b. Una actriz de cine
                c. Inventora del procesador de datos
                d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS
            
            4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?
                a. Katherine Johnson, Dorothy Vaughan y Mary Jackson
                b. Jessica Miller, Emily Johnson, Sarah Davis
                c. bell hooks, Toni Morrison y Alice Walker
                d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman
        */

        //Respuestas: 1. b / 2. c / 3. b y d / 4. a

        scanner.close();
    }
    
}