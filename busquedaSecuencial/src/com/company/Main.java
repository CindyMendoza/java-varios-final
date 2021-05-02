package com.company;

import java.util.Arrays;

public class Main {
//    public static int buscaMenor(int arreglo[], int indMax, int desde){
//        int indice=desde; int menor=arreglo[desde];
//        for(int k=desde;k<=indMax;k++){
//            if (arreglo[k]<menor){
//                menor=arreglo[k];indice = k;
//            }
//        }
//        return indice;
//    }
//    public static int[] seleccionDirecta(int arreglo[]){
//        int indMax=arreglo.length-1;int j; int valor;
//        for(int i=0;i<=indMax;i++){
//            j=buscaMenor(arreglo,indMax,i);
//            valor = arreglo[j];
//            arreglo[j]= arreglo[i];
//            arreglo[i]= valor;
//        }
//        return arreglo;
//    }
//    public static String muestraArreglo(int arreglo[]){
//        String cadena=""; int indMax=arreglo.length-1;
//        for (int i=0;i<=indMax;i++){
//            cadena=cadena+arreglo[i]+" ";
//        }
//        return cadena;
//    }
//    public static void main(String[] args) {
//        int arreglo[]={34,8,64,51,32,21};
//        System.out.println(muestraArreglo(arreglo));
//        arreglo=seleccionDirecta(arreglo);
//        System.out.println(muestraArreglo(arreglo));
//    }
//    public static int [] ordBurbuja(int arreglo[]){
//        boolean ordenado=false; int indMax=arreglo.length-1;int valor;
//        while(ordenado==false){
//            ordenado=true;
//            for (int i=0;i<indMax;i++){
//                if(arreglo[i]>arreglo[i+1]) {
//                    valor = arreglo[i];
//                    arreglo[i] = arreglo[i + 1];
//                    arreglo[i + 1] = valor;
//                    ordenado=false;
//                }
//            }
//            indMax=indMax-1;
//        }
//        return arreglo;
//    }
//    public static String muestraArreglo(int arreglo[]){
//        String cadena=""; int indMax=arreglo.length-1;
//        for (int i=0;i<=indMax;i++){
//            cadena=cadena+arreglo[i]+" ";
//        }
//        return cadena;
//    }
//    public static void main(String[] args) {
//        int arreglo[]={34,8,64,51,32,21};
//        System.out.println(muestraArreglo(arreglo));
//        arreglo=ordBurbuja(arreglo);
//        System.out.println(muestraArreglo(arreglo));
//    }
//    public static  int[] insercionDirecta(int arreglo[]){
//        int indMax=arreglo.length-1;int j;int valor;
//        for (int i=1;i<=indMax;i++){
//            j=i; valor=arreglo[i];
//            while(j>0 && valor< arreglo[j-1]){
//                arreglo[j]=arreglo[j-1];
//                j=j-1;
//            }
//            arreglo[j]=valor;
//        }
//        return arreglo;
//    }
//    public static String muestraArreglo(int arreglo[]){
//        String cadena=""; int indMax=arreglo.length-1;
//        for (int i=0;i<=indMax;i++){
//            cadena=cadena+arreglo[i]+" ";
//        }
//        return cadena;
//    }
//    public static void main(String[] args) {
//        int arreglo[]={34,8,64,51,32,21};
//        System.out.println(muestraArreglo(arreglo));
//        arreglo=insercionDirecta(arreglo);
//        System.out.println(muestraArreglo(arreglo));
//    }
//    public static void intercambio(int []arreglo, int i, int j){
//        int temporal = arreglo[i];
//        arreglo[i] = arreglo[j];
//        arreglo[j] = temporal;
//    }

//    public static void ordenamientoSeleccion(int[] arreglo){
//        //recorremos el arreglo de inicio a fin
//        int posMenor=0;
//        int i=0;
//        for (i=0; i<arreglo.length; i++){
//            posMenor = i;
//            for (int j=i+1; j< arreglo.length; j++){
//                if (arreglo[j]<arreglo[posMenor])
//                    posMenor = j;
//            }
//            intercambio(arreglo, i, posMenor); //posicion actual, posicion del menor elemento
//        }
//        System.out.println("Ordenamiento por selecciÃ³n");
//        imprimir(arreglo);
//    }

//    public static void ordenamientoInsercion(int[] arreglo){
//        int i=0;
//        int posMenor = 0;
//        for (i=1; i< arreglo.length; i++){
//            posMenor = i;
//            while (posMenor > 0 && arreglo[posMenor] < arreglo[posMenor-1]){
//                intercambio(arreglo, posMenor-1, posMenor);
//                posMenor = posMenor - 1;
//            }
//        }
//        System.out.println("Ordenamiento por inserciÃ³n");
//        imprimir(arreglo);
//    }

//    public static void ordenamientoBurbuja(int[] arreglo){
//        int i = 0;
//        int j = 0;
//        for (i=0; i< arreglo.length-1; i++){
//            for (j=0; j<arreglo.length-1; j++){
//                if (arreglo[j+1] < arreglo[j])
//                    intercambio(arreglo, j, j+1);
//            }
//        }
//        System.out.println("Ordenamiento burbuja");
//        imprimir(arreglo);
//
//    }

//    public static void ordenamientoRapido(int[] arreglo, int posInicial, int posFinal){
//        int posMedia = (posInicial+posFinal)/2;
//        int pivote = arreglo[posMedia];
//        int i = posInicial;
//        int j = posFinal;
//
//        while (i <= j){
//            while (pivote > arreglo[i] && i < j)
//                i++;
//            while (arreglo[j] > pivote)
//                j--;
//            if (i <= j){
//                intercambio(arreglo, i, j);
//                i++;
//                j--;
//            }
//        }
//
//        if (posInicial < j)
//            ordenamientoRapido(arreglo, posInicial, j);
//
//        if (i < posFinal)
//            ordenamientoRapido(arreglo, i, posFinal);
//    }

//    public static void imprimir(int[] arreglo){
//        for (int i=0; i<arreglo.length; i++){
//            System.out.print(arreglo[i]);
//            if (i!=arreglo.length-1)
//                System.out.print(", ");
//        }
//    }

//    public static void main(String[] args ){
//        //int arreglo[] = {10, 14, 1, 3, 52, 72, 12, 57, 23, 38};
//        int arreglo[] = {10, 14, 1, 3, 52};
//
//        System.out.println("Arreglo original: ");
//        imprimir(arreglo);
//        System.out.println();
//        //ordenamientoSeleccion(arreglo);
//        //ordenamientoInsercion(arreglo);
//        //ordenamientoBurbuja(arreglo);
//        ordenamientoRapido(arreglo, 0, arreglo.length-1);
//        System.out.println("Ordenamiento rÃ¡pido");
//        imprimir(arreglo);
//    }

