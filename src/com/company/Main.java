package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    //brute force implementation
        public static void bruteForceSort(int m[]){

            for(int i=0; i<m.length-1;i++){
                int max=i;
                for(int j=i+1;j<m.length;j++){
                    if(m[max]<m[j]){
                        int tmp=m[j];
                        m[j]=m[max];
                        m[max]=tmp;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }



    public static void main(String[] args) throws IOException, InterruptedException {
        QuickSort quickSort = new QuickSort();
        RadixSort radixSort = new RadixSort();
        //creating text files
        BufferedWriter quickSortOut = new BufferedWriter(new FileWriter("quickSortTime.txt"));
        BufferedWriter radixSortOut = new BufferedWriter(new FileWriter("radixSortTime.txt"));
        BufferedWriter bruteForceOut = new BufferedWriter(new FileWriter("bruteForceSortTime.txt"));

        int array5[] = new int[5];
        int array10[] = new int[10];
        int array30[] = new int[30];
        int array50[] = new int[50];
        int array100[] = new int[100];
        int array200[] = new int[200];
        int array500[] = new int[500];
        int array700[] = new int[700];
        int array850[] = new int[850];
        int array1000[] = new int[1000];

        for (int i=0; i<array5.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array5[i] = randomNumber;
        }

        for (int i=0; i<array10.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array10[i] = randomNumber;

        }

        for (int i=0; i<array30.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array30[i] = randomNumber;

        }

        for (int i=0; i<array50.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array50[i] = randomNumber;

        }

        for (int i=0; i<array100.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array100[i] = randomNumber;

        }

        for (int i=0; i<array200.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array200[i] = randomNumber;

        }


        for (int i=0; i<array500.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array500[i] = randomNumber;

        }

        for (int i=0; i<array700.length; i++){

            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array700[i] = randomNumber;
        }

        for (int i=0; i<array850.length; i++){

            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array850[i] = randomNumber;
        }

        for (int i=0; i<array1000.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array1000[i] = randomNumber;

        }

        //quick sort function callings

        long startTime = System.currentTimeMillis();
        quickSort.sort(array5);
        long endTime = System.currentTimeMillis();
        long operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array10);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array30);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array50);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array100);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array200);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array500);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array700);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array850);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

        startTime = System.currentTimeMillis();
        quickSort.sort(array1000);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        quickSortOut.write(operationTime+"\n");
        quickSortOut.newLine ();

         quickSortOut.close();

//brute-force sort function callings

        startTime = System.currentTimeMillis();
        bruteForceSort(array5);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array10);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array30);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array50);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array100);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array200);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array500);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array700);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array850);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        startTime = System.currentTimeMillis();
        bruteForceSort(array1000);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bruteForceOut.write(operationTime+"\n");
        bruteForceOut.newLine ();

        bruteForceOut.close();
//generating 8-digit numbers for each array which are going to be used by radix sort
        for (int i=0; i<array5.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array5[i] = randomNumber;
        }

        for (int i=0; i<array10.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array10[i] = randomNumber;

        }

        for (int i=0; i<array30.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array30[i] = randomNumber;

        }

        for (int i=0; i<array50.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array50[i] = randomNumber;

        }

        for (int i=0; i<array100.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array100[i] = randomNumber;

        }

        for (int i=0; i<array200.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array200[i] = randomNumber;

        }


        for (int i=0; i<array500.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array500[i] = randomNumber;

        }

        for (int i=0; i<array700.length; i++){

            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array700[i] = randomNumber;
        }

        for (int i=0; i<array850.length; i++){

            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array850[i] = randomNumber;
        }

        for (int i=0; i<array1000.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(90000000) + 10000000;
            array1000[i] = randomNumber;

        }
        startTime = System.currentTimeMillis();
        radixSort.sort(array5);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array10);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array30);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array50);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array100);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
       radixSortOut.write(operationTime+"\n");
       radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array200);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array500);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array700);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array850);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();

        startTime = System.currentTimeMillis();
        radixSort.sort(array1000);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        radixSortOut.write(operationTime+"\n");
        radixSortOut.newLine ();


         radixSortOut.close();


    }
}
