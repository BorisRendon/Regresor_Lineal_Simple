package regresorlineal.demo;

public class Arrays {

    float size;
    float []array;
    int contador;



    int sum=0;

    public Arrays(){
        this.size=size;
        this.array=array;


    }
    public float [] getArray(){
        return this.array;

    }


    public int incremento(){
        contador++;
        return contador;
    }

    public int  size(int   sizee){

        array=new float[sizee];
        size = sizee;
        System.out.println("El size del dataset es : " +sizee);

        return sizee;


    }






    public float media(float data[], int n){

        float sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + data[i];
        }

        return  sum/n;
    }

    public float covarianza(float dataY[], float dataX[],int n){
        float sum = 0;
        for(int i=0;i<n;i++){
            sum = sum +(dataY[i] - media(dataY,n)) * (dataX[i] - media(dataX,n));


        }
        //System.out.println(n);
        return  sum/(n);
    }

    public float varianza(float dataX[], int n){
        float sum = 0;
        for(int i =0;  i <n; i++){
            sum = sum  + ((dataX[i] -media(dataX,n))) * ((dataX[i] -media(dataX,n)));

        }
        return sum/n;


    }



    public float [] llenarArray(float  dato1){

        array[contador] = dato1;
        incremento();


        return array;
        }

        public void imprimir(){
            for(int i =0;i<array.length;i++){
                System.out.println(array[i]);
            }
        }






    }




