package ModulTwo;

public class Script {
    public String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder finalText = new StringBuilder();
        for (String role : roles) {
            int number = 1;
            finalText.append(role);
            finalText.append(":");
            for (String line : textLines) {
                if (line.startsWith(role + ":")) {
                    line = line.replaceFirst(role + ":", "\n" + number + ")");
                    finalText.append(line);
                }
                number++;
            }
            finalText.append("\n\n");
        }
        String result = finalText.toString();
        return result;
    }
}
