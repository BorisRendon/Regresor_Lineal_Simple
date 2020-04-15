package regresorlineal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {
    //public Arrays Y = new Arrays(10,)
    //Arrays
    public Arrays Y = new Arrays();
    public Arrays X = new Arrays();

    @RequestMapping("/size")
    public int sizeof(int sizee) {
        Y.size(sizee);
        X.size(sizee);

        return sizee;
    }

    @RequestMapping("/llenar")
    public int llenardatos(int datoY, int datoX) {
        Y.llenarArray(datoY);
        X.llenarArray(datoX);
        return datoY & datoX;

    }
    @RequestMapping("/regresion")
    public String B1_B0(){
        float covarianza = X.covarianza(X.getArray(),Y.getArray(),X.getArray().length);
        float varianza = X.varianza(X.getArray(),X.getArray().length);
        float Beta1 = covarianza/varianza;

        System.out.println("El resultado de B0 es de: " + Beta1);

        float mediaY =  X.media(Y.getArray(),Y.getArray().length);
        float mediaX =  X.media(X.getArray(),X.getArray().length);

        float Beta0 =  mediaY - Beta1*mediaX;

        System.out.println("El resultado de B0 es de " + Beta0);

        System.out.println("La media de X es:" + mediaX);

        System.out.println("La media de Y es:" + mediaY);

        String resultadoregresion = "El resultado de la regresion lineal es de: "+"y =" + Beta1 + "+" + Beta0;

        return resultadoregresion;
    }




    @RequestMapping("/show")
    public void show() {
        Y.imprimir();
        X.imprimir();

    }


    //*
    //Fin arrays

    //Inicio Hashmaps

    /*public Hashmaps data = new Hashmaps();
    @RequestMapping("/fillHash")
    public void fill(Integer X, Integer Y){
        data.llenarHashmap(X,Y);
    }

    @RequestMapping("/printHash")
    public void printHash(){
        data.imprimir();
    }

    /*@RequestMapping("/sumaHash")
    public void sumaHash(){
        data.suma();
    }
    */



    public static void main(String[] args) {
       SpringApplication.run(DemoApplication.class, args);


    }

}
