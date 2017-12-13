
public class SquareMatrix extends Matrix{
	private int dim;
	
	public SquareMatrix(int dim){
		super(dim,dim);
		this.dim=dim;
	}
	
	public int getDim(){
		return this.dim;
	}
	
	public boolean isDiagonal(){
		int i,j;
		for(i=0;i<this.getDim();i++){
			for(j=0;j<this.getDim();j++){
				if(this.matArray[i][j]!=0&&i!=j)
					return false;
			}
		}
		return true;
	}
	
	public SquareMatrix identity(){
		int i,j;
		SquareMatrix temp=new SquareMatrix(this.getDim());
		for(i=0;i<this.getDim();i++){
			for(j=0;j<this.getDim();j++){
				if(i==j)
					temp.matArray[i][j]=1;
				else
					temp.matArray[i][j]=0;
			}
		}
		return temp;
	}
}
