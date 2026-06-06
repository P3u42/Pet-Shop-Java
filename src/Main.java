import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);
    static CleanMachine machine =  new CleanMachine();
    static void main(String[] args) {



        var option = -1;
        boolean hasExited = false;
        do{
            System.out.println("Ecolha uam das seguintes opçoes para a maquina de lavar:");
            System.out.println("1-Dar banho no pet");
            System.out.println("2-Abastecer maquina com shampoo");
            System.out.println("3- Abastecer maquina com água");
            System.out.println("4-Verificar nivel de água");
            System.out.println("5-Verificar nivel de shampoo");
            System.out.println("6-Verificar se tem pet na maquina");
            System.out.println("7-Colocar pet na maquina");
            System.out.println("8-Retirar pet na maquina");
            System.out.println("9-Limpar maquina");
            System.out.println("10-Sair");
            option =sc.nextInt();

            switch (option){
                case 1:
                    machine.takeShowerInPet();
                    break;
                case 2:
                    machine.addShampoo();
                    break;
                case 3:
                    machine.addWater();
                    break;
                case 4:
                    machine.getWaterAmount();
                    break;
                case 5:
                    System.out.printf("Shampoo: %s",machine.getShampoo());

                    break;
                case 6:
                    System.out.printf("A maquina está com o pet?: %s", machine.hasPet());

                    break;
                case 7:
                    setPet();
                    break;
                case 8:
                    machine.getPetOut();
                    break;
                case 9:
                    machine.cleanMachine();
                    break;
                case 10:
                    System.out.println("Você saiu da maquina, obrigado!");
                    hasExited = true;
                    break;



            }

        }while (hasExited==false);







    }
    public static void setPet(){
        System.out.println("Informe o nome do pet!");
        var name = sc.next();
        System.out.println("O seu pet está limpo? (True/False)!");
        var isClean = sc.nextBoolean();
        var pet =  new Pet(name,isClean);
        machine.setPet(pet);
    }
}
