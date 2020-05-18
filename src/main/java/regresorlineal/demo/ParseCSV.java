package regresorlineal.demo;



import com.opencsv.CSVWriter;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;



public class ParseCSV {

    //public String [] arr;

    public int contador;
    float [] datosY;
    float [] datosX;
    int linenumber;


    float [][] arr;

    public Object [] parse(String path) {
        try {

            File csvFile = new File("D:\\UFM\\Tercer_año\\Estructura  de datos\\Regresor_Lineal\\Regresor_Lineal_Simple\\"+path);
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String Line = "";
            StringTokenizer st = null;
            linenumber=0;

//            Hacer while para saber la cantidad de row y retornar n_rows
            while((Line = br.readLine()) != null){
                String [] line = Line.split(",");
                float arreglo[] = new float[2];
                arreglo[1] = Float.parseFloat(line[1]);

                arreglo[0] = Float.parseFloat(line[0]);

                // arr = Line.split(",");
                //System.out.println(arr[0] + " x y despues y" + arr[1]);
                if(linenumber == 0 ){
                    arr = new float [1][2];
                    arr[0][0] =  arreglo[0];
                    arr[0][1] =  arreglo[1];

                }else {
                    arr = append(arr,arreglo);

                }
                linenumber++;

            }

            datosY=  new float[linenumber];
            datosX = new float[linenumber];

            for (int u = 0; u<linenumber;u++){
                Line = br.readLine();

//
                datosY[u] = arr[u][0];
                datosX[u] = arr[u][1];

            }

        }catch (IOException ex){
            ex.printStackTrace();
        }

        //System.out.println(arrayY);

        //System.out.println(Arrays.toString(testY));
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(datosY));
        System.out.println(Arrays.toString(datosX));
        System.out.println(linenumber);





//        Hacer return de ambos arrays de datos
        return new Object[]{datosY,datosX} ;
    }

    public float [][] append(  float [][] arreglo, float [] arreglo2 ){

        float arreglo3 [][] = new float[arreglo.length+1][2];

        for(int i = 0; i<arreglo.length; i++){
            arreglo3[i][0] = arreglo [i][0];
            arreglo3[i][1] = arreglo [i][1];
        }

        arreglo3[arreglo.length][0] = arreglo2[0];
        arreglo3[arreglo.length][1] = arreglo2[1];


        return arreglo3;
    }

    /*public  void writeDataLineByLine() throws Exception{
        BufferedWriter br = new BufferedWriter(new FileWriter("D:\\UFM\\Tercer_año\\Estructura  de datos\\Regresor_Lineal\\Regresor_Lineal_Simple\\csvwriter.csv"));
        StringBuilder sb = new StringBuilder();

// Append strings from array
        for (float element :datosY  datosX) {
            sb.append(element);
            sb.append(",");
        }

        br.write(sb.toString());
        br.close();

    }*/

    public void pruebadasda(float[]y , float[]x){
        try{
        //BufferedWriter br = new BufferedWriter(new FileWriter("csvwriter123.csv"));
        FileWriter csvwriter = new FileWriter("Valores.csv",true);

        //StringBuilder sb = new StringBuilder();
        for(int i=0;i<y.length;i++){
            csvwriter.append(y[i]+ ",");
            csvwriter.append(x[i]+ "\n");
        }

        csvwriter.flush();
        csvwriter.close();
        //br.write(sb.toString());
        //br.close();



    }catch (IOException ex){
            ex.printStackTrace();
    }


}
}


