package Problem20;

public class ClockWisePrintMatrix {
	public static void main(String[] args){
		ClockWisePrintMatrix clock = new ClockWisePrintMatrix();
//		int [][] matrix = {{1},{3},{5}};
//		int [][] matrix = {{1,2,3}};
		int [][] matrix = {{2,3,4},{4,5,6}};
//		int [][] matrix = {{1,2},{3,4},{5,6}};
		clock.printMatrixClockWise(matrix, 2, 3, 0, 0);
	}
	private boolean first = true;
	
	public void printMatrixClockWise(int [][] matrix,int row,int column,int startRow,int startColumn){
	     int rowIndex = startRow;
	     int columnIndex = startColumn;
	     int tempRow = row;
	     int tempCol = column;
	     int actualRow = matrix.length;
	     int actualCol = matrix[0].length;
	     if(first){
	    	 first = false;
	    	 if(actualRow!=row||actualCol != column){
	    		 System.out.println("row or column data is wrong");
	    		 return;
	    	 }
	     }
	     if(matrix == null)
	          return;
	     if(row <=0 || column <= 0 || startRow < 0 || startColumn < 0)
	          return;
	     
	         while(tempCol >0&&tempRow>0){
	     
	         for( int j = columnIndex; j<column; j++){
	               System.out.println(matrix[rowIndex][j]);
	               columnIndex = j;
	          }
	          rowIndex++;
	          tempRow--;
	          if(row-startRow>1){
	          for(int i = rowIndex; i < row; i++){
	               System.out.println(matrix[i][columnIndex]);
	               rowIndex = i;
	          }
	          tempCol--;
	          }
	          columnIndex--;
	          if(column - startColumn > 1&&row-startRow>1){
	          for(int k = columnIndex;k>=startColumn;k--){
	               System.out.println(matrix[rowIndex][k]);
	               columnIndex = k;     
	          }
	          tempRow--;
	          }
	          rowIndex--;
	          if(row - startRow >2 && column -startColumn >1){
	          for(int m = rowIndex; m>startRow; m--){
	               System.out.println(matrix[m][columnIndex]);
	          }
	          tempCol--;
	          }
	     } 
	     
	     printMatrixClockWise(matrix,tempRow,tempCol,startRow++,startColumn++);
	 
	}
	     


}
