import java.util.Random;

public class Matrix {
	
	int[][] matArray;
	private int rows, cols;
	
	public Matrix(int rows,int cols){
		this.rows=rows;
		this.cols=cols;
		this.matArray=new int[rows][cols];
	}
	
	public int getRows(){
		return this.rows;
	}
	
	public int getCols(){
		return this.cols;
	}
	
	public void setRows(int rows){
		this.rows=rows;
	}
	
	public void setCols(int cols){
		this.cols=cols;
	}
	
	public void sdtValue(int row,int col,int val){
		this.matArray[row][col]=val;
	}
	
	public int getValue(int row,int col){
		int value=this.matArray[row][col];
		return value;
	}
	
	public void randomize(){
		int i,j;
		for(i=0;i<this.getRows();i++){
			for(j=0;j<this.getCols();j++){
				Random temp=new Random();
				this.matArray[i][j]=temp.nextInt(100);
			}
		}
	}
	
	public Matrix add(Matrix M){
		
		if(this.getRows()!=M.getRows()||this.getCols()!=M.getCols()){
			System.out.println("Error");
		}
		else{
			int i,j;
			for(i=0;i<this.getRows();i++){
				for(j=0;j<this.getCols();j++){
					this.matArray[i][j]+=M.matArray[i][j];
				}
			}
		}
		return this;
	}
	
	public Matrix transpose(){
		int i,j;
		Matrix temp=new Matrix(this.getCols(),this.getRows());
		for(i=0;i<temp.getRows();i++){
			for(j=0;j<temp.getCols();j++){
					temp.matArray[i][j]=this.matArray[j][i];
			}
		}
		this.setRows(temp.getRows());
		this.setCols(temp.getCols());
		this.matArray=temp.matArray;
		return temp;
	}
	
	public Matrix multiply(Matrix M){
		if(this.getCols()!=M.getRows()){
			System.out.println("Error");
			Matrix temp=new Matrix(this.getRows(),this.getCols());
			temp.matArray=this.matArray;
			return temp;
		}
		else{
			int i,j,k;
			int sum=0;
			Matrix temp=new Matrix(this.getRows(),M.getCols());
			for(i=0;i<this.getRows();i++){
				for(j=0;j<M.getCols();j++){
					sum=0;
					for(k=0;k<this.getCols();k++){
						sum+=this.matArray[i][k]*M.matArray[k][j];
					}
					temp.matArray[i][j]=sum;
				}
			}
			this.setCols(temp.getCols());
			this.setRows(temp.getRows());
			this.matArray=temp.matArray;
			
			return temp;
		}
	}
	
	public boolean equals(Matrix M){
		int i,j;
		if((this.getCols()==M.getCols())&&(this.getRows()==M.getRows())){
			for(i=0;i<this.getCols();i++){
				for(j=0;j<this.getRows();j++){
					if(this.matArray[i][j]!=M.matArray[i][j])
						return false;
				}
			}
			return true;
		}
		return false;
	}
	
	   public String toString() {
	         String temp = "";
	         String result = "";
	         int i;
	         int j;
	         int max = 0;
	         for (i = 0; i < this.getRows(); i++) {
	            for (j = 0; j < this.getCols(); j++) {
	               if (max < this.matArray[i][j]) {
	                  max = this.matArray[i][j];
	               }
	            }
	         }
	         for (i = 0; i < this.getRows(); i++) {
	            temp = "[ ";
	            for (j = 0; j < this.getCols(); j++) {
	               if (max >= 10000) {
	                  temp = temp + String.format("%5d ", this.matArray[i][j]);
	               }
	               else if (max >= 1000) {
	                  temp = temp + String.format("%4d ", this.matArray[i][j]);
	               }
	               else if (max >= 100) {
	                  temp = temp + String.format("%3d ", this.matArray[i][j]);
	               }
	               else if (max>=10) {
	                  temp = temp + String.format("%2d ", this.matArray[i][j]);
	               }
	               else
	            	   temp=temp+String.format("%d", this.matArray[i][j]);
	            }
	            temp = temp + "]";
	            result = result + temp + "\n";
	         }
	         
	         return result;
	   }
}
