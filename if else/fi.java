public class fi {
    public static void main(String[] args){
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")){
            System.out.print("Executando em dev ");
        }else if (ambiente.equalsIgnoreCase("TESTE")){
            System.out.println("Executando em teste");
        }else{
            System.out.println(ambiente);
        }
    
    }
}