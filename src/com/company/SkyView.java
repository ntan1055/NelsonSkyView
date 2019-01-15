package com.company;

public class SkyView
{
    private double[][] view;
    private int numRows;
    private int numCols;
    private double[] scanned;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double average;
        double sum = 0;
        int count = 0;
        for(int i = startRow; i < endRow; i++)
        {
            for(int j = startCol; j < endCol; j++)
            {
                sum = sum + view[i][j];
                count = count + 1;
            }
        }
        average = sum / count;
        return average;
    }
}
