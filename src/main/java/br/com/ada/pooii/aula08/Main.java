package br.com.ada.pooii.aula08;

public class Main {
    public static void main(String[] args) {

        Multifunction advanced = new AdvancedPrinter();
        EconomicPrinter economic = new EconomicPrinter();

        advanced.copy("from advanced");
        advanced.fax("from advanced");
        advanced.print("from advanced");
        advanced.scan("from advanced");

        economic.copy("from economic");
        economic.print("from economic");
    }



}
