
public class Vector extends Matrix{
	private int dim;
	
	public Vector(int dim){
		super(1,dim);
		this.dim=dim;
	}
	
	public int getDim(){
		return this.dim;
	}
	
	public Matrix multiply(Matrix M){
		M.transpose();
		return super.multiply(M);
	}
}
