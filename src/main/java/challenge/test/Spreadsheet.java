package challenge.test;

public class Spreadsheet {
	public static String columnTitle(int number) {
	    // String result = ""; 

	    // while (number > 0){
	    //     int b = number % 26;
	    //     int index = 64 + b;
	    //     if (index != 64){
	    //         result = Character.toString ((char) index) + result;
	    //     } else {
	    //         result = Character.toString ((char) (64 + 26)) + result;
	    //     }

	    //     number = (number - b) / 26;
	    // }
	    
	    // return result; 
		
		int temp;
		int column = number;
		String letter = "";
		while (column > 0) {
			temp = (column - 1) % 26;
			letter = Character.toString((char) (temp + 65)) + letter;
			column = (column - temp - 1) / 26;
		}

		return letter;
	}
	
	public static String columnTitle2(int number) {
		int n = number;
		int q = n, r = 0;
		StringBuilder column = new StringBuilder();
		while (q > 0) {
			r = q % 26;
			if (r == 0) {
				column.append('Z');
				q = q / 26 - 1;
			} else {
				column.append((char) (r + 64));
				q = q / 26;
			}
		}

		return column.reverse().toString();
	}

	public static int letterToColumn(String letter) {
		int column = 0;
		int length = letter.length();
		
		for (int i = 0; i < length; i++) {
			column += (letter.charAt(i) - 64) * Math.pow(26, length - i - 1);
		}

		return column;
	}
	
	
	public static void main(String[] args) {
		System.out.println(columnTitle(28));
		System.out.println(letterToColumn("AA"));
	}
}
