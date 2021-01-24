package exeptions.example5;

public class CustomExeptionMain {

    public static void main(String[] args) {
        try{
            siuskSaskaitaIBanka();
        } catch (FiledToSendInvoiceExeption ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void siuskSaskaitaIBanka() throws FiledToSendInvoiceExeption {
        System.out.println("Siunciu saskiata");

        boolean kazkasBlogo = true;

        if(kazkasBlogo){
            throw new FiledToSendInvoiceExeption("Saskaita neissiusta");
        }
    }
}
