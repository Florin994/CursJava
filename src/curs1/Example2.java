package curs1;

public class Example2 {
    public static void main(String[] args) {
        String titluCarte = "Harry Potter";
        String autor = "J.K. Rowling";
        int numarPagini = 387;
        double pret = 59.99;
        System.out.println("Am cumparat cartea " + titluCarte + " scrisa de " + autor + ", care are " + numarPagini
                + " pagini, si costa " + pret + " lei");
        System.out.printf("Am cumparat cartea %s scrisa de %s care are %d pagini, si costa %.0f lei%n",titluCarte,autor,numarPagini,pret);
        System.out.println("Hello!");
    }
}
