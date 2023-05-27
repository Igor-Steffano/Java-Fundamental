public class App {

    //Variavel sempre com "camelCase"

    public static void main (String[] args){
        String firstName = "Igor Steffano";
        String lastName = "Viana Alves";

        String fullName = fullName (firstName, lastName);
        System.out.println(fullName);

    }

    //Criação do corpo do método

    public static String fullName (String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
    
}