    public static int pregunta4B(int[] arreglo, int indice){
        if (arreglo.length == indice) return 0;
        else{
            int elemento = 0;
            if (arreglo[indice]%3==0 && arreglo[indice]%2!=0) elemento = arreglo[indice];
            else elemento = 0;

            return elemento + pregunta4B(arreglo, indice+1);
        }
    };

    public static void pregunta4A(){
        int [] arreglo = {4, 5, 3, 7, 10, 13, 15};
        int suma = 0;
        for (int indice = 0; indice < arreglo.length; indice++){
            if (arreglo[indice]%3==0 && arreglo[indice]%2!=0)
                suma += arreglo[indice];
        }
        System.out.println(suma);

        suma = pregunta4B(arreglo, 0);
        System.out.println(suma);
    }

//    public static void pregunta5A(){
//        int [] arreglo = {4, 5, 3, 7, 10, 13, 15};
//        int suma = 0;
//
//        for (int i=0; i<arreglo.length; i++)
//            suma += arreglo[i];
//
//        System.out.println(suma);
//        ordenamientoBurbuja(arreglo);
//
//    }

//    public static void ordenamientoBurbuja(int[] arreglo){
//        int i = 0;
//        int j = 0;
//        for (i=0; i< arreglo.length-1; i++){
//            for (j=0; j<arreglo.length-1; j++){
//                if (arreglo[j+1] < arreglo[j])
//                    intercambio(arreglo, j, j+1);
//            }
//        }
//        System.out.println("Ordenamiento burbuja");
////        imprimir(arreglo);
//
//    }



//    public static void imprimir(int[] arreglo){
//        for (int i=0; i<arreglo.length; i++){
//            System.out.print(arreglo[i]);
//            if (i!=arreglo.length-1)
//                System.out.print(", ");
//        }
//    }

   

