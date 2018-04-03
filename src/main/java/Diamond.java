public class Diamond {

    private int diamondSize;
    private StringBuilder diamondOutput;
    private final String ASTERISK = "*";
    private final String SPACE = " ";
    private final String NEWLINE = "\n";

    Diamond(int diamondSize) {
        this.diamondSize = diamondSize;
        diamondOutput = new StringBuilder();
    }

    public String getDiamond() {
        return diamondOutput.toString();
    }

    public void buildDiamond() {

        String upperLines = generateLinesAboveMiddleLine();
        diamondOutput.append(upperLines);

        String middleLine = generateMiddleLine();
        diamondOutput.append(middleLine);

        String lowerLines = generateLinesBelowMiddleLine();
        diamondOutput.append(lowerLines);

    }

    private String generateMiddleLine() {
        StringBuilder middleLine = new StringBuilder();

        for (int i=0; i<diamondSize; i++) {
            middleLine.append(ASTERISK);
        }
        middleLine.append(NEWLINE);

        return middleLine.toString();
    }

    private String generateLinesBelowMiddleLine() {
        StringBuilder downwardsLines = new StringBuilder();

        int numberOfLinesInBottomHalf = Math.round(diamondSize/2);

        int spaces = 1;
        int asterisks = diamondSize - 2;

        for (int i=0; i<numberOfLinesInBottomHalf; i++) {

            for (int k=0; k<spaces; k++) {
                downwardsLines.append(SPACE);
            }

            spaces = spaces + 1;

            for (int p=0; p<asterisks; p++) {
                downwardsLines.append(ASTERISK);
            }

            asterisks = asterisks - 2;

            downwardsLines.append(NEWLINE);
        }

        return downwardsLines.toString();
    }


    private String generateLinesAboveMiddleLine() {
        StringBuilder upwardsLines = new StringBuilder();

        int numberOfLinesInTopHalf = Math.round(diamondSize/2);

        int spaces = (diamondSize - 1) / 2;
        int asterisks = 1;

        for (int i=0; i<numberOfLinesInTopHalf; i++) {

            for (int k=0; k<spaces; k++) {
                upwardsLines.append(SPACE);
            }

            spaces = spaces - 1;

            for (int p=0; p<asterisks; p++) {
                upwardsLines.append(ASTERISK);
            }

            asterisks = asterisks + 2;

            upwardsLines.append(NEWLINE);
        }

        return upwardsLines.toString();
    }
}
