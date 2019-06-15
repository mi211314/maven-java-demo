package com.java.demo.chapter5.sample10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: Sample10
 *
 * @Date: 2018/9/18 07:33
 */
public class Sample10 {

    private static final Logger logger = LoggerFactory.getLogger(Sample10.class);

    private double[] theArray;

    private int nElems;

    public Sample10(int max) {
        theArray = new double[max];
        nElems = 0;
    }

    public void insert(double value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() {
        logger.info("A={}", theArray);
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            double pivot = theArray[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private int partitionIt(int left, int right, double pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (theArray[++leftPtr] < pivot) {

            }
            while (rightPtr > 0 && theArray[--rightPtr] > pivot) {

            }
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, rightPtr);
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {
        double temp = theArray[dex1];
        theArray[dex1] = theArray[dex2];
        theArray[dex2] = temp;
    }

}
