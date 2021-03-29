package challenge.algorithms.recursion;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'passwordCracker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY passwords
     *  2. STRING loginAttempt
     */
	public static String wrongPassword = "WRONG PASSWORD";
	
	public static Set<String> setInvalid;
	

	public static String passwordCracker(List<String> passwords, String loginAttempt) {
    	if (setInvalid.contains(loginAttempt)) {
    		return Result.wrongPassword;
    	} else if (loginAttempt.isEmpty()) {
    		return "";
    	} 
    	
    	for (String password : passwords) {
    		int length = password.length();
    		if (length > loginAttempt.length()) {
    			continue;
    		}
    		
    		String subString = loginAttempt.substring(0, length);
    		
    		if (password.equals(subString)) {

    			String result = passwordCracker(passwords, loginAttempt.substring(length, loginAttempt.length()));
			
				if (result.equals(Result.wrongPassword)){
					continue;
				} else { 
					if (result.isEmpty()) {
						return password; 
					} else {
						return password + " " + result;
					}
				}
    		}
    	}
    	
    	setInvalid.add(loginAttempt);
    	
    	return Result.wrongPassword;
    }
}


public class PasswordCracker {
	public static void main(String[] args) throws IOException {
    	String fileIn = "data/input.txt";
    	String fileOut = "data/output.txt";
    	
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> passwords = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                		.collect(toList());

                String loginAttempt = bufferedReader.readLine();
                
                //-------------------------------------------------
                Result.setInvalid = new HashSet<String>();
                String result = Result.passwordCracker(passwords, loginAttempt);
                //-------------------------------------------------
                
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
