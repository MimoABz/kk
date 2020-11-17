package application;


public class TVFactory {

	
	public TV produceTv(Marca r,String t,float p,int d) {
		TV product= null;
		switch (r) {
		case LG:
			product=new LG(d,p,t);
			break;
		case Sony:
			product=new Sony(d,p,t);
			break;
		case Samsung:
			product=new Samsung(d,p,t);
			break;
		
		}
		
		return product;
		}
}
