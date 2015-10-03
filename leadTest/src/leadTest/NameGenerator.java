package leadTest;

public class NameGenerator {
	
		
		
		public String generateRandomName() {

			StringBuffer buffer = new StringBuffer();
			String characters = "";

			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			int charactersLength = characters.length();

			for (int i = 0; i < 6; i++) {
				double index = Math.random() * charactersLength;
				buffer.append(characters.charAt((int) index));
			}
			return buffer.toString();
		}
	

}