    public static int busquedaSecN(int arreglo[], int valor){
        int indMax=arreglo.length-1;
        int i=0;
        while(i<indMax && valor != arreglo[i])
            i=i+1;
        if(valor== arreglo[i])
            return i;
        else
            return -1;
    }
    public static int busquedaSecO(int arreglo[], int valor){
        int indMax=arreglo.length-1;
        int i=0;
        while(i<indMax && valor > arreglo[i])
            i=i+1;
        if(valor == arreglo[i])
            return i;
        else
            return -1;
    }
    public static String muestraArreglo(int arreglo[]){
        String cadena=""; int indMax=arreglo.length-1;
        for (int i=0;i<=indMax;i++){
            cadena=cadena+arreglo[i]+" ";
        }
        return cadena;
    }
    public static int sumadeelementosmayoresqueelultimo(int arreglo[]){
        int suma = 0;
        for (int i=0; i<arreglo.length; i++)
            if(arreglo[i]>arreglo[arreglo.length-1]){
                suma += arreglo[i];
            }
        return suma;
    }
    public static void intercambio(int []arreglo, int i, int j){
        int temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }
    public static int[] descendenteordenamientoporselección(int[] arreglo){
        int posMenor=0;
        int i=0;
        for (i=0; i<arreglo.length; i++){
            posMenor = i;
            for (int j=i+1; j< arreglo.length; j++){
                if (arreglo[j]>arreglo[posMenor])
                    posMenor = j;
            }
            intercambio(arreglo, i, posMenor);
        }

        return arreglo;
    }
    public static int sumadeinparesymayoresalpromdelarreglobucle(int arreglo[]){
        int suma2 = 0;
        for(int i=0; i<arreglo.length; i++){
            if ((i % 2 != 0)&&(arreglo[i]>promediobucle(arreglo))){
                suma2 = suma2 + arreglo[i];
            }
        }
        return suma2;
    }
    public static float promediobucle(int arreglo[]){
        int suma = 0;
        float promedio;
        for (int i=0; i<arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        promedio = suma / arreglo.length;
        return promedio;
    }
    public static float promediorecursivo(int arreglo[], int i){
        int suma =0;
        float promedio;
//        for (int i=0; i<arreglo.length; i++) {
//            suma = suma + arreglo[i];
//        }
//        if (arreglo.length>0){
//            suma = suma + arreglo[i]
//        }
        if(i < arreglo.length && i >= 0) {
            suma = suma + arreglo[i];
            promediorecursivo(arreglo, i + 1);
            System.out.println(suma);
            System.out.println(i);
//            return promediorecursivo(arreglo,i++);
            promedio = suma/arreglo.length;
            System.out.println("suma:"+suma);
            return promedio;
        }


    return 1;
//        promedio = suma / arreglo.length;
//        return promedio;
    }
    public static void main(String[] args) {
//        int arreglo[]={34,8,64,51,32,21};
//        int valor=21;
//        System.out.println(muestraArreglo(arreglo));
//        System.out.println(busquedaSecN(arreglo,valor));
//        int arreglo2[]={3,4,8,10,15,22,31};  valor=9;
//        System.out.println(muestraArreglo(arreglo2));
//        System.out.println(busquedaSecN(arreglo2,valor));
        int [] arreglo = {40, 50, 3, 7, 10, 13, 15};
//        int suma = 0;
        int suma2 = 0;
//        float promedio;
//        for (int i=0; i<arreglo.length; i++) {
//            suma = suma + arreglo[i];

//            if ((i % 2 != 0)  arreglo[arreglo.length - 1]) {
//                suma += arreglo[i];
//            }
//        }
//        promedio = suma / arreglo.length;
//        System.out.println(suma);
//        System.out.println(promedio);
//        for(int i=0; i<arreglo.length; i++){
//            if ((i % 2 != 0)&&(arreglo[i]>promedio)){
//                suma2 = suma2 + arreglo[i];
//                System.out.println(suma2);
//            }
//        }
        System.out.println(promediorecursivo(arreglo,0));
        System.out.println(promediobucle(arreglo));
        System.out.println(sumadeinparesymayoresalpromdelarreglobucle(arreglo));
//        System.out.println("sumadeinparesymayoresalpromdelarreglo: "+ sumadeinparesymayoresalpromdelarreglo(arreglo));
//        System.out.println("Arreglo ordenado de forma descendente: "+ Arrays.toString(descendenteordenamientoporselección(arreglo)));
//        System.out.println("La suma de todos los elementos mayores que el último  del arreglo es: "+sumadeelementosmayoresqueelultimo(arreglo));

    }
}
