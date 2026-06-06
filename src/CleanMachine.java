public class CleanMachine {
    private  boolean isClean;

    private int waterAmount;

    private  int shampoo;

    private Pet pet;

    public void takeShowerInPet(){

        if(this.pet==null){
            System.out.println("Coloque o pet na maquina para o banho!");
            return;
        }
        this.waterAmount -=10;
        this.shampoo -=2;
        pet.setClean(true);
        System.out.printf("O pet %s está limpo",pet.getNAME());
    }
    public void addWater(){

        if(waterAmount == 30){
            System.out.println("A maquina já está cheia de agua !");
            return;
        }
            waterAmount +=2;
            System.out.println("Agua reposta!");


    }
    public void addShampoo(){

        if(waterAmount == 10){
            System.out.println("A maquina já está cheia de shampoo !");
            return;
        }

       shampoo +=2;
        System.out.println("Shampoo reposto!");


    }

    public int getWaterAmount() {
        if(waterAmount<=0){
            waterAmount =0;
        }
        return waterAmount;
    }

    public int getShampoo() {
        if(shampoo<=0){
            shampoo =0;
        }
        return shampoo;
    }



    public boolean hasPet(){
        return pet !=null;
    }

    public void setPet(Pet pet) {
        if(!this.isClean){
            System.out.println("A máquina está suja, para usar deve-se limpa-la");
            return;
        }
        if(hasPet()){
            System.out.printf("O pet %s está na maquina!",pet.getNAME());
            return;
        }
        this.pet = pet;
    }
    public void getPetOut(){
        this.isClean = this.pet.isClean();
        System.out.printf("O pet %s foi retirado com sucesso\n!",pet.getNAME());
        this.pet =null;

    }
    public void cleanMachine(){
        if(isClean==true){
            System.out.println("A maquina já está limpa!");
            return;
        }
        waterAmount -=3;
        shampoo-=1;
        this.isClean =true;
        System.out.println("A maquina está limpa e pronta para uso!");

    }
}
