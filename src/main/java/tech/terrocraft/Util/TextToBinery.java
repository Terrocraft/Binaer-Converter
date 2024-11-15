package tech.terrocraft.Util;

public class TextToBinery {

    private String Text;
    private String Char0 = "0";
    private String Char1 = "1";
    private Boolean Convert = false;

    public TextToBinery setText(String text) {
        Text = text;
        return this;
    }
    public TextToBinery setconvert(Boolean convert) {
        Convert = convert;
        return this;
    }
    public TextToBinery setchars(String char0, String char1) {
        Char0 = char0;
        Char1 = char1;
        return this;
    }
    private static String output;

    public String build(){
        output = toBinary(Text);

        if (Convert) {
            output = output.replace("0", Char0).replace("1", Char1);
        }
        return output;
    }

    private static String toBinary(String input) {
        StringBuilder binaryBuilder = new StringBuilder();
        for (char character : input.toCharArray()) {
            String binary = String.format("%8s", Integer.toBinaryString(character)).replace(' ', '0');
            binaryBuilder.append(binary);
        }
        return binaryBuilder.toString().trim();
    }

}
