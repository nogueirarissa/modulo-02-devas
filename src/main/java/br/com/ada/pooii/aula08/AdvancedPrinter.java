package br.com.ada.pooii.aula08;

public class AdvancedPrinter implements Multifunction {

    @Override
    public void print(String msg) {
        System.out.println("Priting..." + msg);
    }

    @Override
    public void scan(String msg) {
        System.out.println("Scanning..." + msg);
    }

    @Override
    public void copy(String msg) {
        System.out.println("Copying..." + msg);
    }

    @Override
    public void fax(String msg) {
        System.out.println("Faxing..." + msg);
    }
}
