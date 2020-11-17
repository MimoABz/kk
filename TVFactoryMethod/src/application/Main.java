package application;

public class Main {
	  public static void main(String[] arg) {
	        TVFactory factory = new TVFactory();
	        TV sonyTv = factory.produceTv(Marca.Sony, "LCD", 450, 32);           
	        TV LGTv = factory.produceTv(Marca.LG,"LED",(float) 550.99,36);    
	        TV Samsungtv = factory.produceTv(Marca.Samsung,"LCD",(float) 1100.99,62);    
	        
	        System.out.println(sonyTv);
	        System.out.println(LGTv);
	        System.out.println(Samsungtv);
	        
	        
	        
	    }
}
