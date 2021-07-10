package ExercicioList;



import java.util.Iterator;
import java.util.LinkedList;


public class ExercicioList {
    public static void main(String[] args) {


/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        */System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        LinkedList nota2 = new LinkedList();
        nota2.add(5.7);
        nota2.add(8.9);
        nota2.add(5.1);
        nota2.add(2.3);
        nota2.add(9.4);
        nota2.add(5.0);

        Iterator iterator = nota2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + nota2.get(0));



        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + nota2.remove(0));
        System.out.println("Removido primeira Nota: " + nota2);





    }

}


