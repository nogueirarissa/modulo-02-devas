package br.com.ada.pooii.aula08;

public class EconomicPrinter implements Economic {

    @Override
    public void copy(String msg) {
        System.out.println("Copying..." + msg);
    }

    /*@Override
    public void sendFax(String msg) {
        System.out.println("Enviando um fax ...");
    }*/

    @Override
    public void print(String msg) {
        System.out.println("Printing..." + msg);
    }

    /*@Override
    public void scan(String msg) {
        System.out.println("Scaneando economico...");
    }*/
}
