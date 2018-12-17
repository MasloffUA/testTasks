

public class Matches {

	public static void main(String[] args) {
		if (args.length>0) {
			int quantityQuads = Integer.parseInt(args[0]);
			int collumns = (int) Math.ceil(Math.sqrt(quantityQuads));
			int rows = (int) Math.ceil( (float) quantityQuads/collumns);
			int rez = (int) (quantityQuads*2 + rows +collumns);
			System.out.println(rez);	
		}
	}
}


