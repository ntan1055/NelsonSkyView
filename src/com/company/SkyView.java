package com.company;

public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int i = 0;
        for(int row = 0; row < numRows; row++)
        {
            if(row % 2 == 0)
            {
                for(int col = 0; col < numCols; col++)
                {
                    view[row][col] = scanned[i];
                    i++;
                }
            }
            else
            {
                for(int col = numCols - 1; col >= 0; col--)
                {
                    view[row][col] = scanned[i];
                    i++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0.0;
        int count = 0;
        for(int i = startRow; i <= endRow; i++)
        {
            for(int j = startCol; j <= endCol; j++)
            {
                sum += view[i][j];
                count++;
            }
        }
        double average = sum / count;
        return average;
    }
}
